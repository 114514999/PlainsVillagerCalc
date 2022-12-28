package github.plainsvillager.cmdcalc.core;

import github.plainsvillager.cmdcalc.CalculatorVersion;

@Deprecated
public class CalcCore {
    public CalcCore(){

    }
    private void welcome(){
        System.out.println("欢迎来到村民计算器，当前版本："
                            + CalculatorVersion.VERSION_ALL
                            + "帮助：输入pvcalc --help"
                            + "查看版本：输入pvcalc --v"
                            + "链接："
                            );
    }
}
