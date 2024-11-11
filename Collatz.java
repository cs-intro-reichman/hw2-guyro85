// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int seed = Integer.parseInt(args[0]);
		String mode = args[1];
		boolean reachedToOne = false;
		int count = 1;
		int step = 0;

		for (int i = 1; i <= seed; i++){
			step = i;
			if (mode.equals("v")){ 
				System.out.print(step + " "); // print the first number outside of the while loop
			}
			while (!reachedToOne){			
				if (step % 2 == 0){
					step /= 2;
				}
				else{
					step = (step * 3) + 1;
				}
				count++;
				if (mode.equals("v")){
					System.out.print(step + " ");
				}
				if (step == 1){
					reachedToOne = true;
					if (mode.equals("v")){
						System.out.println("(" + count + ")");
					}
				}
			}
			count = 1;
			reachedToOne = false;
		}
		System.out.printf("Every one of the first %d hailstone sequences reached 1.%n", seed);
	}
}
