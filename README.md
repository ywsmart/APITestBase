# APITestBase
接口测试基础脚手架

## 描述
- src/main/java 存放接口封装
    - 包→模块
    - 类→子模块、功能
    - 方法→子功能、具体行为
    - src/main/java/utils 
- src/main/resources 存放配置文件和数据驱动的数据文件
    - src/main/resources/api 存放接口配置，单接口对于同名接口单文件
    - src/main/resources/config 存放依赖配置
    - src/main/resources/data 存放数据文件
- src/test/java 存放测试用例
    - 包→对应模块
    - 类→对应子模块、功能的Test
    - 方法→测试用例


## 技术栈
- RestAssured
- Junit5
- Allure2