package com.dav.design.pattern.behavioral.state;

public abstract class GState {
	
	public abstract void init(Game game);

	public abstract void run(Game game);

	public abstract void exit(Game game);

	protected abstract void changeNextState(Game game);
}
