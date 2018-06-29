# tikie-eureka-config-server
spring cloud全家桶，各个组件整合使用之配置中心服务config-server

## eureka 配置中心：服务端
    
    分布式系统中，由于服务数量巨多，为了方便服务配置文件统一管理，实时更新，所以需要分布式配置中心组件。
    Config Server用于配置属性的存储，存储的位置可以为Git仓库、SVN仓库、本地文件等，Config Client用于服务属性的读取。
    
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
 + 需要根据启动的消费者修改application.yml配置（app-config）

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

    1.0.1 更新说明文档
    1.0.0 初始化服务提供者