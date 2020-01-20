# exercise


多线程、同步、锁，学习了一下，简单的写几点；
1.多线程的创建：三种方式,(2)(3)方式执行需要依赖Thread类;
	(1)继承Thread类,重写run()方法；
	(2)实现Runnable接口,重写run()方法；
	(3)实现Callable接口,重写call(),此种方法是有返回值的,但是在使用时要将接口实现类的对象放在FutureTask对象中,从FutureTask对象中获取返回值;
2.关于线程池:
	常用的就是fix那个;
3.Synchronized同步,使用wait()、notify()的必要方法,分为两种,可形成两种锁:
	对象锁和类锁,对象锁有非方法同步和同步代码块同步对象两种实现方式,类锁有静态方法同步和同步代码块同步类两种方式实现。
	对象锁和类锁均可各自实现同步锁,但相互之间不会同步。
	特别的,Synchronized同步无法实现公平锁。
	
	sleep(),wait()均不占用cpu资源,但sleep()不释放锁,wait()释放锁;
	notify()只能唤醒同一对象或者类锁的wait()方法。
4.lock同步锁,随着jdk5的concurrent包,使用简单,且线程多时效率比Synchronized关键字高,可实现公平锁;
5.读写锁,是一种自旋锁,适用于读多写少的场景,使用较少,不多说,需要注意的是下面这句话:
	一个读写锁同时只能存在一个写锁但是可以存在多个读锁，但不能同时存在写锁和读锁。
	
Java中的多线程你只要看这一篇就够了：https://www.cnblogs.com/wxd0108/p/5479442.html
java多线程实现抢票：https://blog.csdn.net/weixin_43928997/article/details/90903692
java锁之wait,notify(wait会释放锁，notify仅仅只是通知，不释放锁)：https://www.cnblogs.com/tiancai/p/8855125.html
synchronized的修饰方法和修饰代码块区别：https://blog.csdn.net/TesuZer/article/details/80874195	
可重入锁详解（什么是可重入）：https://blog.csdn.net/w8y56f/article/details/89554060
创建线程的三种方式：https://blog.csdn.net/lihua5419/article/details/80679319
并发锁之二：ReentrantReadWriteLock读写锁：https://www.cnblogs.com/wait-pigblog/p/9350569.html


