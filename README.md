# qoder-test

Spring Boot 3.x + MyBatis-Plus 项目

## 技术栈

- **Spring Boot**: 3.2.0
- **MyBatis-Plus**: 3.5.5
- **Java**: 17
- **MySQL**: 8.0+
- **Maven**: 3.9.6

## 项目结构

```
qoder-test/
├── src/main/java/com/example/qodertest/
│   ├── QoderTestApplication.java    # 主启动类
│   ├── config/                       # 配置类
│   │   ├── GlobalExceptionHandler.java
│   │   └── MybatisPlusConfig.java
│   ├── controller/                   # 控制器层
│   │   └── UserController.java
│   ├── entity/                       # 实体类
│   │   └── User.java
│   ├── mapper/                       # Mapper接口
│   │   └── UserMapper.java
│   └── service/                      # 服务层
│       ├── UserService.java
│       └── impl/
│           └── UserServiceImpl.java
├── src/main/resources/
│   └── application.yml               # 配置文件
├── pom.xml                           # Maven配置
└── schema.sql                        # 数据库初始化脚本
```

## 快速开始

### 1. 环境要求

- JDK 17 或更高版本
- MySQL 8.0 或更高版本
- Maven 3.6+（或使用项目自带的 mvnw）

### 2. 数据库配置

执行 `schema.sql` 文件创建数据库和表：

```bash
mysql -u root -p < schema.sql
```

修改 `src/main/resources/application.yml` 中的数据库连接信息：

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/qoder_test
    username: your_username
    password: your_password
```

### 3. 运行项目

使用 Maven Wrapper：
```bash
# Windows
mvnw.cmd spring-boot:run

# Linux/Mac
./mvnw spring-boot:run
```

或使用已安装的 Maven：
```bash
mvn spring-boot:run
```

### 4. 访问 API

项目启动后，访问 http://localhost:8080/api/users

#### API 接口列表

- `GET /api/users` - 获取所有用户
- `GET /api/users/{id}` - 根据ID获取用户
- `POST /api/users` - 创建新用户
- `PUT /api/users/{id}` - 更新用户
- `DELETE /api/users/{id}` - 删除用户（逻辑删除）
- `GET /api/users/page?current=1&size=10` - 分页查询
- `GET /api/users/search?username=张` - 搜索用户

## 功能特性

✅ RESTful API 设计  
✅ MyBatis-Plus 自动 CRUD  
✅ 分页查询支持  
✅ 逻辑删除  
✅ 全局异常处理  
✅ 自动填充创建/更新时间  
✅ Lambda 表达式查询  

## 注意事项

1. 确保 Java 版本为 17 或更高
2. 数据库用户名和密码需要根据实际情况修改
3. 首次运行需要下载依赖，请保持网络连接
