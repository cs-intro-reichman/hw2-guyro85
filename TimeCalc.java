public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);
        int totalMinuts = hours * 60 + minutes + minutesToAdd;
        int totalHours = totalMinuts / 60;
        int newHours = totalHours % 24;
        int newMinuts = totalMinuts % 60;
        String amp = "";
        if (newHours < 10){
            amp = "0";
        }
		if (newMinuts < 10){
			System.out.println(amp + newHours + ":0" + newMinuts + " ");
		}
		else{
			System.out.println(amp + newHours + ":" + newMinuts + " ");
		}
    }
}
