package com.dav.design.pattern.behavioral.observer.observer;

import com.dav.design.pattern.behavioral.observer.subject.Subject;

public abstract class Observer {
	protected Subject subject;

	public abstract void update();
}