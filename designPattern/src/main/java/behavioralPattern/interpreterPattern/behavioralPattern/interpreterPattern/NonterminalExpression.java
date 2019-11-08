package behavioralPattern.interpreterPattern.behavioralPattern.interpreterPattern;

//非终结符表达式类
public class NonterminalExpression implements AbstractExpression {

    private AbstractExpression abstractExpression1;
    private AbstractExpression abstractExpression2;

    @Override
    public Object interpret(String info) {
        //非对终结符表达式的处理
        return null;
    }
}
