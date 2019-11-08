package structuralPattern.bridgePattern;

//扩展抽象化角色
class RefinedAbstraction extends Abstraction {


    protected RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void Operation() {
        System.out.println("扩展抽象化(Refined Abstraction)角色被访问" );
        implementor.operationImpl();
    }
}
