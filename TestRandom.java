// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {
		double random = Math.random();
		int repetition = Integer.parseInt(args[0]);
		int countLow = 0;
		int countHigh = 0;
		double ratio = 0;
		for (int i = 0; i < repetition; i++){
			if (random > 0.5){
				countHigh++;
			}
			else{
				countLow++;
			}
			random = Math.random();
		}
		
		System.out.println("> 0.5:  " + countHigh);
		System.out.println("<= 0.5: " + countLow);
		if(countHigh != 0 && countLow != 0){
			if(countHigh > countLow){
				ratio = (double)countLow / countHigh;
			}
			else{
				ratio = (double)countHigh / countLow;
			}
			System.out.println("Ratio: " + ratio);
		}
	}
}
