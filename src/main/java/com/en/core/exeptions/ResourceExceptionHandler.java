package com.en.core.exeptions;

import javax.servlet.ServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandartError> objectNotFound(ObjectNotFoundException e, ServletRequest request) {
		StandartError error = new StandartError(System.currentTimeMillis(), HttpStatus.NOT_FOUND.value(),
				e.getMessage(), e.getUserMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}
}
