package com.dav.design.pattern.behavioral.state;

public class GMenu extends GState {

	@Override
	public void init(Game game) {
		// To do something to Initalize
		System.out.println("State: GMenu khoi tao....");
	}

	@Override
	public void run(Game game) {
		System.out.println("GMenu is running....");
		System.out.println();
		changeNextState(game);
	}

	@Override
	public void exit(Game game) {
		System.out.println("GMenu is exit....");
	}

	@Override
	protected void changeNextState(Game game) {
		System.out.println("Change state to >> GRun ");
        game.changeState(new GRun());
	}

}
