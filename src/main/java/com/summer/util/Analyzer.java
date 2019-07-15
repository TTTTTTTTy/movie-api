package com.summer.util;

/**
 * @author Administrator
 * @since 2019/7/12 9:29
 */
public enum Analyzer {

    IK_MAX_WORD(0,"ik_max_word"),
    IK_SMART(1,"ik_smart"),
    STANDARD(2,"standard");

    private final int value;
    private final String name;

    Analyzer(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int value() {
        return this.value;
    }


    public String getName() {
        return name;
    }

    public String toString() {
        return Integer.toString(this.value);
    }

    public static Analyzer valueOf(int value) {
        Analyzer[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            Analyzer status = var1[var3];
            if (status.value == value) {
                return status;
            }
        }

        throw new IllegalArgumentException("No matching constant for [" + value + "]");
    }
}
