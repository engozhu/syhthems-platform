# syhthems platform

## 简介

syhthems platform 是一个开源的IoT(物联网)平台。可以实现物联网产品的创建和管理、数据流的管理、终端设备的管理以及设备数据的图表形态查看。

## 技术栈

### 后台

- Java
- Spring Boot
- Spring Security
- Spring OAuth2
- SSM
- MBG (Mybatis Generator)
- 通用 Mapper
- MySQL 数据库
- Redis 缓存

### 前台

- VueJS
- Vuetify
- Vuex
- Vue Router

### 终端设备

- NodeMCU Develop Kit v1.0
- SHT20
- Arduino

## 平台功能

- 终端设备能够从传感器读取感知到的原始数据信息。
- 终端设备能够将读取到的原始数据转化为正确的温湿度数据。
- 终端设备能够通过 WiFi 芯片连接后台系统。
- 终端设备能够将温湿度数据传送到后台系统。
- 后台系统能够实现用户的登录和注册。
- 后台系统能够实现多客户端的 OAuth2（第二代开放授权标准） SSO 
（Single sign-on，单点登录）以及 JWT（JSON Web Tokens）功能和登出
功能。
- 后台系统能够实现用户的授权管理。
- 后台系统实现系统数据库表的增删查改功能。
- 后台系统能够实现方法级别的权限管理功能。
- 后台系统实现基本的 API 接口。
- 后台系统能够实现用户产品的创建和删除功能。
- 后台系统能够实现产品设备的管理功能。
- 后台系统能够实现设备数据流模板的管理。
- 后台系统能够接收终端设备发送过来的数据。
- 后台系统能够将设备发送的数据存储在关系型数据库或者时间序列数据
库中。
- 后台系统能够对数据进行分时间查询。
- 前台能够实现单页面应用。
- 前台能够实现 OAuth2 SSO，能够从后台 SSO 系统获得 token 以及实现
刷新令牌的功能。
- 前台能够实现页面的自适应布局。
- 前台能够实现导航菜单的动态获取和展示。
- 前台能够通过 AJAX（Asynchronous JavaScript and XML，异步的
JavaScript 与 XML 技术）向后台 API 发送请求。
- 前台能够实现部分数据的全局共享。
- 前台使用 Material Design（材料设计）。
- 前台能够实现用户的登出功能。
- 前台能够实时校验用户的登陆状态。
- 前台能够实现产品的创建和删除，并将数据发送给后台系统。
- 前台能够实现产品下设备的创建和删除，并将数据发送给后台系统。
- 前台能够实现对数据流模板的创建和删除，以及绑定模板到设备的功
能，并将数据发送给后台系统。
- 前台系统能够查看某个设备下的数据，并可以以图表的样式展示。
- 前台系统能够实现基本的错误处理。

## 平台预览

![首页](docs/media/首页.png)
> *平台首页*

![黑色主题](docs/media/黑色主题.png)
> *黑色主题*

![产品列表](docs/media/产品列表.png)
> *产品列表*

![添加产品](docs/media/添加产品.png)
> *添加产品*

![产品删除](docs/media/产品删除.png)
> *产品删除*

![产品详情](docs/media/产品详情.png)
> *产品详情*

![数据流模板管理](docs/media/数据流模板管理.png)
> *数据流模板管理*

![添加数据流](docs/media/添加数据流.png)
> *添加数据流*

![修改数据流](docs/media/修改数据流.png)
> *修改数据流*

![设备管理](docs/media/设备管理.png)
> *设备管理*

![添加设备](docs/media/添加设备.png)
> *添加设备*

![设备详情](docs/media/设备详情.png)
> *设备详情*

![设备数据流对应的数据点展示](docs/media/设备数据流对应的数据点展示.png)
> *设备数据流对应的数据点展示*

![数据点折线图](docs/media/数据点折线图.gif)
> *数据点折线图*

## 使用

**TODO**

## TODO

- 系统数据库的增删查改操作
- 适配时序数据库 influxDB v2.0 版本
- 跟进 Vuetify v2.0 版本
- 实现数据流和和设备的绑定等操作
- 实现用户角色的管理和角色的权限管理
- 适配多种终端设备通信协议
- 实现多种数据点查看样式
- 平台文档编写
- 代码清洗