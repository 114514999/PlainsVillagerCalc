package github.plainsvillager.cmdcalc;

import github.plainsvillager.cmdcalc.util.BaseOperationV2;
import static github.plainsvillager.cmdcalc.util.Welcome.welcome;

import java.util.Scanner;

/**
 * Started in 0.1-beta.4
 * <h2>I M T HE MA IN C L A SS ! ! !叫我爸爸（bushi</h2>
 *
 * @author PlainsVillager
 * @version 0.2-beta.2
 * @since 0.2-beta.2
 */
public class MainCatausVersion {
    public static void main(String[] args) {
        //CalcCore c = new CalcCore();
        welcome();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String choice = sc.next();
            switch (choice) {
                case "pvcalc --help":
                    help();
                    break;
                case "pvcalc --v":
                    System.out.println(CalculatorVersion.VERSION_ALL);
                    break;
                case "pvcalc --link":
                    System.out.println("作者还没做好哦~~~下个版本会出来的");
                    break;
                case "--c":
                    String temp = c(); // 临时变量，为下一步操作做准备，储存c()的返回值
                    System.out.println(temp);
                    while (true) {
                        String c = sc.next(); // 继续

                        /**
                         * 持续运算已实现 (ohhhhhhhh
                         * 上一步结束运算后按continue，在输入操作符即可
                         * @author PlainsVillager
                         * @version 0.2-beta.2
                         * @since   0.2-beta.2
                         */
                        if(c.equals("continue")){
                            System.out.println(cTemp(temp));
                        }else {
                            break;
                        }
                    }

                default:
                    System.out.println("Unknown command, try to input pvcalc --help");
                    break;
            }
        }
    }

    //pvcalc --help时触发
    private static void help() {
        String intro =
                "pvcalc --help: this\n" +
                        "pvcalc --v: 计算器版本  --c: 开始计算  pvcalc --link: 链接   运算符exit：退出\n" +
                        " 计算示例：’‘’114514 + 1919810 的操作：‘’‘ \n" +
                        " 114514 + 1919810";
        System.out.println(intro);
    }

    //计算，不要说方法名垃圾
    private static String c() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入被操作数1：");
        String a = scanner.next();
        System.out.println("请输入运算符号（+ - * / ）（exit：退出）");
        String operator = scanner.next(); // operator
        System.out.println("请输入被操作数2：");
        String b = scanner.next();
        System.out.println("结果是：");
        //String result;
        switch (operator) { //判断操作符
            case "+" :
                return BaseOperationV2.PLUS_V2(a, b);
            case "-" :
                return BaseOperationV2.SUBTRACT_V2(a, b);
            case "*" :
                return BaseOperationV2.MULTIPLY_V2(a, b);
            case  "/" :
                return BaseOperationV2.DIVIDE_V2(a, b);
            case "exit" :
                System.exit(1145141919);
            default: //用户输入非上五种符号
                return "你干嘛~哎呦";
        }
    }

    /**
     * 连续计算
     * @since  0.2-beta.2
     * @param temp 临时操作数（相当于c()中的a）
     * @return
     */
    private static String cTemp(String temp){
        Scanner sc2 = new Scanner(System.in);
        String operator = sc2.next(); // operator
        System.out.println("请输入被操作数2：");
        String b = sc2.next();
        System.out.println("结果是：");
        //String result;
        switch (operator) { //判断操作符
            case "+" :
                return BaseOperationV2.PLUS_V2(temp, b);
            case "-" :
                return BaseOperationV2.SUBTRACT_V2(temp, b);
            case "*" :
                return BaseOperationV2.MULTIPLY_V2(temp, b);
            case  "/" :
                return BaseOperationV2.DIVIDE_V2(temp, b);
            case "exit" :
                System.exit(3);
            default: //用户输入非上五种符号
                return "你干嘛~哎呦";
        }
    }
}
