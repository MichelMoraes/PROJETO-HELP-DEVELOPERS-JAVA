package com.br.devs.java.api.config;


import com.br.devs.java.api.exception.ErrorResponse;
import io.swagger.v3.core.converter.AnnotatedType;
import io.swagger.v3.core.converter.ModelConverters;
import io.swagger.v3.core.converter.ResolvedSchema;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.media.Content;
import io.swagger.v3.oas.models.media.MediaType;
import io.swagger.v3.oas.models.responses.ApiResponse;
import io.swagger.v3.oas.models.responses.ApiResponses;
import org.springdoc.core.customizers.OpenApiCustomiser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class OpenApiCustomizer {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(new Info()
                .title("Help Developers Api")
                .version("1.0.0")
                .description("<b>HDA</b></br>Aqui você encontrará exemplos de implementações."));
    }

    @Bean
    public OpenApiCustomiser customerGlobalHeaderOpenApiCustomiser() {
        return openApi -> openApi.getPaths().values().forEach(pathItem -> pathItem.readOperations().forEach(operation -> {
            ApiResponses apiResponses = operation.getResponses();
            MediaType mediaType = new MediaType();
            ResolvedSchema resolvedSchema = ModelConverters.getInstance()
                    .resolveAsResolvedSchema(new AnnotatedType(ErrorResponse.class));
            mediaType.schema(resolvedSchema.schema);
            ApiResponse apiResponse = new ApiResponse().description("Requisição inválida")
                    .content(new Content()
                            .addMediaType(org.springframework.http.MediaType.APPLICATION_JSON_VALUE, mediaType)) ;
            apiResponses.addApiResponse("400", apiResponse);
        }));
    }
}
