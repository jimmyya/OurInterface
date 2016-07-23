var URL_GET_ALL_INTERFACE = '/system/1/all_interface';
var URL_GET_ONE_INTERFACE = '/interface/22/one_interface';
var URL_DELETE_INTERFACE = '/interface/34/22';
var URL_UPDATE_INTERFACE = '/interface/55/22';

Mock.mock(URL_GET_ALL_INTERFACE, {
    result:{
        status: 2000,
        data: [
            {
                "interfaceId": 22,
                "interfaceName": "user_add",
                "interfaceUrl": "/user/user_add",
                "interfaceFormat": null,
                "interfaceRequestMethod": null,
                "interfacePowerLimit": null,  // 属性
                "interfaceAuthor": null,
                "interfaceDescription": null,
                "interfaceRequestResult": null,
                "systemId": 0,
                "fields": null,
                "interfaceModifyUrl": "/interface/34/22",
                "interfaceDeleteUrl": "/interface/34/22"
            },
             {
                "interfaceId": 22,
                "interfaceName": "user_add",
                "interfaceUrl": "/user/user_add",
                "interfaceFormat": null,
                "interfaceRequestMethod": null,
                "interfacePowerLimit": null,
                "interfaceAuthor": null,
                "interfaceDescription": null,
                "interfaceRequestResult": null,
                "systemId": 0,
                "fields": null,
                "interfaceModifyUrl": "/interface/34/22",
                "interfaceDeleteUrl": "/interface/34/22"
            },
             {
                "interfaceId": 22,
                "interfaceName": "user_add",
                "interfaceUrl": "/user/user_add",
                "interfaceFormat": null,
                "interfaceRequestMethod": null,
                "interfacePowerLimit": null,
                "interfaceAuthor": null,
                "interfaceDescription": null,
                "interfaceRequestResult": null,
                "systemId": 0,
                "fields": null,
                "interfaceModifyUrl": "/interface/34/22",
                "interfaceDeleteUrl": "/interface/34/22"
            },
             {
                "interfaceId": 22,
                "interfaceName": "user_add",
                "interfaceUrl": "/user/user_add",
                "interfaceFormat": null,
                "interfaceRequestMethod": null,
                "interfacePowerLimit": null,
                "interfaceAuthor": null,
                "interfaceDescription": null,
                "interfaceRequestResult": null,
                "systemId": 0,
                "fields": null,
                "interfaceModifyUrl": "/interface/34/22",
                "interfaceDeleteUrl": "/interface/34/22"
            },
        ],
        message: null,
        powerLimit: 2
    }
});

Mock.mock(URL_GET_ONE_INTERFACE, {
    "interfaceResult": {
        "status": 2000,
        "data": {
            "interfaceId": 22,
            "interfaceName": "user_add",
            "interfaceUrl": "/user/user_add",
            "interfaceFormat": null,
            "interfaceRequestMethod": null,
            "interfacePowerLimit": null,
            "interfaceAuthor": null,
            "interfaceDescription": null,
            "interfaceRequestResult": null,
            "systemId": 0,
            "fields": null,
            "interfaceModifyUrl": "/interface/34/22",
            "interfaceDeleteUrl": "/interface/34/22"
        },
        "message": null,
        "powerLimit": 3
    },
    "fieldResult": {
        "status": 2000,
        "data": [{
            "fieldId": 16,
            "fieldName": "username",
            "fieldAttribute": "String",
            "fieldDescription": "这是用户名",
            "fieldDefaultValue": null,
            "fieldExplain": "解释",
            "interfaceId": 22,
            "fieldModifyUrl": "/field/34/16",
            "fieldDeleteUrl": "/field/34/16"
        }, {
            "fieldId": 17,
            "fieldName": "username",
            "fieldAttribute": "String",
            "fieldDescription": "这是用户名",
            "fieldDefaultValue": null,
            "fieldExplain": "解释",
            "interfaceId": 22,
            "fieldModifyUrl": "/field/34/17",
            "fieldDeleteUrl": "/field/34/17"
        }, {
            "fieldId": 18,
            "fieldName": "username",
            "fieldAttribute": "String",
            "fieldDescription": "这是用户名",
            "fieldDefaultValue": null,
            "fieldExplain": "解释",
            "interfaceId": 22,
            "fieldModifyUrl": "/field/34/18",
            "fieldDeleteUrl": "/field/34/18"
        }, {
            "fieldId": 19,
            "fieldName": "username",
            "fieldAttribute": "String",
            "fieldDescription": "这是用户名",
            "fieldDefaultValue": null,
            "fieldExplain": "解释",
            "interfaceId": 22,
            "fieldModifyUrl": "/field/34/19",
            "fieldDeleteUrl": "/field/34/19"
        }, {
            "fieldId": 20,
            "fieldName": "username",
            "fieldAttribute": "String",
            "fieldDescription": "这是用户名",
            "fieldDefaultValue": null,
            "fieldExplain": "解释",
            "interfaceId": 22,
            "fieldModifyUrl": "/field/34/20",
            "fieldDeleteUrl": "/field/34/20"
        }, {
            "fieldId": 21,
            "fieldName": "username",
            "fieldAttribute": "String",
            "fieldDescription": "这是用户名",
            "fieldDefaultValue": null,
            "fieldExplain": "解释",
            "interfaceId": 22,
            "fieldModifyUrl": "/field/34/21",
            "fieldDeleteUrl": "/field/34/21"
        }, {
            "fieldId": 22,
            "fieldName": "username",
            "fieldAttribute": "String",
            "fieldDescription": "这是用户名",
            "fieldDefaultValue": null,
            "fieldExplain": "解释",
            "interfaceId": 22,
            "fieldModifyUrl": "/field/34/22",
            "fieldDeleteUrl": "/field/34/22"
        }, {
            "fieldId": 23,
            "fieldName": "username",
            "fieldAttribute": "String",
            "fieldDescription": "这是用户名",
            "fieldDefaultValue": null,
            "fieldExplain": "解释",
            "interfaceId": 22,
            "fieldModifyUrl": "/field/34/23",
            "fieldDeleteUrl": "/field/34/23"
        }, {
            "fieldId": 24,
            "fieldName": "username",
            "fieldAttribute": "String",
            "fieldDescription": "这是用户名",
            "fieldDefaultValue": null,
            "fieldExplain": "解释",
            "interfaceId": 22,
            "fieldModifyUrl": "/field/34/24",
            "fieldDeleteUrl": "/field/34/24"
        }, {
            "fieldId": 25,
            "fieldName": "username",
            "fieldAttribute": "String",
            "fieldDescription": "这是用户名",
            "fieldDefaultValue": null,
            "fieldExplain": "解释",
            "interfaceId": 22,
            "fieldModifyUrl": "/field/34/25",
            "fieldDeleteUrl": "/field/34/25"
        }, {
            "fieldId": 26,
            "fieldName": "username",
            "fieldAttribute": "String",
            "fieldDescription": "这是用户名",
            "fieldDefaultValue": null,
            "fieldExplain": "解释",
            "interfaceId": 22,
            "fieldModifyUrl": "/field/34/26",
            "fieldDeleteUrl": "/field/34/26"
        }, {
            "fieldId": 27,
            "fieldName": "username",
            "fieldAttribute": "String",
            "fieldDescription": "这是用户名",
            "fieldDefaultValue": null,
            "fieldExplain": "解释",
            "interfaceId": 22,
            "fieldModifyUrl": "/field/34/27",
            "fieldDeleteUrl": "/field/34/27"
        }, {
            "fieldId": 28,
            "fieldName": "username",
            "fieldAttribute": "String",
            "fieldDescription": "这是用户名",
            "fieldDefaultValue": null,
            "fieldExplain": "解释",
            "interfaceId": 22,
            "fieldModifyUrl": "/field/34/28",
            "fieldDeleteUrl": "/field/34/28"
        }, {
            "fieldId": 29,
            "fieldName": "username",
            "fieldAttribute": "String",
            "fieldDescription": "这是用户名",
            "fieldDefaultValue": null,
            "fieldExplain": "解释",
            "interfaceId": 22,
            "fieldModifyUrl": "/field/34/29",
            "fieldDeleteUrl": "/field/34/29"
        }, {
            "fieldId": 30,
            "fieldName": "username",
            "fieldAttribute": "String",
            "fieldDescription": "这是用户名",
            "fieldDefaultValue": null,
            "fieldExplain": "解释",
            "interfaceId": 22,
            "fieldModifyUrl": "/field/34/30",
            "fieldDeleteUrl": "/field/34/30"
        }, {
            "fieldId": 31,
            "fieldName": "username",
            "fieldAttribute": "String",
            "fieldDescription": "这是用户名",
            "fieldDefaultValue": null,
            "fieldExplain": "解释",
            "interfaceId": 22,
            "fieldModifyUrl": "/field/34/31",
            "fieldDeleteUrl": "/field/34/31"
        }, {
            "fieldId": 32,
            "fieldName": "username",
            "fieldAttribute": "String",
            "fieldDescription": "这是用户名",
            "fieldDefaultValue": null,
            "fieldExplain": "解释",
            "interfaceId": 22,
            "fieldModifyUrl": "/field/34/32",
            "fieldDeleteUrl": "/field/34/32"
        }, {
            "fieldId": 33,
            "fieldName": "username",
            "fieldAttribute": "String",
            "fieldDescription": "这是用户名",
            "fieldDefaultValue": null,
            "fieldExplain": "解释",
            "interfaceId": 22,
            "fieldModifyUrl": "/field/34/33",
            "fieldDeleteUrl": "/field/34/33"
        }, {
            "fieldId": 34,
            "fieldName": "username",
            "fieldAttribute": "String",
            "fieldDescription": "这是用户名",
            "fieldDefaultValue": null,
            "fieldExplain": "解释",
            "interfaceId": 22,
            "fieldModifyUrl": "/field/34/34",
            "fieldDeleteUrl": "/field/34/34"
        }, {
            "fieldId": 35,
            "fieldName": "username",
            "fieldAttribute": "String",
            "fieldDescription": "这是用户名",
            "fieldDefaultValue": null,
            "fieldExplain": "解释",
            "interfaceId": 22,
            "fieldModifyUrl": "/field/34/35",
            "fieldDeleteUrl": "/field/34/35"
        }, {
            "fieldId": 36,
            "fieldName": "username",
            "fieldAttribute": "String",
            "fieldDescription": "这是用户名",
            "fieldDefaultValue": null,
            "fieldExplain": "解释",
            "interfaceId": 22,
            "fieldModifyUrl": "/field/34/36",
            "fieldDeleteUrl": "/field/34/36"
        }, {
            "fieldId": 37,
            "fieldName": "username",
            "fieldAttribute": "String",
            "fieldDescription": "这是用户名",
            "fieldDefaultValue": null,
            "fieldExplain": "解释",
            "interfaceId": 22,
            "fieldModifyUrl": "/field/34/37",
            "fieldDeleteUrl": "/field/34/37"
        }],
        "message": null,
        "powerLimit": 3
    }
});
Mock.mock(URL_DELETE_INTERFACE, {
    status: 2000
});
Mock.mock(URL_UPDATE_INTERFACE, {
    status: 2000
});
var handler = {
    _temp_interface:{}, // 存储临时的数据
    _strogage: {
        s : window.localStorage, // 之后这里可以优化的。
        setItem: function(key, value){
            handler._strogage.s.setItem(key, value);
        },
        getItem: function(key){
            handler._strogage.s.getItem(key);
        }
    },
    // 未完成
    _handleOneInterface: function(data){
        var str = '',
            temp = null,
            tem = null;
        if(data.interfaceResult.status === 2000){
            temp = data.interfaceResult.data;
            str =  '<div class="button_qun">' ;
            if(data.interfaceResult.powerLimit === 3){
                str = str + '<i class="fa fa-trash" data-id="' + temp.interfaceId + '"></i>';
            }
            if(data.interfaceResult.powerLimit >= 2){
                str = str + '<i class="fa fa-pencil change_ift"></i>';
            }
            str = str + '</div>'
            + '<h1 data-input="false">' + temp.interfaceName + '</h1>'
            + '<p data-input="false">' + temp.interfaceDescription + '</p>'
            + '<h2>URL</h2>'
            + '<p data-input="false">' + temp.interfaceUrl + '</p>'
            + '<h2>支持格式</h2>'
            + '<p data-input="false">' + temp.interfaceFormat + '</p>'
            + '<h2>HTTP请求方式</h2>'
            + '<p data-input="false">' + temp.interfaceRequestMethod + '</p>'
            + '<h2>权限</h2>'
            + '<p data-input="false">' + temp.interfacePowerLimit + '</p>'
            + '<h2>作者</h2>'
            + '<p data-input="false">' + temp.interfaceAuthor + '</p>';

            if(data.fieldResult.status === 2000){
                tem = data.fieldResult.data;
                str = str + '<div class="data_form">'
                        + '<i class="fa fa-pencil change_arg"></i>'
                        + '<div class="form_tr">'
                        + '<div class="form_name">名称</div>'
                        + '<div class="form_attr">属性</div>'
                        + '<div class="form_desc">描述</div>'
                        + '<div class="form_defa">默认值</div>'
                        + '<div class="form_exp">说明</div>'
                        + '</div>';

                for(var i = 0, len = tem.length; i < len; i++){
                    str = str + '<div class="form_tr">'
                            + '<div class="form_name" data-input="true">' + tem[i].fieldName + '</div>'
                            + '<div class="form_attr" data-input="true">' + tem[i].fieldAttribute + '</div>'
                            + '<div class="form_desc" data-input="true">' + tem[i].fieldDescription + '</div>'
                            + '<div class="form_defa" data-input="true">' + tem[i].fieldDefaultValue + '</div>'
                            + '<div class="form_exp" data-input="true">' + tem[i].fieldExplain + '</div>'
                            + '</div>';
                }
                str += '</div>';
            }
            str = str + '<h2>返回结果</h2>'
                + '<p data-input="false">' + data.interfaceResult.data.interfaceRequestResult + '</p>';
        }
        return str;
    },
    _handleAllInterface: function(data){
        var str = '',
            temp = null;
        if(data.result.status === 2000){
            temp = data.result.data;
            for(var i = 0 ,len = temp.length; i < len; i++){
                str = str + '<li class="sb_name" data-id="' + temp[i].interfaceId + '">' 
                + temp[i].interfaceName
                + '</li>';
            }
        }
        return str;
    },
    getOneInterface: function(event){
        var _this = this;
        $.ajax({
            type: 'get',
            url: URL_GET_ONE_INTERFACE,
            contentType: 'application/json',
            dataType: 'json',
            success: function(data) {
                _this.renderOneInterface(_this,data);
            },
            error: function(data) {
                console.info('[system error]获取接口详细信息失败');
            }
        });
    },
    serialize: function(){
        var input = document.getElementsByClassName('input');
        var ele = {};
        for(var i = 0 ,len = input.length; i < len; i++){
            ele[input.name] = input.value;
        }
        return ele;
    },
    modifyInterface: function(event){
        // 这个采取检测是不是有data-input数据
        var $eles = $('[data-input = false]');
        $eles.html( $eles.html()+ '<input type="text" value=""/>'); 
        $('.button_qun').append('<button type="button" id="form_submit">确定</button>');
        $('#form_submit').click(function(event){
            $.ajax({
                type: 'get',
                url: URL_UPDATE_INTERFACE,
                contentType: 'application/json',
                data: handler.serialize(),
                dataType: 'json',
                success: function(data) {
                    if(data.status === 2000){
                        handler.getOneInterface();
                    }
                },
                error: function(data) {
                    console.info('[system error]修改接口失败');
                }
            });
        });
    },
    modifyItfArg: function(event){
        $('[data-input = true]').wrap('<textarea></textarea>');
        $('.button_qun').append('<button type="button" id="form_arg_submit">确定</button>');
        $('#form_arg_submit').click(function(event){
            // 还没判断数据
            $.ajax({
                type: 'get',
                url: URL_UPDATE_INTERFACE,
                contentType: 'application/json',
                data: handler.serialize(),
                dataType: 'json',
                success: function(data){
                    if(data.status === 2000){
                        handler.getOneInterface();
                    }
                },
                error: function(data) {
                    console.info('[system error]修改接口失败');
                }
            });
        });
    },
    deleteInterface: function(_this, event){
        var url = $(event.target).attr('data-delete');
        $.ajax({
            type: 'delete',
            url: URL_DELETE_INTERFACE,
            contentType: 'application/json',
            dataType: 'json',
            success: function(data) {
                _this.renderDelete(_this, data, event);
            },
            error: function(data) {
                console.info('[system error]删除接口失败');
            }
        });
    },
    renderOneInterface: function(_this, data){
        var str = this._handleOneInterface(data);
        $('.section').html('');
        $(str).appendTo($('.section'));
        
        // 修改大接口
        $('.change_ift').click(function(event){
            _this.modifyInterface(event);
        });
        // 修改接口的参数
        $('.change_arg').click(function(event){
            _this.modifyItfArg(event);
        });

        // 删除单个接口事件,先写这个
        $('.fa-trash').click(function(event){
            _this.deleteInterface(_this, event);
        }); 
    },
    renderAllInterface: function(data){
        var _this = this;
        var str = this._handleAllInterface(data);
        $(str).appendTo($('#sidebar ol'));

        // 点击这个之后获取到单个具体信息
        $('.sb_name').click(function(event){
            _this.getOneInterface(event);
        });
    },
    renderDelete: function(_this, data, event){
        if(data.status === 2000){
            $('li').find('[data-id=' + $(event.target).attr('data-id') + ']').remove();
            _this.renderInit(sy);
        }else{
            console.info('[system error]删除接口失败');
        }
    },
    renderInit: function(sy){
        $('#sidebar h2').text(sy.sy_name);
        var str = '<div class="ct">' 
                    + '<h1 data-id="' + sy.sy_id + '">' + sy.sy_name + '</h1>'
                    + '<p>' + sy.sy_desc + '</p>'
                + '</div>';
        $('.section').html('');
        $(str).appendTo($('.section'));
    }
};
var sy = {
    sy_id : handler._strogage.s.getItem('sy_id'),
    sy_name : handler._strogage.s.getItem('sy_name'),
    sy_desc : handler._strogage.s.getItem('sy_desc')
};
//获得接口信息
(function() {
    handler.renderInit(sy);
    $.ajax({
        type: 'get',
        url: '/system/1/all_interface',
        contentType: 'application/json',
        dataType: 'json',
        success: function(data) {
            // 没有喧嚷整个啊
            handler.renderAllInterface(data);
        },
        error: function(data) {
            console.info('[system error]获取所有接口失败');
        }
    });
})();

(function(){
    // 绑定打开事件
    $('.sidebar li span').click(function (event) {
         $.ajax({
            type: 'get',
            url: '/interface/one_interface',
            contentType: 'application/json',
            success: function(data) {
                
            },
            error: function(data) {
                console.info('[system error]获取接口详细信息失败');
            }
        });
    });
})();
