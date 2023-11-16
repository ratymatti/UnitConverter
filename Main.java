import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void printOptions(String selection) {
        
        switch(selection) {
            case "Units":
                System.out.println("\nChoose units to convert:");
                System.out.println("1: Temperatures");
                System.out.println("2: Weights");
                System.out.println("3. Lengths");
                System.out.println("\nOr type 'quit' to exit program.");
                break;
            case "Temperatures":
                System.out.println("\n1. Fahrenheit to Celcius");
                System.out.println("2. Celcius to Fahrenheit");
                System.out.println("3. Celcius to Kelvin");
                System.out.println("4. Kelvin to Celcius");
                System.out.println("5. Fahrenheit to Kelvin");
                System.out.println("6. Kelvin to Fahrenheit\n");
                break;
            case "Weights":
                System.out.println("\n1. Kilograms to Pounds");
                System.out.println("2. Pounds to Kilograms");
                System.out.println("3. Grams to Ounces");
                System.out.println("4. Ounces to Grams");
                System.out.println("5. Grams to Grains");
                System.out.println("6. Grains to Grams\n");
                break;
            case "Lengths":
                System.out.println("\n1. Meters to Feet");
                System.out.println("2. Feet to Meters");
                System.out.println("3. Centimeters to Inches");
                System.out.println("4. Inches to Centimeters");
                System.out.println("5. Meters to Yards");
                System.out.println("6. Yards to Meters");
                System.out.println("7. Kilometers to Miles");
                System.out.println("8. Miles to Kilometers\n");        
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean running = true;

        System.out.println("\nWelcome to Unit Converter!");

        while (running) {
            printOptions("Units");

            boolean validInput = false;
            String selection = "";

            while (!validInput) {
                try {
                    System.out.print("\nEnter your choice: ");
                    String selectedAction = scanner.nextLine();
                    int selectedNumber = 0;

                    if (selectedAction.toLowerCase().equals("quit")) {
                        System.out.println("\nGoodbye!\n");
                        scanner.close();
                        System.exit(0);
                    } else {
                        selectedNumber = Integer.parseInt(selectedAction);
                    }

                    if (selectedNumber >= 1 && selectedNumber <= 3) {
                        if (selectedNumber == 1) {
                            selection = "Temperatures";
                        } else if (selectedNumber == 2) {
                            selection = "Weights";
                        } else if (selectedNumber == 3) {
                            selection = "Lengths";
                        }

                        validInput = true;

                    } else {
                        System.out.println("Invalid input. Please enter a number between 1-3.");    
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number between 1-3.");
                    scanner.nextLine();
                }
            }
            validInput = false;

            if (selection.equals("Temperatures")) {
                doTemperatureConversions(scanner);
            } else if (selection.equals("Weights")) {
                doWeightConversions(scanner);     
            } else if (selection.equals("Lengths")) {
                doLengthConversions(scanner);
            }
        }
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
                        unitsToConvert = GetUnits.getTemperatureUnits(selectedUnits);
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
                    System.out.print("\nEnter temperature you want to convert: ");
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

    public static void doWeightConversions(Scanner scanner) {
        double weight = 0.0;
        boolean running = true;
        String unitsToConvert = "";

        while (running) {
            boolean validInput = false;

            printOptions("Weights");

            while (!validInput) {
                try {
                    System.out.print("Enter your choice: ");
                    int selectedUnits = scanner.nextInt();

                    if (selectedUnits >= 1 && selectedUnits <= 6) {
                        unitsToConvert = GetUnits.getWeightUnits(selectedUnits);
                        System.out.println(unitsToConvert);
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
                    System.out.print("\nEnter weight you want to convert: ");
                    String weightInput = scanner.next();

                    // Replace commas with periods
                    weightInput = weightInput.replace(',', '.');
                    weight = Double.parseDouble(weightInput);
                    validInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid numeric weigth.");
                }
            }

            double result = WeightConverter.convertWeight(unitsToConvert, weight);

            System.out.println("\n" + weight + " " + unitsToConvert + " is " + result + "\n");

            scanner.nextLine();

            System.out.print("Do you want to convert some other weight? (yes/no) ");
            String isContinue = scanner.nextLine().toLowerCase();

            if (isContinue.equals("no")) {
                running = false;
            }
        } 
    }

    public static void doLengthConversions(Scanner scanner) {
        double length = 0.0;
        boolean running = true;
        String unitsToConvert = "";

        while (running) {
            boolean validInput = false;

            printOptions("Lengths");

            while (!validInput) {
                try {
                    System.out.print("Enter your choice: ");
                    int selectedUnits = scanner.nextInt();

                    if (selectedUnits >= 1 && selectedUnits <= 8) {
                        unitsToConvert = GetUnits.getLengthUnits(selectedUnits);
                        System.out.println(unitsToConvert);
                        validInput = true;    
                    } else {
                        System.out.println("Invalid input. Please enter a number between 1-8.");    
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number between 1-8.");
                    scanner.nextLine();
                }
            }
            validInput = false;

            while (!validInput) {
                try {
                    System.out.print("\nEnter length you want to convert: ");
                    String lengthInput = scanner.next();

                    // Replace commas with periods
                    lengthInput = lengthInput.replace(',', '.');
                    length = Double.parseDouble(lengthInput);
                    validInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid numeric length.");
                }
            }

            double result = LengthConverter.convertLength(unitsToConvert, length);

            System.out.println("\n" + length + " " + unitsToConvert + " is " + result + "\n");

            scanner.nextLine();

            System.out.print("Do you want to convert some other length? (yes/no) ");
            String isContinue = scanner.nextLine().toLowerCase();

            if (isContinue.equals("no")) {
                running = false;
            }
        } 
    }
}
