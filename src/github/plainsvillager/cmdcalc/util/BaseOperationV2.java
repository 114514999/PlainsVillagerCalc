package github.plainsvillager.cmdcalc.util;

import java.math.BigDecimal;

/**
 * 父类：github.plainsvillager.cmdcalc.util.BaseOperation 已弃用
 */
public non-sealed class BaseOperationV2 extends BaseOperation {
    /**
     * 加法
     * @param a 被操作数
     * @param b 被操作数
     * @return (new BigDecimal(a).add(new BigDecimal(b))).toString() String 结果
     */
    public static final String PLUS_V2(String a, String b) {
        return (new BigDecimal(a).add(new BigDecimal(b))).toString();
    }

    /**
     * 减法
     * @param a
     * @param b
     * @return
     */
    public static final String SUBTRACT_V2(String a, String b) {
        return (new BigDecimal(a).subtract(new BigDecimal(b))).toString();
    }

    /**
     * 乘法
     * @param a
     * @param b
     * @return
     */
    public static final String MULTIPLY_V2(String a, String b) {
        return (new BigDecimal(a).multiply(new BigDecimal(b))).toString();
    }

    /**
     * 除法
     * @param a
     * @param b
     * @return
     */
    public static final String DIVIDE_V2(String a, String b) {
        return (new BigDecimal(a).divide(new BigDecimal(b))).toString();
    }
}
