package com.dav.design.pattern.behavioral.command.invoker;

import com.dav.design.pattern.behavioral.command.command.RadioCommand;

public class Invoker {
	
	RadioCommand radioCommand;
	
	public Invoker(RadioCommand radioCommand) {
		this.radioCommand = radioCommand;
		radioCommand.execute();
	}
}
