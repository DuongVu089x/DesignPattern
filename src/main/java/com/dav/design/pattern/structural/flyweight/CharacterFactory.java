package com.dav.design.pattern.structural.flyweight;

import java.util.Hashtable;

public class CharacterFactory {
	
	private Hashtable characters = new Hashtable();

	public Character getCharacter(char key) {
		Character character = (Character) characters.get(key);
		if (character == null) {
			switch (key) {
			case 'A':
				character = new CharacterA();
				break;
			case 'Z':
				character = new CharacterZ();
				break;
			}
			characters.put(key, character);
		}
		return character;
	}
}
