package com.summer.util;

/**
 * @author Administrator
 * @since 2019/7/12 9:29
 */
public enum Sort {

    DESC(0,"desc"),
    ASC(1,"asc");

    private final int value;
    private final String sort;

    Sort(int value, String analyzer) {
        this.value = value;
        this.sort = analyzer;
    }

    public int value() {
        return this.value;
    }


    public String getSort() {
        return sort;
    }

    public String toString() {
        return Integer.toString(this.value);
    }

    public static Sort valueOf(int value) {
        Sort[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            Sort status = var1[var3];
            if (status.value == value) {
                return status;
            }
        }

        throw new IllegalArgumentException("No matching constant for [" + value + "]");
    }
}
