/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
 public class GenThree {
	public static void main(String[] args) {     
		
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int num1 = (int) (Math.random() * (b - a) + a);
        int num2 = (int) (Math.random() * (b - a) + a);
        int num3 = (int) (Math.random() * (b - a) + a);

        int min = Math.min(Math.min(num1, num2), num3);

        System.out.println("The minimal number is: " + min);
    }
}
