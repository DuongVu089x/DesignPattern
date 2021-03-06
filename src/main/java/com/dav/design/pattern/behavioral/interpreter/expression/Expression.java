package com.dav.design.pattern.behavioral.interpreter.expression;

import com.dav.design.pattern.behavioral.interpreter.context.Context;

public abstract class Expression {

	public void interpreter(Context context) {
		
		if (context.input.length() == 0)
			return;
		
		if (context.input.startsWith(nine())) {
			context.output += 9 * multiplier();
			context.input = context.input.substring(2);
		}
		if (context.input.startsWith(four())) {
			context.output += 4 * multiplier();
			context.input = context.input.substring(2);
		}
		if (context.input.startsWith(one())) {
			context.output += 1 * multiplier();
			context.input = context.input.substring(1);
		}

		if (context.input.startsWith(five())) {
			context.output += 5 * multiplier();
			context.input = context.input.substring(1);
		}
	}

	abstract public String one();

	abstract public String four();

	abstract public String five();

	abstract public String nine();

	abstract public int multiplier();
}
