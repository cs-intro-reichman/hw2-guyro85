// Prints a crowd cheering output.
public class Cheers {
    public static void main(String[] args) {
        String toCheer = args[0];
        int times = Integer.parseInt(args[1]);
        toCheer = toCheer.toUpperCase();
        char c;
        boolean anOrA = false;

        for (int i = 0; i < toCheer.length(); i++){
            c =  toCheer.charAt(i);
            switch (c) {
                case 'A':
                    anOrA = true;
                    break;
                case 'E':
                    anOrA = true;
                    break;
                case 'F':
                    anOrA = true;
                    break;
                case 'H':
                    anOrA = true;
                    break;
                case 'I':
                    anOrA = true;
                    break;
                case 'L':
                    anOrA = true;
                    break;
                case 'M':
                    anOrA = true;
                    break;
                case 'N':
                    anOrA = true;
                    break;
                case 'O':
                    anOrA = true;
                    break;
                case 'R':
                    anOrA = true;
                    break;
                case 'S':
                    anOrA = true;
                    break;
                case 'X':
                    anOrA = true;
                    break;         
                default:
                    break;
            }
            if (anOrA){
                System.out.println("Give me an " + c + ": " + c + "!");
            }
            else{
                System.out.println("Give me a  " + c + ": " + c + "!");
            }
        anOrA = false;
        }
        System.out.println("What does that spell?");
        for (int i = 0; i < times; i++){
                System.out.println(toCheer + "!!!");
        }
    }
}
