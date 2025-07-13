package project1;

public class Overloading {
	
		// TODO Auto-generated method stub
		// add() method with two int parameters
		public int add(int a, int b) {
	        return a + b;
	    }
		// add() method with three int parameters
		 public int add(int a, int b, int c) {
		        return a + b + c;
		    }
		// add() method with two double parameters
		    public double add(double a, double b) {
		        return a + b;
		    }

		    // add() method with one int and one double parameter
		    public double add(int a, double b) {
		        return a + b;
		    }

		    // add() method with one double and one int parameter
		    public double add(double a, int b) {
		        return a + b;
		    }
		    public static void main(String[] args) {
		        Overloading calc= new Overloading();

		        System.out.println("add(int, int): " + calc.add(5, 10));
		        System.out.println("add(int, int, int): " + calc.add(1, 2, 3));
		        System.out.println("add(double, double): " + calc.add(2.5, 3.5));
		        System.out.println("add(int, double): " + calc.add(4, 2.5));
		        System.out.println("add(double, int): " + calc.add(6.5, 2));
		    }

}
