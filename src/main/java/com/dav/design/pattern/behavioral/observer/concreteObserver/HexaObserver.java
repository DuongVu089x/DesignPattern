package com.dav.design.pattern.behavioral.observer.concreteObserver;

import com.dav.design.pattern.behavioral.observer.observer.Observer;
import com.dav.design.pattern.behavioral.observer.subject.Subject;

public class HexaObserver extends Observer {

	public HexaObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
	}
}
