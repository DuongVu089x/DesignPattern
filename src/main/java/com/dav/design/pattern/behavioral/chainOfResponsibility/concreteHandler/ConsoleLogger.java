package com.dav.design.pattern.behavioral.chainOfResponsibility.concreteHandler;

import com.dav.design.pattern.behavioral.chainOfResponsibility.handler.AbstractLogger;

public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("Standard Console::Logger: " + message);
	}
}