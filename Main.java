
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void printOptions(String selection) {
        
        switch(selection) {
            case "Units":
                System.out.println("Choose units to convert:");
                System.out.println("1: Temperatures");
                System.out.println("2: Weights");
                break;
            case "Temperatures":
                System.out.println("\n1. Fahrenheit to Celcius");
                System.out.println("2. Celcius to Fahrenheit");
                System.out.println("3. Celcius to Kelvin");
                System.out.println("4. Kelvin to Celcius");
                System.out.println("5. Fahrenheit to Kelvin");
                System.out.println("6. Kelvin to Fahrenheit");
                break;
            case "Weights":
                System.out.println("\n1. Kilograms to Pounds");
                System.out.println("2. Pounds to Kilograms");
                System.out.println("3. Grams to Ounces");
                System.out.println("4. Ounces to Grams");
                System.out.println("5. Grams to Grains");
                System.out.println("6. Grains to Grams");
                break;    
        }
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

        System.out.println("\nWelcome to Unit Converter!\n");

        while (running) {
            printOptions("Units");

            boolean validInput = false;
            String selection = "";

            while (!validInput) {
                try {
                    System.out.print("\nEnter your choice: ");
                    int selectedUnits = scanner.nextInt();

                    if (selectedUnits >= 1 && selectedUnits <= 2) {
                        if (selectedUnits == 1) {
                            selection = "Temperatures";
                        } else if (selectedUnits == 2) {
                            selection = "Weights";
                        }
                        validInput = true;    
                    } else {
                        System.out.println("Invalid input. Please enter a number between 1-2.");    
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number between 1-2.");
                    scanner.nextLine();
                }
            }
            validInput = false;

            if (selection.equals("Temperatures")) {
                doTemperatureConversions(scanner);
            } else {
                System.out.println("Under construction...\n");
            }
            scanner.nextLine();
            System.out.print("Do you want to quit? (yes/no) ");
            String isQuit = scanner.nextLine().toLowerCase();

            if (isQuit.equals("yes")) {
                running = false;
            }

        }
        System.out.println("\nGoodbye!\n");
        scanner.close();

    }

    public static void doTemperatureConversions(Scanner scanner) {
        double temperature = 0.0;
        boolean running = true;
        String unitsToConvert = "";

        while (running) {
            boolean validInput = false;

            printOptions("Temperatures");

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
            }
        }       
    }
}
