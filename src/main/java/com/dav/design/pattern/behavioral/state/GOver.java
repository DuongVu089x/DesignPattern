package com.dav.design.pattern.behavioral.state;

public class GOver extends GState {

	@Override
	public void init(Game game) {
		// To do something to Initalize
		System.out.println("State: GOver khoi tao....");
	}

	@Override
	public void run(Game game) {
		System.out.println("GOver is running....");
        System.out.println();
        changeNextState(game);
	}

	@Override
	public void exit(Game game) {
        System.out.println("GOver is exit....");
	}

	@Override
	protected void changeNextState(Game game) {
        System.out.println("Change state to next State or EXit");
	}

}
