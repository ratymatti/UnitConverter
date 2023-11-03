
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void printOptions() {
        System.out.println("Choose units to convert:");
        System.out.println("1. Fahrenheit to Celcius");
        System.out.println("2. Celcius to Fahrenheit");
        System.out.println("3. Celcius to Kelvin");
        System.out.println("4. Kelvin to Celcius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
    }

    public static String getUnits(int selection) {
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



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean running = true;

        System.out.println("\nWelcome to Temperature Converter!\n");

        while (running) {
            printOptions();

            boolean validInput = false;
            String unitsToConvert = "";

            while (!validInput) {
                try {
                    System.out.print("Enter your choice: ");
                    int selectedUnits = scanner.nextInt();

                    if (selectedUnits >= 1 && selectedUnits <= 6) {
                        unitsToConvert = getUnits(selectedUnits);
                        validInput = true;    
                    } else {
                        System.out.println("Invalid input. Please enter a number between 1-6.");    
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number between 1-6.");
                    scanner.nextLine();
                }
            }
            validInput = false;

            double temperature = 0.0;
            
            while (!validInput) {
                try {
                    System.out.print("Enter temperature you want to convert: ");
                    String temperatureInput = scanner.next();

                    // Replace commas with periods
                    temperatureInput = temperatureInput.replace(',', '.');
                    temperature = Double.parseDouble(temperatureInput);
                    validInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid numeric temperature.");
                }
            }

            double result = TemperatureConverter.convertTemperature(unitsToConvert, temperature);

            System.out.println("\n" + temperature + " " + unitsToConvert + " is " + result + "\n");

            scanner.nextLine();

            System.out.print("Do you want to convert some other temperature? (yes/no) ");
            String isContinue = scanner.nextLine().toLowerCase();

            if (isContinue.equals("no")) {
                running = false;
                System.out.println("\nGoodbye!\n");
            }
        }
        scanner.close();

    }
}
