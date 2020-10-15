package dev.stoneworks.setechaves;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
class SwaggerConfig {

    @Bean
    public Docket segredoAPI() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("dev.stoneworks"))
                .paths(regex("/api/segredo.*"))
                .build()
                .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo() {
        return new ApiInfo(
                "Sete Chaves - API",
                "API REST da aplicação Sete Chaves. Métodos implementados: GET, POST e DELETE.",
                "1.0",
                "https://www.apache.org/licensen.html",
                new Contact("Felipe Bandeira", "https://www.stoneworks.dev", "fbandeirac@gmail.com"),
                "Apache License version 2.0",
                "hhttps://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList<VendorExtension>()
        );
    }
}