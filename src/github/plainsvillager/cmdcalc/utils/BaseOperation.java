package github.plainsvillager.cmdcalc.utils;

import java.math.BigDecimal;

public final class BaseOperation {
    public static void plus(String a, String b) {
        System.out.println((new BigDecimal(a).add(new BigDecimal(b))));
    }

    public static void subtract(String a, String b) {
        System.out.println((new BigDecimal(a).subtract(new BigDecimal(b))));
    }

    public static void multiply(String a, String b) {
        System.out.println((new BigDecimal(a).multiply(new BigDecimal(b))));
    }

    public static void divide(String a, String b){
        System.out.println((new BigDecimal(a).divide(new BigDecimal(b))));
    }
}
