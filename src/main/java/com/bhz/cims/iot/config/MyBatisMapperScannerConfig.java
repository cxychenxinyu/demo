/*
package com.bhz.cims.iot.config;

import com.bhz.cims.iot.dao.BaseDao;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import java.util.Properties;

*/
/**
 * Created by bruse on 17年7月3.
 * Mybatis MapperScannerConfigurer 自动扫描 将Mapper接口生成代理注入到Spring
 * Mybatis在与Spring集成的时候可以配置MapperFactoryBean来生成Mapper接口的代理
 *//*

@Configuration
//TODO 注意，由于MapperScannerConfigurer执行的比较早，所以必须有下面的注解
@AutoConfigureAfter(MybatisAutoConfiguration.class)
@Scope(proxyMode = ScopedProxyMode.INTERFACES)
public class MyBatisMapperScannerConfig {

    private static MapperScannerConfigurer mapperScannerConfigurer = null;
    @Bean
    public static MapperScannerConfigurer mapperScannerConfigurer() {
        mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.bhz.cims.iot.dao.mapper");
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        Properties properties = new Properties();
        properties.setProperty("mappers", BaseDao.class.getName());
        properties.setProperty("notEmpty", "false");
        properties.setProperty("IDENTITY", "MYSQL");
        mapperScannerConfigurer.setProperties(properties);
        return mapperScannerConfigurer;
    }
}
*/
