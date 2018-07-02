# tikie-eureka-config-server
spring cloud全家桶，各个组件整合使用之配置中心服务config-server

## eureka 配置中心：服务端
    
    提供服务端和客户端支持
    集中管理各环境的配置文件
    配置文件修改之后，可以快速的生效
    可以进行版本管理
    支持大的并发查询
    支持各种语言

    Spring Cloud Config项目是一个解决分布式系统的配置管理方案。它包含了Client和Server两个部分，
    server提供配置文件的存储、以接口的形式将配置文件的内容提供出去，client通过接口获取数据、并依据此数据初始化自己的应用。
    
![配置中心](https://images2018.cnblogs.com/blog/412010/201804/412010-20180427184127469-193417962.png)

### 参考网站
 + 相关学习博客，请查看[相关学习文档](https://www.cnblogs.com/xiaoliu66007/p/8963934.html "分布式配置中心(Spring Cloud Config)")
 + 如有任何问题欢迎联系作者：tikie
 
        qq:290315636
    
### 项目环境
 - Eclipse：Oxygen.3a Release (4.7.3a)
 
        彩色日志插件：http://www.mihai-nita.net/eclipse
 - jdk:1.8+
 - spring boot: 2.0.3.RELEASE
 - spring-cloud: Finchley.RELEASE

### 初始化操作
 1. NEW
 2. New Spring Starter Project
 3. Cloud Config
 4. Config Server
 
 + 运行服务提供者：TikieEurekaConfigServerApplication.java
    
        Run As
        Run Java Application或Spring Boot App
 + 或命令行启动方式：
 
        java -jar tikie-eureka-config-server-0.0.1-SNAPSHOT.jar.jar
 + 注册中心页面主节点：http://peer1:8761
 + 注册中心页面副节点：http://peer2:8761/
 + 可能需要修改provider-config-*.yml对应的值，在对应的客户端使用

 + *本项目的默认只提供dev分支的更新权限*
 
 + 设置默认push/pull行为(push当前分支到远程同名分支，如果远程同名分支不存在则自动创建同名分支)
    
       git config push.default "current"
       git config pull.default "current"
       
       #在对应的分支上执行：如dev分支
       git branch --set-upstream-to=origin/dev
 
### 其他相关项目
    1. eureka注册中心 > https://github.com/290315636/tikie-eureka-registry-center
    2. eureka服务提供者(可以有多个实例) > https://github.com/290315636/tikie-eureka-provider
    3. eureka服务消费者 > https://github.com/290315636/tikie-eureka-ribbon-consumer
    4. feign 服务消费者 > https://github.com/290315636/tikie-eureka-feign-consumer
    5. monitor断路器监控器 > https://github.com/290315636/tikie-eureka-monitor-client
    6. zuul路由（断路、过滤）控制器 > https://github.com/290315636/tikie-eureka-zuul
    7. config-server配置中心服务  > https://github.com/290315636/tikie-eureka-config-server
    8. config-client配置中心用户 > https://github.com/290315636/tikie-eureka-config-client
    9. bus
    
    注. 3、4可以选中其一,优先使用feign;5可以不用启动（使用时启动）
### 历史更新

    1.0.2 配置中心服务化，注册到注册中心你
    1.0.1 更新说明文档
    1.0.0 初始化服务提供者