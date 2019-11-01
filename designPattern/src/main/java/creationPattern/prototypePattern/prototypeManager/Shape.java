package creationPattern.prototypePattern.prototypeManager;

public interface Shape extends Cloneable {
    Object clone();    //拷贝
    void countArea();    //计算面积
}
