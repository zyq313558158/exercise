package behavioralPattern.vistorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//对象结构角色
public class ObjectStructure {
    private List<Element> list = new ArrayList<>();

    public void accept(Visitor visitor){
        Iterator<Element> elementIterator = list.iterator();
        while (elementIterator.hasNext()){
            elementIterator.next().accept(visitor);
        }
    }

    public void add(Element element){
        list.add(element);
    }

    public void remove(Element element){
        list.remove(element);
    }
}
