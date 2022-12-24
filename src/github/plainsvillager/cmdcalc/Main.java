package github.plainsvillager.cmdcalc;

import java.math.BigDecimal;
import java.util.Scanner;
import github.plainsvillager.cmdcalc.utils.BaseOperation;

/**
 * The Main class for THIS calc
 *
 * @Author: PlainsVillager
 * @Date: 2022/12/22 12:36
 * @Since: 2022/12/22 12:36
 * @see  CalculatorVersion
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎来到村民cmd计算器。当前版本："
                + CalculatorVersion.VERSION_ALL
                + "作者：PlainsVillager");
        System.out.println("操作：+为加，-为减，*为乘，/为除，114514退出");
        System.out.println("示例：\t114514 + 1919810 可表示为：\n     114514\n     +\n     1919810");

        while (true){
            String a = sc.next();
            String o = sc.next();
            switch (o) {
                case "114514" -> System.exit(114514);
                case "pvcalc version_all" -> System.out.println(CalculatorVersion.VERSION_ALL);
                case "pvcalc version_beta" -> System.out.println(CalculatorVersion.VERSION_SNAPSHOT);
            }
            String b = sc.next();
            switch (o) {
                case "+" -> BaseOperation.plus(a, b);
                case "-" -> BaseOperation.subtract(a, b);
                case "*" -> BaseOperation.multiply(a, b);
                case "/" -> BaseOperation.divide(a, b);
                case "114514" -> System.exit(114514);
            }
            System.out.println("一次运算已结束");
        }
    }
    @Deprecated
    static void plus(String a, String b) {
        System.out.println((new BigDecimal(a).add(new BigDecimal(b))));
    }
    @Deprecated
    static void subtract(String a, String b) {
        System.out.println((new BigDecimal(a).subtract(new BigDecimal(b))));
    }
    @Deprecated
    static void multiply(String a, String b) {
        System.out.println((new BigDecimal(a).multiply(new BigDecimal(b))));
    }
    @Deprecated
    static void divide(String a, String b){
        System.out.println((new BigDecimal(a).divide(new BigDecimal(b))));
    }
    /*static void pow(String a, String b){
        System.out.println((new BigDecimal(a).pow(new BigDecimal(b))));
    }*/
}
