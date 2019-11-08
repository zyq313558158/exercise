package behavioralPattern.templateMethodPattern.templateMethodExtension;

public class TemplateMethodExtensionTest {
    public static void main(String[] args) {
        HookAbstractClass hookAbstractClass = new HookConcreteMethod();
        hookAbstractClass.templateMethod();
    }
}
