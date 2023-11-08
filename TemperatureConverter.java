class TemperatureConverter {

    public static double convertTemperature(String unitToUnit, double temperature) {
        switch(unitToUnit) {
            case "Fahrenheit to Celcius":
                return (temperature - 32) * 5/9;
            case "Celcius to Fahrenheit":
                return (temperature * 9/5) + 32;
            case "Celcius to Kelvin":
                return temperature + 273.15;
            case "Kelvin to Celcius":
                return temperature - 273.15;
            case "Fahrenheit to Kelvin":
                return (temperature - 32) * 5/9 + 273.15;
            case "Kelvin to Fahrenheit":
                return ((temperature - 273.15) * 9/5) + 32;
            default:
                return .0;                       
        }
    }
}
