package creationPattern.singletonPattern;

/*懒汉式1,每次获取实例时均要同步*/
public class LazySingleton1 {
    //private 避免类在外部被实例化
    private LazySingleton1(){}
    //保证 instance 在所有线程中同步
    //private static volatile LazySingleton1 instance = null;
    private static LazySingleton1 instance = null;

    public static synchronized LazySingleton1 getInstance(){
        //getInstance 方法前加同步
        if (null == instance){
            instance =  new LazySingleton1();
        }
        return instance;
    }
}
