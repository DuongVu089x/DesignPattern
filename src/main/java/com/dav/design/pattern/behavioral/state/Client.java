package com.dav.design.pattern.behavioral.state;

public class Client {

	public static void main(String[] args) {
		Game mini = new Game();
		System.out.println("Demo gia lap 1 man minigame su dung State");
		System.out.println("Cac tranh thai thay doi lan luot:");
		System.out.println("Start --> Menu --> Run --> GameOver\n\n");
		
		mini.init();
		mini.run();
		mini.exit();
		System.out.println();
	}

}
