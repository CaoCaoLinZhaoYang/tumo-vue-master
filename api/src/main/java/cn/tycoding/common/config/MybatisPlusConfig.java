package cn.tycoding.common.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringBootVersion;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.SpringVersion;

/**
 * @author tycoding
 * @date 2019-09-09
 */
@Configuration
@MapperScan("cn.tycoding.system.mapper")
@Slf4j
public class MybatisPlusConfig {

    /**
     * Mybatis-Plus 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        log.info("进入myBatis分页插件配置======");
        String springVersion = SpringVersion.getVersion();
        String springBootVersion = SpringBootVersion.getVersion();
        log.info("使用的Srping版本是======" +springVersion);
        log.info("使用的SpringBoot版本是======" +springBootVersion);
        return new PaginationInterceptor();
    }
}
