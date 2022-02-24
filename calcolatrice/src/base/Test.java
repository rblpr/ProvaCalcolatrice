package base;

public class Test {

	public static void main(String... args) {
		
		Reader reader = new Reader();
		
		reader.read("3");
		reader.read("-");
		reader.read("5");
//		reader.printBuffer();
		System.out.println(reader.calculate());
		reader.clearBuffer();
		
		reader.read("abs");
		reader.read("-3");
//		reader.printBuffer();
		System.out.println(reader.calculate());
		reader.clearBuffer();
		
		reader.read("sqrt");
		reader.read("15");
		System.out.println(reader.calculate());
		reader.clearBuffer();
	}
}
