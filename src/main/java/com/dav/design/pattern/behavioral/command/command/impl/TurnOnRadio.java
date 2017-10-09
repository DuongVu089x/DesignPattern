package com.dav.design.pattern.behavioral.command.command.impl;

import com.dav.design.pattern.behavioral.command.command.RadioCommand;
import com.dav.design.pattern.behavioral.command.receiver.RadioControl;

public class TurnOnRadio implements RadioCommand {

	private RadioControl radioControl;

	public TurnOnRadio(RadioControl radioControl) {
		this.radioControl = radioControl;
	}

	@Override
	public void execute() {
		this.radioControl.turnOn();
	}

}
