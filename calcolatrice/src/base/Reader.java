package base;
import java.util.*;
import java.util.stream.Collectors;

import base.Calculator.Operation;

import base.Calculator.UnaryOperation;

public class Reader {

	private final Calculator c = new Calculator();
	private final List<String> buffer = new ArrayList<>(); 
	
	public void read(String input) {
		this.buffer.add(input);
	}
	
	public void printBuffer() {
		System.out.println(this.buffer);
	}
	
	public double calculate() {
		try {
			double first = Double.valueOf( this.buffer.get(0) );
			double second= Double.valueOf( this.buffer.get(2) );
			Operation op = Arrays.asList(Operation.values()).stream().filter(o -> o.toString() == this.buffer.get(1)).findFirst().get();
			return op.apply(first, second);
		}catch(Exception e) {
			UnaryOperation op = Arrays.asList(UnaryOperation.values()).stream().filter(o -> o.toString() == this.buffer.get(0)).findFirst().get();
			double first = Double.valueOf( this.buffer.get(1) );
			return op.apply(first);
		}
	}

	public void clearBuffer() {
		this.buffer.clear();
	}
	
	
}
