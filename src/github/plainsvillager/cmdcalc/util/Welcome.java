package github.plainsvillager.cmdcalc.util;

import github.plainsvillager.cmdcalc.CalculatorVersion;

/**
 * <h3>欢迎界面类</h3>
 */
public class Welcome {
    public static void welcome(){
        System.out.println("欢迎来到村民计算器，当前版本："
                + CalculatorVersion.VERSION_ALL
                + "帮助：输入pvcalc --help"
                + "查看版本：输入pvcalc --v"
                + "链接："
                + "进行计算：直接输入c按回车"
        );
    }
    /*static { // 静态代码块
        System.out.println("欢迎来到村民计算器，当前版本："
                + CalculatorVersion.VERSION_ALL
                + "帮助：输入pvcalc --help"
                + "查看版本：输入pvcalc --v"
                + "链接："
        );
    }*/
}
