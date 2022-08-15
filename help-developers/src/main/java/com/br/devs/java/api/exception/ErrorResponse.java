package com.br.devs.java.api.exception;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)

public class ErrorResponse {

	@Builder.Default
	private LocalDateTime time = LocalDateTime.now();
	
	private Integer status;
	
	private String error;
	
	private String message;
	
	private Map<String, Set<String>> requiredFields;
}
