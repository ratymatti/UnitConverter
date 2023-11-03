class TemperatureConverter {

    public static double convertTemperature(String unitToUnit, double temperature) {
        double result = .0;
        switch(unitToUnit) {
            case "Fahrenheit to Celcius":
                result = (temperature - 32) * 5/9;
                break;
            case "Celcius to Fahrenheit":
                result = (temperature * 9/5) + 32;
                break;
            case "Celcius to Kelvin":
                result = temperature + 273.15;
                break;
            case "Kelvin to Celcius":
                result = temperature - 273.15;
                break;
            case "Fahrenheit to Kelvin":
                result = (temperature - 32) * 5/9 + 273.15;
                break;
            case "Kelvin to Fahrenheit":
                result = ((temperature - 273.15) * 9/5) + 32;
                break;
            default:
                return .0;                       
        }

        return result;
    }
}
