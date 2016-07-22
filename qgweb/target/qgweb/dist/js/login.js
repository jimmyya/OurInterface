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
    $("#login_form").bind('submit',function (event) {
        debugger;
        var md5 = $.md5;
        var user_name = md5($('#user_name').val());
        var user_password =md5($('user_password').val());
        $('#user_name').val(user_name);
        $('#user_password').val(user_password);
        $('#salt').val(salt.salt);
        event.target.submit();
    });
