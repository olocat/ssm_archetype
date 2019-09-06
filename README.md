![IDE](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-brightgreen.svg) ![Java](https://img.shields.io/badge/Java-1.8-blue.svg) ![Database](https://img.shields.io/badge/Database-MySQL-lightgrey.svg) 
# ssm_archetype

该项目是一个 ssm 项目模板，基本配置文件已经设好，经过简单修改或不修改即可用 

## 开发工具

| 工具   | 版本或描述           |    
| ----- | -------------------- |    
| OS    | Windows 10           |    
| JDK   | 1.8                  |    
| IDE   | IntelliJ IDEA 2019.3 |    
| Maven | 3.3.1                |    
| MySQL | 8.0                  |                

## 所使用框架版本

| jar     | 版本或描述     |    
| ------- | ------------- |    
| Spring  | 5.1.9-RELEASE |
| Mybatis | 3.5.2         |    
| Junit   | 4.11          | 
| jstl    | 1.2           |    
| mysql   | 8.0.17        |
| c3p0    | 0.9.5.4       |

### 其它见 pom.xml

### 使用说明
1. 将项目导入到自己所使用的IDE中（注意：使用Maven）
2. 自动或手动使其导入 pom.xml 中的资源
3. 修改数据库配置文件 src/main/resources/jdbc.properties 将配置改为自己的数据库
4. （可选）修改配置文件，添加自己所需（该项目已是最简的 ssm 框架了，如无需其它功能可以不做修改）
5. （可选）在 src/main/webapp/resources/ 下的几个资源文件中删除 .gitkeep 文件（可不删，该文件主要是用来使留空文件夹）
6. 开始写代码吧
