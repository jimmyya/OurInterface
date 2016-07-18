package com.qg.exception;

import static javafx.scene.input.KeyCode.R;

/**
 * Created by CHEN on 2016/7/17.
 * 用户没有权限使用这个用户接口
 */

public class PowerLimitException extends RuntimeException{
    public PowerLimitException(String message,Throwable cause) {
        super(message,cause);
    }
}
