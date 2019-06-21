### logback-config
`关于logback的一些基本的配置`
```xml
<?xml version="1.0" encoding="UTF-8"?>
<configuration>

  <appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
    <layout class="ch.qos.logback.classic.PatternLayout">
      <Pattern>%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n</Pattern>
    </layout>
  </appender>
  
  <logger name="logback.demo" level="TRACE"/>
  

  <root level="debug">
    <appender-ref ref="STDOUT" />
  </root>
</configuration>
```
test
