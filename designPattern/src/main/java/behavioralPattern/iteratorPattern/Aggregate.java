package behavioralPattern.iteratorPattern;

//抽象聚合
public interface Aggregate {
    void add(Object object);
    void remove(Object object);
    Iterator getIterator();
}
