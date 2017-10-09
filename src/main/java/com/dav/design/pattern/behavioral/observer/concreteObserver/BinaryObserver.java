package com.dav.design.pattern.behavioral.observer.concreteObserver;

import com.dav.design.pattern.behavioral.observer.observer.Observer;
import com.dav.design.pattern.behavioral.observer.subject.Subject;

public class BinaryObserver extends Observer {

	public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
	}
}