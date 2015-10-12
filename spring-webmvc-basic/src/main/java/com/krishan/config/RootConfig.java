package com.krishan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * Created by krishan on 10/11/15.
 */

@Configuration
@ComponentScan(
        basePackages = {"com.krishan"},
        excludeFilters = {
                @ComponentScan.Filter (type = FilterType.ANNOTATION, value = Configuration.class)
                //Exclude classes with annotaion @configuration
        }
)
public class RootConfig {
}
