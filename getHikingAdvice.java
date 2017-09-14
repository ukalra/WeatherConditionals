
/**
 * Write a description of class getHikingAdvice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class getHikingAdvice
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class getHikingAdvice
     */
    public getHikingAdvice()
    {
        // initialise instance variables
        x = 0;
    }

    public static String gimmeString(String input){
            if(input.equals("cloudy") || input.equals("Cloudy") || input.equals("CLOUDY")){
                return("You’re in San Jose");
        }
        else if (input.equals("fair") || input.equals("Fair") || input.equals("FAIR")){
            return("You’re in San Jose");
        }
        else if (input.equals("snowy") || input.equals("Snowy") || input.equals("SNOWY")){
            return("you are in toronto");
        }
        else if (input.equals("hot") || input.equals("Hot") || input.equals("HOT")){
            return("you are not in toronto");
        }
        else if (input.equals("green") || input.equals("Green") || input.equals("GREEN")){
            return("you are in A Jungle");
        }
        else{
            return("Bring an umbrella");
        }
    }
    public static void main(){
     System.out.print(gimmeString("snowy"));   //returns “you are in toronto”
    }
}
