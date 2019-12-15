# SpringModulesDemo

### Reference Documentation
该项目以最精简的代码演示SpringBoot 、Maven、多module工程结构以及mvn命令的使用

### 使用
1. 打包jar
```jshelllanguage
./mvnw clean package -Dmaven.test.skip=true
```
2. 将所有module发布到maven仓库
```jshelllanguage
./mvnw clean install -Dmaven.test.skip=true
```
3. 命令行run
> spring-boot:run 和 spring-boot:repackage 只会去maven仓库拉依赖，不会去module的target文件夹找依赖
所以在执行spring-boot:run 和 spring-boot:repackage前先 install 一下，将代码改动发布到maven仓库，如果不是多module的工程则不用install
```jshelllanguage
./mvnw clean install -Dmaven.test.skip=true && cd module-web && ../mvnw spring-boot:run -Dmaven.test.skip=true
```
4. 测试
```jshelllanguage
http://localhost:8080/test/hello
```
