package base;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Calculator {

	public enum Operation implements OpIn {
		SUM("+", (a,b) -> a + b), DIFF("-", (a,b) -> a - b);
		
		private final String s;
		private final BinaryOperator<Double> op;
		private Operation(String s, BinaryOperator<Double> op) {
			this.s = s;
			this.op = op;
		}
		public double apply(double a, double b) {
			return this.op.apply(a, b);
		}
		
		public String toString() {
			return this.s;
		}
		
	}
	
	public enum UnaryOperation implements UnOpIn {
		ABS("abs", (a) -> Math.abs(a)), SQUAREROOT("sqrt", (a) -> Math.sqrt(a));
		
		private final String s;
		private final UnaryOperator<Double> op;
		private UnaryOperation(String s, UnaryOperator<Double> op) {
			this.s = s;
			this.op = op;
		}
		public double apply(double a) {
			return this.op.apply(a);
		}
		
		public String toString() {
			return this.s;
		}
		
	}
	
	
	
	public Calculator() {
		
		
	}
	
}
