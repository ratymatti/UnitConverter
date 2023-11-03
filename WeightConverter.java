public class WeightConverter {

    public static double convertWeight(String unitToUnit, double weight) {
        switch(unitToUnit) {
            case "Kilograms to Pounds":
                return weight * 2.20462;
            case "Pounds to Kilograms":
                return weight / 2.20462;
            case "Grams to Ounces":
                return weight / 28.3495;
            case "Ounces to Grams":
                return weight * 28.3495;
            case "Grams to Grains":
                return weight * 15.4323584;
            case "Grains to Grams":
                return weight / 15.4323584; 
            default:
                return .0;
        }    
    }
}
