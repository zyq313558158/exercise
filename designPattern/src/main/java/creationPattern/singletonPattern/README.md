# exercise
平时学习练习之用

入行尚浅，需要知识需要学习补充，此仓库练习之用。


上面的第一种懒汉式写法做到了延迟创建和线程安全，缺点是每次调用getInstance()时都必须进行同步，效率不佳。
		第二种DCL方式比较常见，两次判空，第一次判空避免了不必要的同步，第二次保证了单例创建，这种方式比较不错，但是在高并发环境下有时会出现问题。
		第三种方法最被推荐，线程安全也保证了实例唯一。