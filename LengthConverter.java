public class LengthConverter {

    public static double convertLength(String unitToUnit, double length) {
        switch(unitToUnit) {
            case "Meters to Feet":
                return length / 0.3048;
            case "Feet to Meters":
                return length * 0.3048;
            case "Centimeters to Inches":
                return length / 2.54;
            case "Inches to Centimeters":
                return length * 2.54;
            case "Meters to Yards":
                return length / 0.9144;
            case "Yards to Meters":
                return length * 0.9144;
            case "Kilometers to Miles":
                return length / 1.60934;
            case "Miles to Kilometers":
                return length * 1.60934;                            
            default:
                return .0;    
        }
    }
}
