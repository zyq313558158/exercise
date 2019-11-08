package structuralPattern.flyWeightPattern;

import java.util.HashMap;

//享元工厂角色
public class FlyweightFactory {
    private HashMap<String,Flyweight> flyweightHashMap = new HashMap<>();

    public Flyweight getFlyweight(String key){
        Flyweight flyweight = flyweightHashMap.get(key);
        if (null != flyweight){
            System.out.println("具体享元"+key+"已经存在，被成功获取！");
        }else {
            flyweight = new ConcreteFlyweight(key);
            flyweightHashMap.put(key,flyweight);
        }
        return flyweight;
    }
}
