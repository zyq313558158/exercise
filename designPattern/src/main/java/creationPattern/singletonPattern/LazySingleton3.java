package creationPattern.singletonPattern;

/*懒汉式3，最被推荐，线程安全也保证了实例唯一*/
public class LazySingleton3 {
    private LazySingleton3(){}

    public static final LazySingleton3 getInstance(){
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder{
        private static final LazySingleton3 INSTANCE = new LazySingleton3();
    }
}
