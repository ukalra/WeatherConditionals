public class WeatherConditionals
{
    public static String getWeatherAdvice(int temperature, String description, String description2){

        if(description.equals("freezing") && description2.equals("cloudy")){}//example of a complex conditional 
        if(description.equals("windy")) return "Too windy or cold! Enjoy watching the weather through the window.";
        else if (description.equals("sunny")) return "It’s safe to go outside, 34 degrees and sunny.";
        else if (description.equals("snow")){
         if(temperature >= 33) return "It’s safe to go outside, 33 degrees and snow.";
         else return "Too windy or cold! Enjoy watching the weather through the window.";
        }
        //return temperature + " degrees, and " + description + ".";
        else return "idek";
    }
    public static String getHikingAdvice(int temp, String wind, String humid, String input){
            if(temp >= 65 && (input.equals("cloudy") || input.equals("Cloudy") || input.equals("CLOUDY"))){
                return("You’re in San Jose");
        }
        else if (input.equals("fair") || input.equals("Fair") || input.equals("FAIR")){
            return("You’re in San Jose");
        }
        else if (input.equals("snowy") || input.equals("Snowy") || input.equals("SNOWY") || temp < 65){
            return("you are in toronto");
        }
        else if (input.equals("hot") || input.equals("Hot") || input.equals("HOT")){
            return("you are not in toronto, thats for shore :D");
        }
        else if (input.equals("green") || input.equals("Green") || input.equals("GREEN")){
            return("you are in A Jungle");
        }
        else{
            return("Bring an umbrella");
        }
    }

    public static void main(){
       // System.out.println(getWeatherAdvice(32, "sunny", "rainy"));
       System.out.println(getHikingAdvice(32, "nochill", "warm", "rainy"));
    }
}
