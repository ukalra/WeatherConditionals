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
        else return "Bring an Umbrella!";
    }
    public static void main(){
        System.out.println(getWeatherAdvice(32, "sunny", "rainy"));
    }
}
