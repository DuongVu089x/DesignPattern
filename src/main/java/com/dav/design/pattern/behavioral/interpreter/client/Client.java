package com.dav.design.pattern.behavioral.interpreter.client;

import java.util.LinkedList;
import java.util.List;

import com.dav.design.pattern.behavioral.interpreter.context.Context;
import com.dav.design.pattern.behavioral.interpreter.expression.Expression;
import com.dav.design.pattern.behavioral.interpreter.expression.HundredExpresssion;
import com.dav.design.pattern.behavioral.interpreter.expression.OneExpresssion;
import com.dav.design.pattern.behavioral.interpreter.expression.TenExpresssion;
import com.dav.design.pattern.behavioral.interpreter.expression.ThousandExpresssion;

public class Client {

	public static void main(String[] args) {

		List<Expression> parse = new LinkedList<Expression>();

		Context context = new Context("MCMLXXXIV");

		parse.add(new ThousandExpresssion());
		parse.add(new HundredExpresssion());
		parse.add(new TenExpresssion());
		parse.add(new OneExpresssion());

		while (context.input.length() != 0) {
			for (Expression exp : parse)
				exp.interpreter(context);
		}
		System.out.println(context.output);

	}

}
