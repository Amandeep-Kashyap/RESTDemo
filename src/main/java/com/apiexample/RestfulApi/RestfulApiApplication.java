package com.apiexample.RestfulApi;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
		title = "Restful API",
		version = "1.0",
		description = "First Spring boot App",
		contact = @Contact(
				name = "Amandeep Kashyap",
				email = "amandeepkashyap@gmail.com",
				url = "https://www.instagram.com"
		),
		license = @License(
				name = "Apache.com",
				url = "www.dummyurl.com"
		)
), externalDocs = @ExternalDocumentation(
		description = "First Rest Api Documentation",
		url = "www.externaldocument.com"
)
)
public class RestfulApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulApiApplication.class, args);
	}

}
