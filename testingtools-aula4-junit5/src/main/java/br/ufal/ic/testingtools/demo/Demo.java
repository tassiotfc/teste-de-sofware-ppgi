package br.ufal.ic.testingtools.demo;

import br.ufal.ic.testingtools.stack.Stack;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stack = new Stack<Integer>(10);
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.push(10);
		
		int i = 0;
		for (; i < 10; i++) {
			System.out.println("Valor "+ i + ":" + stack.pop().intValue());
		}
	}

}
