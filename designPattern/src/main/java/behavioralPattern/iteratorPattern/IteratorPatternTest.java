package behavioralPattern.iteratorPattern;

public class IteratorPatternTest {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("张三");
        aggregate.add("李四");
        aggregate.add("王五");
        System.out.println("聚合的内容有：");
        Iterator iterator = aggregate.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }

        System.out.println("第一个元素：" + iterator.first().toString());

        //第二次遍历时,指针发生了变化,需要优化
        System.out.println("聚合的内容有：");
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}
