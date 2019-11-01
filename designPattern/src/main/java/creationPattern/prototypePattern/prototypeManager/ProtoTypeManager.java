package creationPattern.prototypePattern.prototypeManager;

import java.util.HashMap;

public class ProtoTypeManager {
    private HashMap<String,Shape> hashMap = new HashMap<>();

    public ProtoTypeManager() {
        hashMap.put("Circle",new Circle());
        hashMap.put("Square",new Square());
    }

    public void addShape(String key,Shape obj){
        hashMap.put(key, obj);
    }

    public Shape getShape(String key){
        return (Shape) hashMap.get(key).clone();
    }


}
