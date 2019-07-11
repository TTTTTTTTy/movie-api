package com.summer.util;

/**
 * @author Administrator
 * @since 2019/6/16 19:21
 */
public enum Result {

    SUCCESS(0, "操作执行成功"),
    UNKNOWN(1, "未知错误"),
    USERNAME_EXISTS(2,  "用户名已存在"),
    EMAIL_EXISTS(3, "邮箱已被占用"),
    USER_NOT_EXISTS(4, "用户不存在或密码错误");

    private final int value;
    private final String message;

    Result(int value, String message) {
        this.value = value;
        this.message = message;
    }

    public int value() {
        return this.value;
    }



    public String getMessage() {
        return this.message;
    }


    public String toString() {
        return Integer.toString(this.value);
    }

    public static Result valueOf(int value) {
        Result[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            Result status = var1[var3];
            if (status.value == value) {
                return status;
            }
        }

        throw new IllegalArgumentException("No matching constant for [" + value + "]");
    }
}
