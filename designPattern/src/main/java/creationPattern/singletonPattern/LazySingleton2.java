package creationPattern.singletonPattern;

/*懒汉式2，当实例为空时再同步*/
public class LazySingleton2 {
    private LazySingleton2(){}
    private static volatile LazySingleton2 instance = null;
    public static LazySingleton2 getInstance(){
        if (null == instance){
            synchronized (LazySingleton2.class){
                if (null == instance){
                    instance = new LazySingleton2();
                }
            }
        }
        return instance;
    }
}
