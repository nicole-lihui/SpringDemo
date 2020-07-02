package com.maxwit;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value="file:/Users/nicole/tmp/application-dev.properties")
public class MyConfig {

}
