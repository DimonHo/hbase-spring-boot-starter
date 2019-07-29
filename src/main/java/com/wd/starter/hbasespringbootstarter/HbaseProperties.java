package com.wd.starter.hbasespringbootstarter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

/**
 * @Author: He Zhigang
 * @Date: 2019/7/26 18:07
 * @Description:
 */
@Data
@ConfigurationProperties(prefix = "hbase")
public class HbaseProperties {

    private Map<String, String> config;

}
