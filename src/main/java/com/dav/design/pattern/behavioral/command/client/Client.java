package com.dav.design.pattern.behavioral.command.client;

import com.dav.design.pattern.behavioral.command.command.impl.TurnOffRadio;
import com.dav.design.pattern.behavioral.command.invoker.Invoker;
import com.dav.design.pattern.behavioral.command.receiver.RadioControl;

public class Client {

	public static void main(String[] args) {
		new Invoker(new TurnOffRadio(new RadioControl()));
	}

}
