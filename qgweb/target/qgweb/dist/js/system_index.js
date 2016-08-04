/**
 * bug: 1. 修改框弹出来之后点击确认后，那个框没有消失
 */
var URL_GET_SYSTEM = '/system/all_system';
var URL_MODIFY_SYSTEM = 'http://gg.cn';
// var URL_DELETE_SYSTEM = '/system/' + num + '/delete';
// Mock.mock(URL_GET_SYSTEM, {
//     "result":{
//         "status":200,
//         "data":[
//             {"id":1,"name":"系统1","description":"系统1"},
//             {"id":2,"name":"系统2","description":"系统2"}
//         ],
//         "message":null
//      }
//   });
// Mock.mock(URL_MODIFY_SYSTEM, {
//     "status": 2000
//   });
// Mock.mock(URL_DELETE_SYSTEM,{
//     "status": 400
// });

function Popup (){};
Popup.prototype.show = function(condition, message, time){
    if(condition){
        var _this = this;
        console.info(_this);
        var parent =  document.getElementById("popup");
        var target = document.getElementById("popup_area");
        if(parent === null){
            parent = document.createElement('div');
            parent.setAttribute('id','popup');
            document.body.appendChild(parent);
        }
        if(target === null){
            target = document.createElement('div');
            target.setAttribute('id','popup_area');
            parent.appendChild(target);
        }

        target.innerHTML = "<div id='temp_left'></div><div id='temp_right'></div>"+"<p>"+message+"</p>";
        parent.style.display = "block";
        target.addEventListener("click", function(event){
            event.stopPropagation();
        });
        parent.addEventListener("click", function(event){
            _this.disappear();
        });
        setTimeout("disappear()", time);
    }
};
Popup.prototype.disappear = function(){
    var parent = document.getElementById("popup");
    parent.style.display = "none";
};

var handler = {
    num : 5, //暂时未使用
    temp: {},
    delectSystem: function(event){
        var num = $(event.target).prevAll("h3").children('a').attr('href').split('/')[2];
        // this._changeCancelName(event);   // 删除按钮的取消功能，现在先不做这项，因为如果一不小心按了很多个删除呢
        $.ajax({
            data: '',
            type: 'delete',
            url: '/system/1/' + num ,
            dataType: 'json',
            contentType: 'application/json',
            success: function(data) {
                console.info(data);
                if(data.status === 400){  // 删除成功
                    $(event.target).parents('li').remove();
                }else{
                    alert(data.message);
                }
            },
            error: function(data){
                 handler.info("[system error]/system/delete错误");
            }
        });
    },
    _changeCancelName: function(event){
        var target = event.target || window.srcElement;
        target.innerText = '取消' + num + 's';
        handler.num--;
        if(handler.num > 0){
            setTimeout('handler._changeCancelName('+ event +')', 1000);
        }else{
            handler.num = 5;
        }
    },
    tumpItfPage: function(event){
        var target = $(event.target);
        var num = target.attr('href').split('/')[2];
        // 将号码放进客户端存储里面,和系统名称和称呼
        // 这里应该可以利用作用域优化
        handler._strogage.setItem("sy_id", num);
        handler._strogage.setItem("sy_name", target.text());
        handler._strogage.setItem("sy_desc", target.parent().next().text());
    },
    _strogage: {
        s : window.localStorage, // 之后这里可以优化的。
        setItem: function(key, value){
            this.s.setItem(key, value);
        }
    },
    _changeEle: function(){
        var temp = handler.temp;
        temp.sy_name = $('#system_name').val();
        temp.sy_desc = $('#system_description').val();
        $('#system_' + handler.temp.sy_id).find('.system_href').text(temp.sy_name);
        $('#system_' + handler.temp.sy_id).find('p').text(temp.sy_desc);
    },
    _bindPopup: function(){
        // 绑定事件
        $('#system_cancel').click(function (event) {
            Popup.prototype.disappear();
        });
        $('#system_submit').click(function (event){
            $.ajax({
                url: URL_MODIFY_SYSTEM,
                type: 'post',
                data: $('#modify_system').serialize(),
                dataType: 'json',
                success: function(data){
                    if(data.status === 2000){
                        // 修改成功之后渲染页面，同时修改handler的temp。
                        handler._changeEle();
                        Popup.prototype.disappear();
                    }else{
                        // 修改失败，出错处理是？再来一个弹出框？？
                        console.info('[ajax error]返回状态为5000 in the system_submit _bindPopup');
                    }
                },
                error: function(data){
                    console.info('[ajax error]ajax失败in the system_submit _bindPopup');
                }
            });
        });
    },
    modifySystem: function(event){
        var $parent = $(event.target).parent(); //获取到li节点
        this.temp.sy_id = $parent.find('a').attr('href').split('/')[2];
        this.temp.sy_name = $parent.find('a').text();
        this.temp.sy_desc = $parent.find('p').text();
        // 插入字符串
        var popup = new Popup();
        popup.show(true, this._renderForm(this,this.temp), 1000*60*30);
        this._bindPopup();
    },
    _renderForm: function (_this,temp) {
        console.info('_renderForm.this'+ _this);
        str = '<form id="modify_system">'
                + '<label for="system_name">系统名称'
                + '</label>'
                + '<input type="hidden" name="system_id" id="system_id" value="' + _this.temp.sy_id + '"/>'
                + '<input type="text" name="system_name" id="system_name" value="' + _this.temp.sy_name + '"/>'
                + '<label for="system_description">系统描述'
                + '</label>'
                + '<textarea id="system_description">' + _this.temp.sy_desc + '</textarea>'
                + '<button type="button" id="system_cancel" >取消</button>'
                + '<button type="button" id="system_submit" >确定</button>'
            +'</form>';
            return str;
    },
    info: function(str){
        console.info(str);
    }
};
(function ($){
    // 从后台获取数据
    $.ajax({
        dataType: 'json',
        type: 'get',
        url: URL_GET_SYSTEM,
        contentType:'application/json',
        success: function (data) {
            var str = '';
            data = data.result;
            if(data.status === 200){
                data = data.data;
                for(var i = 0,len = data.length; i < len; i++){
                    str = str + '<li id="system_' + data[i].id + '" >'
                        + '<h3><a class="system_href" href="/system/'+ data[i].id+'">' + data[i].name + '</a></h3>'
                        + '<p>' + data[i].description + '</p>'
                        + '<i class="fa fa-pencil" aria-hidden="true"></i>'
                        + '<i class="fa fa-trash" aria-hidden="true"></i>'
                        + '</li>';
                        }

                $(str).appendTo('#system_container');
                $('.fa-trash').click(function (event) {
                    handler.delectSystem(event);
                });
                $('.fa-pencil').click(function (event) {
                    handler.modifySystem(event);
                });
                $('.system_href').click(function (event) {
                    handler.tumpItfPage(event);
                });
            }else{
                handler.info('[system error]没有获取到数据');
            }


        },
        error: function (data) {
            handler.info("[system error]/system/all错误");
        }
    });
})($);