# exercise
平时学习练习之用

消息队列rocketMQ
RocketMQ 安装详细说明：https://blog.csdn.net/wangmx1993328/article/details/81536168
rocketmq 4.3.2 解决远程不能消费问题，解决未识别到公网IP问题：https://www.cnblogs.com/jifeng/p/10175124.html
RocketMQ最佳实践（三）可视化管理控制台rocketmq-console-ng：https://www.jianshu.com/p/0de7857deb27
RocketMQ三种消息发送方式-同步、异步、单向：https://blog.csdn.net/u010277958/article/details/88631520



一.RocketMQ 安装详细说明:
https://blog.csdn.net/wangmx1993328/article/details/81536168

1.解压文件:
官方推荐解压命令：unzip rocketmq-all-4.3.0-source-release.zip

2.进入解压之后文件夹,编译部署项目:
(mvn -Prelease-all -DskipTests clean install -U)
接着就会从 Maven 中央仓库下载项目依赖的 jar 包编译部署，这可能需要几分钟的时间，如下所示从 阿里云 中央仓库进行下载
(我第一下下载等了好久没完成,不知道是不是网络的问题,重新进行了编译部署遍成功了)

3.进入到 distribution/target/apache-rocketmq 目录

4.nohup sh bin/mqnamesrv &  
后台启动mqnamesrv,启动后查看日志
tail -f ~/logs/rocketmqlogs/namesrv.log, 查看启动日志能看到：The Name Server boot success字样则成功

5.nohup sh bin/mqbroker -n localhost:9876 & 
后台启动Broker,启动后查看日志tail -f ~/logs/rocketmqlogs/broker.log查看日志，如果看到 "The broker[%s, 172.30.30.233:10911] boot success..." ,则表示启动成功

6.apache-rocketmq/bin 目录下启动 nameserv 与 broker 的 runbroker.sh 和 runserver.sh 文件中默认分配的内存太大，建议调小：
(1)runserver.sh 文件中 修改 JVM 配置下的第一行，将原来 4g 调小一点
JAVA_OPT="${JAVA_OPT} -server -Xms256m -Xmx256m -Xmn125m -XX:MetaspaceSize=128m -XX:MaxMetaspaceSize=320m"
(2)runbroker.sh 文件中 修改 JVM 配置下的第一行，将原来 8g 调小一点
JAVA_OPT="${JAVA_OPT} -server -Xms256m -Xmx256m -Xmn125m"

7.本地测试
(1)生产者,官方指导命令,用于发送消息，运行之后会发送大量的消息，之后就会退出:
export NAMESRV_ADDR=localhost:9876;
sh bin/tools.sh org.apache.rocketmq.example.quickstart.Producer;
(2)接收消息,官方指导命令：
sh bin/tools.sh org.apache.rocketmq.example.quickstart.Consumer

8.关闭服务
(1) sh bin/mqshutdown broker
显示:
The mqbroker(36695) is running...
Send shutdown request to mqbroker(36695) OK
(2)sh bin/mqshutdown namesrv
显示:
The mqnamesrv(36664) is running...
Send shutdown request to mqnamesrv(36664) OK


特别注意端口号的启动：

Linux 下防火墙与端口：
https://www.jianshu.com/p/b224d791f74c

rocketmq 4.3.2 解决远程不能消费问题，解决未识别到公网IP问题：
https://www.cnblogs.com/jifeng/p/10175124.html




二.RocketMQ最佳实践（三）可视化管理控制台rocketmq-console-n:
https://www.jianshu.com/p/0de7857deb27

直接运行jar(rocketmq-console-ng-1.0.1.jar)包启动即可
java?-jar?rocketmq-console-ng-1.0.0.jar?--server.port=12581?--rocketmq.config.namesrvAddr=10.89.0.64:9876;10.89.0.65:9876

这里注意需要设置两个参数：--server.port为运行的这个web应用的端口，如果不设置的话默认为8080；--rocketmq.config.namesrvAddr为RocketMQ命名服务地址，如果不设置的话默认为“”。




