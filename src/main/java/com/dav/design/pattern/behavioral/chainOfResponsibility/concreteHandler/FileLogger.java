package com.dav.design.pattern.behavioral.chainOfResponsibility.concreteHandler;

import com.dav.design.pattern.behavioral.chainOfResponsibility.handler.AbstractLogger;

public class FileLogger extends AbstractLogger {

	public FileLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("File::Logger: " + message);
	}
}