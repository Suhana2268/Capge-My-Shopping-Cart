package com.capg.mse.MyShoppingApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@Configuration
public class MyShoppingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyShoppingAppApplication.class, args);
	}
	
	
	@Bean
	public Docket docket() {
		
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().build();
		
	}
	
	private ApiInfo apiInfo() {
		
		return new ApiInfoBuilder().title("My Electronic Store").description("contains api to manipulate product inventory").version("myproductappV1.1").build(); 
	}

}
