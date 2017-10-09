package com.dav.design.pattern.behavioral.state;

public class GStart extends GState {

	@Override
	public void init(Game game) {
		// To do something to Initalize
		System.out.println("State: GStart khoi tao....");
	}

	@Override
	public void run(Game game) {
		System.out.println("GStart is running....");
		System.out.println();
		changeNextState(game);
	}

	@Override
	public void exit(Game game) {
		System.out.println("GStart is exit....");
	}

	@Override
	protected void changeNextState(Game game) {
		System.out.println("Change state to >> GMenu");
        game.changeState(new GMenu());
	}

}
