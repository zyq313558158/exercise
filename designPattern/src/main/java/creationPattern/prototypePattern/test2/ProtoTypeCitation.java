package creationPattern.prototypePattern.test2;

public class ProtoTypeCitation {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation1 = new Citation("张三","同学：在2016学年第一学期中表现优秀，被评为三好学生。",
                "xx学院");
        Citation citation2 = (Citation) citation1.clone();
        Citation citation3 = (Citation) citation1.clone();
        citation3.setName("李四");
        citation1.display();
        citation2.display();
        citation3.display();
    }
}
