package com.luyanjia.myapp.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author luyanjia
 * @date 2022/10/31
 * version 1.0
 */
@Configuration
@ComponentScan("com.luyanjia.myapp.controller")
public class SwaggerConfig {


    @Bean
    public Docket createRestApi() {

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .enable(false)
                .groupName("myapp接口")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.luyanjia.myapp.controller"))
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();

    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("myapp接口")
                .description("此文档仅供开发人员使用")
                .termsOfServiceUrl("http://localhost:8085/")
                .contact(new Contact("myapp", "http://localhost:8085", ""))
                .version("1.0")
                .build();
    }
}
