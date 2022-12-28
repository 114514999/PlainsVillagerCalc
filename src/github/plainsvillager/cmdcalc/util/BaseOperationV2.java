package github.plainsvillager.cmdcalc.util;

import java.math.BigDecimal;

public non-sealed class BaseOperationV2 extends BaseOperation {
    public static final String PLUS_V2(String a, String b) {
        return (new BigDecimal(a).add(new BigDecimal(b))).toString();
    }

    public static final String SUBTRACT_V2(String a, String b) {
        return (new BigDecimal(a).subtract(new BigDecimal(b))).toString();
    }

    public static final String MULTIPLY_V2(String a, String b) {
        return (new BigDecimal(a).multiply(new BigDecimal(b))).toString();
    }

    public static final String DIVIDE_V2(String a, String b) {
        return (new BigDecimal(a).divide(new BigDecimal(b))).toString();
    }
}
