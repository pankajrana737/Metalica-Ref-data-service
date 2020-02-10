package com.pankaj.metallica.MetalicaRefdataservice.bean;

import org.springframework.web.method.annotation.ExceptionHandlerMethodResolver;

public class GenericExceptionHandeler extends ExceptionHandlerMethodResolver{

	public GenericExceptionHandeler(Class<?> handlerType) {
		super(handlerType);
		// TODO Auto-generated constructor stub
	}

}
