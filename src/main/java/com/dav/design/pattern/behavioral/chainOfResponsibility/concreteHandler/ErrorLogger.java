package com.dav.design.pattern.behavioral.chainOfResponsibility.concreteHandler;

import com.dav.design.pattern.behavioral.chainOfResponsibility.handler.AbstractLogger;

public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("Error Console::Logger: " + message);
	}
}