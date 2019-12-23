/*
package com.bhz.cims.iot.config;

import org.apache.ibatis.session.ExecutorType;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.core.io.Resource;

*/
/**
 * <p>
 * 文件名: [cims-spring-boot-event]com.bhz.cims.iot.config.MybatisProperties.java
 * </p>
 * <p>
 * 描述：TODO
 * </p>
 * <p>
 * 版权: Copyright (c) 2018 Huahong IC Design CO.LTD.
 * </p>
 * <p>
 * 公司: Beijing Huahong IC Design CO.LTD.
 * </p>
 * <p>
 * All right reserved.
 * </p>
 *
 * @创建时间：2018-08-17-15:14
 * @作者：Bruse.Wang
 * @版本： V1.0
 * <p>
 * 类修改者 修改日期 修改说明
 * </p>
 *//*

@ConfigurationProperties(prefix = MybatisProperties.MYBATIS_PREFIX)
@Scope(proxyMode = ScopedProxyMode.INTERFACES)
public class MybatisProperties {

    public static final String MYBATIS_PREFIX = "mybatis";

    */
/**
     * Config file path.
     *//*

    private String config;

    */
/**
     * Location of mybatis mapper files.
     *//*

    private Resource[] mapperLocations;

    */
/**
     * Package to scan domain objects.
     *//*

    private String typeAliasesPackage;

    */
/**
     * Package to scan handlers.
     *//*

    private String typeHandlersPackage;

    */
/**
     * Check the config file exists.
     *//*

    private boolean checkConfigLocation = false;

    */
/**
     * Execution mode.
     *//*

    private ExecutorType executorType = ExecutorType.SIMPLE;

    public String getConfig() {
        return this.config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public Resource[] getMapperLocations() {
        return this.mapperLocations;
    }

    public void setMapperLocations(Resource[] mapperLocations) {
        this.mapperLocations = mapperLocations;
    }

    public String getTypeHandlersPackage() {
        return this.typeHandlersPackage;
    }

    public void setTypeHandlersPackage(String typeHandlersPackage) {
        this.typeHandlersPackage = typeHandlersPackage;
    }

    public String getTypeAliasesPackage() {
        return this.typeAliasesPackage;
    }

    public void setTypeAliasesPackage(String typeAliasesPackage) {
        this.typeAliasesPackage = typeAliasesPackage;
    }

    public boolean isCheckConfigLocation() {
        return this.checkConfigLocation;
    }

    public void setCheckConfigLocation(boolean checkConfigLocation) {
        this.checkConfigLocation = checkConfigLocation;
    }

    public ExecutorType getExecutorType() {
        return this.executorType;
    }

    public void setExecutorType(ExecutorType executorType) {
        this.executorType = executorType;
    }
}*/
