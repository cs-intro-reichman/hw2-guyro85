// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int depth = Integer.parseInt(args[0]);
		double sum = 1;
		boolean addOrSub = false;
		for (int i = 3; i < depth * 2; i += 2){
			if (addOrSub){
				sum += (double)1 / i;
			}
			else{
				sum -= (double)1 / i;
			}

			addOrSub = !addOrSub;
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + sum * 4);
	}
}
