package behavioralPattern.iteratorPattern;

import java.util.List;

//具体迭代器
public class ConcreteIterator implements Iterator {

    private List<Object> list;
    private int index = -1;


    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public Object first() {
        index = 0;
        return list.get(index);
    }

    @Override
    public Object next() {
       Object object = null;
       if (this.hasNext()){
           object = list.get(++index);
       }
       return object;
    }

    @Override
    public boolean hasNext() {
        if (index < list.size()-1){
            return true;
        }else {
            return false;
        }
    }
}
