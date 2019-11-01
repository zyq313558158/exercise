package creationPattern.singletonPattern;

/*饿汉式,类加载的时候对象已创建成功*/
public class HungrySingleton {
    private HungrySingleton(){}
    private static final HungrySingleton instance = new HungrySingleton();
    public static HungrySingleton getInstance(){
        return instance;
    }
}


