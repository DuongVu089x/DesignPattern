package com.dav.design.pattern.behavioral.state;

public class Game {

	private GState gstate;

	public Game() {
		this.gstate = new GStart();
	}

	public void init() {
		gstate.init(this);
	}

	public void run() {
		for (int i = 0; i < 4; i++) {
			gstate.run(this);
		}
	}

	public void exit() {
		gstate.exit(this);
	}

	public void changeState(GState state) {
		gstate = state;
	}
}
