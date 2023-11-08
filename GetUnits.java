public class GetUnits {
    public static String getWeightUnits(int selection) {
        switch(selection) {
            case 1:
                return "Kilograms to Pounds";
            case 2:
                return "Pounds to Kilograms";
            case 3:
                return "Grams to Ounces";
            case 4:
                return "Ounces to Grams";
            case 5:
                return "Grams to Grains";
            case 6:
                return "Grains to Grams";
            default:
                return "Error.";         
        }
    }

    public static String getTemperatureUnits(int selection) {
        switch(selection) {
            case 1:
                return "Fahrenheit to Celcius";
            case 2:
                return "Celcius to Fahrenheit";
            case 3:
                return "Celcius to Kelvin";
            case 4:
                return "Kelvin to Celcius";
            case 5:
                return "Fahrenheit to Kelvin";
            case 6:
                return "Kelvin to Fahrenheit";
            default:
                return "Error.";         
        }
    }    
}
