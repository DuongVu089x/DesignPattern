package com.dav.design.pattern.behavioral.observer.client;

import com.dav.design.pattern.behavioral.observer.concreteObserver.BinaryObserver;
import com.dav.design.pattern.behavioral.observer.concreteObserver.HexaObserver;
import com.dav.design.pattern.behavioral.observer.concreteObserver.OctalObserver;
import com.dav.design.pattern.behavioral.observer.subject.Subject;

public class ObserverPatternDemo {
	public static void main(String[] args) {
		Subject subject = new Subject();

		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);

		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println("Second state change: 10");
		subject.setState(10);
	}
}
