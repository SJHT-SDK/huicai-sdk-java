# 恒通荟采开放平台服务端SDK FOR JAVA

HUI CAI SDK for Java让您不用复杂编程即可访问恒通荟采开放平台开放的各项能力，SDK可以自动帮您满足能力调用过程中所需的基础校验、加签、验签、发送HTTP请求等非功能性要求。

适用于 Java 语言、JDK 版本 1.8 及以上的开发环境。

### SDK下载

[Github](https://github.com/SJHT-SDK/huicai-sdk-java.git)

[Gitee](https://gitee.com/sjht-sdk/huicai-sdk-java.git)

### Maven仓库配置

目前荟采开放平台SDK暂不支持Maven中央仓库，因此需使用荟采开放平台SDK的接入方需配置世纪恒通Maven仓库地址。

``` xml
<repositories>
    <repository>
        <id>sjht-sdk</id>
        <name>sjht-sdk</name>
        <url>https://maven.cyzl.com/repository/public/</url>
     </repository>
</repositories>
```

### Maven依赖配置

为方便接入方方便快捷的接入恒通荟采开放平台的各项开放服务能力，本 SDK 提供了统一的全量Maven依赖，同时接入方也可以根据自身需求只引入指定模块的Maven依赖。

- 全量引入

``` xml
<dependency>
    <groupId>com.sjht.sdk</groupId>
    <artifactId>huicai-sdk-all</artifactId>
    <version>${version}</version>
</dependency>
```

- 虚拟数字权益模块

``` xml
<dependency>
    <groupId>com.sjht.sdk</groupId>
    <artifactId>huicai-sdk-virtual</artifactId>
    <version>${version}</version>
</dependency>
```

- 实物商品模块

``` xml
<dependency>
    <groupId>com.sjht.sdk</groupId>
    <artifactId>huicai-sdk-physical</artifactId>
    <version>${version}</version>
</dependency>
```

- 到家服务模块

``` xml
<dependency>
    <groupId>com.sjht.sdk</groupId>
    <artifactId>huicai-sdk-onsite</artifactId>
    <version>${version}</version>
</dependency>
```

- 出行服务模块

``` xml
<dependency>
    <groupId>com.sjht.sdk</groupId>
    <artifactId>huicai-sdk-travel</artifactId>
    <version>${version}</version>
</dependency>
```

- 荟采商城H5模块

``` xml
<dependency>
    <groupId>com.sjht.sdk</groupId>
    <artifactId>huicai-sdk-h5</artifactId>
    <version>${version}</version>
</dependency>
```

### 调用示例

SDK实现了大部分API的直接调用，以虚拟数字权益模块充值创建订单API为例，通过初始化客户端**HuicaiApiClient**，调用数字权益订单**VirtualOrderService**服务类的**create**方法即可。

``` java
HuicaiApiConfig config = HuicaiApiConfig.builder()
            .serverUrl("https://testdj.cyzl.com")//世纪恒通API域名，不填默认为生产环境域名https://open.sjht.com
            .appId("***pbotna*******")//世纪恒通AppId
            .appSecret("********814847869e9ebd**********")//世纪恒通App秘钥
            .encryptSecretKey("*****xOAny7a9X**********")//世纪恒通API使用3DES加解密秘钥
            .logWitch(true)//是否开启API调用日志打印，默认为false关闭
            .build();
HuicaiApiClient client= new DefaultApiClient(config);

VirtualOrderCreateRequest request = new VirtualOrderCreateRequest();
request.setAppOrderNo("***11986**********");
request.setUserMobile("13800000000");
request.setSkuId("***53856**********");
VirtualOrderCreateRequest.RechargeAccount rechargeAccount = new VirtualOrderCreateRequest.RechargeAccount();
rechargeAccount.setPhone("13800000000");
request.setAccounts(rechargeAccount);
request.setNotifyUrl("https://www.xxx.com/notifyUrl");
Result<VirtualOrderCreateResponse> response = new VirtualOrderService(client).create(request);
```

对于部分在SDK中未实现的API或接入方需自定义请求参数及响应参数的情况，接入方可直接调用**HuicaiApiClient**中的**execute**或**executeToList**方法，实现指定API的快速调用。如下所示以调用数字权益商品详情API为例：

``` java
JSONObject params = new JSONObject();
params.put("goodsId", "1853359363201175554");
Result<VirtualGoodsDetailsResponse> result = client.execute("/virtual/goods/details", params, VirtualGoodsDetailsResponse.class);
```

### 通知回调验签示例

SDK提供了世纪恒通荟采开放平台回调通知接入方服务器的API签名校验方法，接入方可直接使用该方法进行回调通知的签名校验，确保通知数据的安全。如下以数字权益订单状态回调为例：

``` java
@PostMapping("/callbackNotify")
public EncryptModel callbackNotify(@RequestBody EncryptModel input) {
    HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    HuicaiApiConfig config = HuicaiApiConfig.builder()
            .appId("***pbotna*******")//世纪恒通AppId
            .appSecret("********814847869e9ebd**********")//世纪恒通App秘钥
            .encryptSecretKey("*****xOAny7a9X**********")//世纪恒通API使用3DES加解密秘钥
            .build();
    return new HuicaiNotifyService(config).notifyVerify(input, request, params -> {
        log.info("回调数据-->{}", params.toJSONString());
        //根据解密后的回调请求数据params，在此处处理签名校验成功后的业务逻辑
    }, VirtualOrderNotifyResult.class);
}
```

### SDK使用Demo下载

[Github](https://github.com/SJHT-SDK/huicai-sdk-java-demo.git)

[Gitee](https://gitee.com/sjht-sdk/huicai-sdk-java-demo.git)

### 恒通开放平台API文档

[https://open.sjht.com/docs/](https://open.sjht.com/docs/)

### 关于OpenAPI规范（OAS）

OpenAPI规范（OAS），是定义一个标准的、与具体编程语言无关的RESTful API的规范，您可查阅 [OAS官网](https://www.openapis.org) 了解更多。

## 问题

不管您在使用SDK的过程中遇到任何问题，欢迎前往 [恒通荟采开放平台意见反馈模块](https://txc.qq.com/products/642829) 发帖与世纪恒通工作人员和其他开发者一起交流，或直接联系世纪恒通技术对接同学。

