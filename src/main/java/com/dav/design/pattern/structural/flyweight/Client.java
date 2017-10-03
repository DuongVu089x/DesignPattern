package com.dav.design.pattern.structural.flyweight;

public class Client {

	public static void main(String[] args) {
		char[] document = {'A', 'Z', 'Z', 'A', 'A', 'Z'};
        CharacterFactory f = new CharacterFactory();
        int pointsize = 12;
        for (char c : document)
        {
            Character character = f.getCharacter(c);
            character.draw(pointsize);
        }
	}

}
