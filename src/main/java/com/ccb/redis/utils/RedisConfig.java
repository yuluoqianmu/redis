package com.ccb.redis.utils;

import org.apache.commons.pool2.impl.EvictionPolicy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by shaoml on 2019/8/14.
 */
@Configuration
public class RedisConfig {

    private static final Logger logger = LoggerFactory.getLogger(RedisConfig.class);

    @Value("${redis.maxIdle}")
    private String maxIdle;

    @Value("${redis.minIdle}")
    private String minIdle;

    @Value("${redis.maxTotal}")
    private String maxTotal;

    @Value("${redis.maxWaitMillis}")
    private String maxWaitMillis;

    @Value("${redis.blockWhenExhausted}")
    private String blockWhenExhausted;

    @Value("${redis.fairness}")
    private String fairness;

    @Value("${redis.jmxEnabled}")
    private String jmxEnabled;

    @Value("${redis.jmxNamePrefix}")
    private String jmxNamePrefix;

    @Value("${redis.jmxNameBase}")
    private String jmxNameBase;

    @Value("${redis.lifo}")
    private String lifo;

    @Value("${redis.evictionPolicyClassName}")
    private String evictionPolicyClassName;

    @Value("${redis.evictorShutdownTimeoutMillis}")
    private String evictorShutdownTimeoutMillis;

    @Value("${redis.timeBetweenEvictionRunsMillis}")
    private String timeBetweenEvictionRunsMillis;

    @Value("${redis.testOnCreate}")
    private String testOnCreate;

    @Value("${redis.testOnBorrow}")
    private String testOnBorrow;

    @Value("${redis.testOnReturn}")
    private String testOnReturn;

    @Value("${redis.testWhileIdle}")
    private String testWhileIdle;

    @Value("${redis.softMinEvictableIdleTimeMillis}")
    private String softMinEvictableIdleTimeMillis;

    @Value("${redis.minEvictableIdleTimeMillis}")
    private String minEvictableIdleTimeMillis;

    @Value("${redis.numTestsPerEvictionRun}")
    private String numTestsPerEvictionRun;

    public JedisPoolConfig getConfig() {
        JedisPoolConfig jedisConfig = new JedisPoolConfig();

        if (!StringUtils.isEmpty(maxIdle)) {
            jedisConfig.setMaxIdle(Integer.valueOf(maxIdle));
        }
        if (!StringUtils.isEmpty(minIdle)) {
            jedisConfig.setMinIdle(Integer.valueOf(minIdle));
        }
        if (!StringUtils.isEmpty(maxTotal)) {
            jedisConfig.setMaxTotal(Integer.valueOf(maxTotal));
        }
        if (!StringUtils.isEmpty(maxWaitMillis)) {
            jedisConfig.setMaxWaitMillis(Integer.valueOf(maxWaitMillis));
        }
        if (!StringUtils.isEmpty(blockWhenExhausted)) {
            jedisConfig.setBlockWhenExhausted(Boolean.valueOf(blockWhenExhausted));
        }

        if (!StringUtils.isEmpty(fairness)) {
            jedisConfig.setFairness(Boolean.valueOf(fairness));
        }
        if (!StringUtils.isEmpty(jmxEnabled)) {
            jedisConfig.setJmxEnabled(Boolean.valueOf(jmxEnabled));
        }
        if (!StringUtils.isEmpty(jmxNamePrefix)) {
            jedisConfig.setJmxNamePrefix(jmxNamePrefix);
        }
        if (!StringUtils.isEmpty(jmxNameBase)) {
            jedisConfig.setJmxNameBase(jmxNameBase);
        }
        if (!StringUtils.isEmpty(lifo)) {
            jedisConfig.setLifo(Boolean.valueOf(lifo));
        }

        if (!StringUtils.isEmpty(evictionPolicyClassName)) {
            jedisConfig.setEvictionPolicyClassName(evictionPolicyClassName);
        }
        if (!StringUtils.isEmpty(evictorShutdownTimeoutMillis)) {
            jedisConfig.setEvictorShutdownTimeoutMillis(Integer.valueOf(evictorShutdownTimeoutMillis));
        }
        if (!StringUtils.isEmpty(timeBetweenEvictionRunsMillis)) {
            jedisConfig.setTimeBetweenEvictionRunsMillis(Integer.valueOf(timeBetweenEvictionRunsMillis));
        }

        if (!StringUtils.isEmpty(softMinEvictableIdleTimeMillis)) {
            jedisConfig.setSoftMinEvictableIdleTimeMillis(Integer.valueOf(softMinEvictableIdleTimeMillis));
        }
        if (!StringUtils.isEmpty(minEvictableIdleTimeMillis)) {
            jedisConfig.setMinEvictableIdleTimeMillis(Integer.valueOf(minEvictableIdleTimeMillis));
        }
        if (!StringUtils.isEmpty(testWhileIdle)) {
            jedisConfig.setTestWhileIdle(Boolean.valueOf(testWhileIdle));
        }
        if (!StringUtils.isEmpty(testOnReturn)) {
            jedisConfig.setTestOnReturn(Boolean.valueOf(testOnReturn));
        }
        if (!StringUtils.isEmpty(testOnCreate)) {
            jedisConfig.setTestOnCreate(Boolean.valueOf(testOnCreate));
        }
        if (!StringUtils.isEmpty(testOnBorrow)) {
            jedisConfig.setTestOnBorrow(Boolean.valueOf(testOnBorrow));
        }
        if (!StringUtils.isEmpty(numTestsPerEvictionRun)) {
            jedisConfig.setNumTestsPerEvictionRun(Integer.valueOf(numTestsPerEvictionRun));
        }

        return jedisConfig;

    }
}
