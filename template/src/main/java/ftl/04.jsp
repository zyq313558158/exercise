<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>

<body>

我是默认的
2019/07/18 14:18:47 //日期格式
FreeMarker template error (DEBUG mode; use RETHROW in production!):
The following has evaluated to null or missing:
==> number  [in template "04.ftl" at line 11, column 3]

----
Tip: If the failing expression is known to be legally refer to something that's sometimes null or missing, either specify a default value like myOptionalVar!myDefault, or use <#if myOptionalVar??>when-present<#else>when-missing</#if>. (These only cover the last step of the expression; to cover the whole expression, use parenthesis: (myOptionalVar.foo)!myDefault, (myOptionalVar.foo)??
----

----
FTL stack trace ("~" means nesting-related):
	- Failed at: ${number?string.number}  [in template "04.ftl" at line 11, column 1]
----

Java stack trace (for programmers):
----
freemarker.core.InvalidReferenceException: [... Exception message was already printed; see it above ...]
	at freemarker.core.InvalidReferenceException.getInstance(InvalidReferenceException.java:131)
	at freemarker.core.UnexpectedTypeException.newDesciptionBuilder(UnexpectedTypeException.java:77)
	at freemarker.core.UnexpectedTypeException.<init>(UnexpectedTypeException.java:40)
	at freemarker.core.BuiltInsForMultipleTypes$stringBI._eval(BuiltInsForMultipleTypes.java:617)
	at freemarker.core.Expression.eval(Expression.java:78)
	at freemarker.core.Dot._eval(Dot.java:38)
	at freemarker.core.Expression.eval(Expression.java:78)
	at freemarker.core.Expression.evalAndCoerceToString(Expression.java:82)
	at freemarker.core.DollarVariable.accept(DollarVariable.java:41)
	at freemarker.core.Environment.visit(Environment.java:324)
	at freemarker.core.MixedContent.accept(MixedContent.java:54)
	at freemarker.core.Environment.visit(Environment.java:324)
	at freemarker.core.Environment.process(Environment.java:302)
	at freemarker.template.Template.process(Template.java:325)
	at freeMaker.FreemarkerUtil.fprint(FreemarkerUtil.java:63)
	at FreemarkerTest.test4(FreemarkerTest.java:83)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)
	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:160)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)
	at com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)
	at com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)
	at com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)
