package github.plainsvillager.cmdcalc;

/**
 * <h3>计算器版本类<h3></br>
 */
public class CalculatorVersion {
    /**
     * <br>VERSION_RELEASE  大版本号</br>
     * <br>VERSION_SNAPSHOT 补丁版本号</br>
     * <br>VERSION_ALL      全版本号（VERSION_RELEASE + VERSION_SNAPSHOT）</br>
     */
    public static final String VERSION_RELEASE = "0.1";
    public static final String VERSION_SNAPSHOT = "beta.4";
    /*弃用
    public static final String VERSION_ALL = "0.1-beta.4";//=VERSION_RELEASE + VERSION_SNAPSHOT
    */
    public static final String VERSION_ALL = VERSION_RELEASE + VERSION_SNAPSHOT;

}
