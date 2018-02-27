package com.github.charlesvhe.springcloud.practice.core.autoconfig;

import com.github.charlesvhe.springcloud.practice.core.cache.RedisTemplateBuilder;
import com.github.charlesvhe.springcloud.practice.core.lock.DistributedLockManager;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;

@ConditionalOnClass(RedisTemplate.class)
@Configuration
public class RedisAutoConfig {
    @Bean
    public RedisTemplateBuilder RedisTemplateBuilder() {
        return new RedisTemplateBuilder();
    }

    @Bean
    public DistributedLockManager distbutedLockManager() {
        return new DistributedLockManager();
    }
}
