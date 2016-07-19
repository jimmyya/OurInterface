    var salt;
    $.ajax({
        data: '',
        dataType: 'json',
        url : '/salt/login/get',
        type: 'get',
        success: function(data){
            console.info(data);
            salt = data;
        },
        error: function(data){
            console.info(data);
            salt = data;
        }
    });
    // submit event
    $("#login_submit").click(function (event) {
        debugger;
        var md5 = $.md5;
        var user_name = md5($('#user_name').val());
        var user_password =md5($('user_password').val());
        var data = {
            user_name: user_name,
            user_password: user_password,
            salt: salt.salt
        }
        $.ajax({
            data: JSON.stringify(data),
            dataType: 'json',
            url : '/user/login',
            type: 'post',
            success: function(data){

            },
            error: function(data){

            }
        });
    });
