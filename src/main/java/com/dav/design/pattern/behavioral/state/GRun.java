package com.dav.design.pattern.behavioral.state;

public class GRun extends GState {

	@Override
	public void init(Game game) {
		// To do something to Initalize
		System.out.println("State: GRun khoi tao....");
	}

	@Override
	public void run(Game game) {
		System.out.println("GRun  is running....");
		System.out.println();;
		changeNextState(game);
	}

	@Override
	public void exit(Game game) {
        System.out.println("GRun  is exit....");
	}

	@Override
	protected void changeNextState(Game game) {
		 System.out.println("Change state to >> GOver");
         game.changeState(new GOver());
	}

}
