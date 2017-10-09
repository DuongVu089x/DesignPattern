package com.dav.design.pattern.behavioral.observer.concreteObserver;

import com.dav.design.pattern.behavioral.observer.observer.Observer;
import com.dav.design.pattern.behavioral.observer.subject.Subject;

public class OctalObserver extends Observer {

	public OctalObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
	}
}