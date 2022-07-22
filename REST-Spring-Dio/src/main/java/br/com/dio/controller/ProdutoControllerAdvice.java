package br.com.dio.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.dio.exceptions.ProdutoNullException;

@ControllerAdvice
public class ProdutoControllerAdvice extends ResponseEntityExceptionHandler{

	
	@ExceptionHandler(ProdutoNullException.class)
	public ResponseEntity<Object> capturaErrorNull(){
		
		Map<String, Object> bory = new HashMap<String, Object>();
		
		bory.put("mensage", "Existe campos não informados ao cadastrar o produto");
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(bory);
	}
}
