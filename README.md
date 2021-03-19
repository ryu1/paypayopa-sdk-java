# PayPay SDK - JAVA Compatible with Spring Framework 3

Forked from https://github.com/paypay/paypayopa-sdk-java

settings.xml
```
<?xml version="1.0" encoding="UTF-8"?>
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 http://maven.apache.org/xsd/settings-1.0.0.xsd">
    <servers>
        <server>
            <id>github</id>
            <username>ryu1</username>
            <password>ec98fb5b00ae93bf8f10ea76d2afeead75c54e12</password>
        </server>
    </servers>
</settings>
```

pom.xml
```
<repository>
    <id>github</id>
    <url>https://maven.pkg.github.com/ryu1/paypayopa-sdk-java</url>
    <releases>
        <enabled>true</enabled>
    </releases>
    <snapshots>
        <enabled>true</enabled>
    </snapshots>
</repository>
```

```
<dependency>
    <groupId>jp.ne.paypay</groupId>
    <artifactId>paypayopa</artifactId>
    <version>1.0.1.compatible-with-spring3</version>
</dependency>`
```

