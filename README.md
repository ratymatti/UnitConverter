# Unit Converter

## Overview

The Unit Converter is a Java program designed to convert between different units of measurement, specifically focusing on temperatures and weights. It provides a user-friendly command-line interface for users to input their choices and perform conversions easily.

## Features

1. **Modular Structure:**
   - The program is organized into modular functions for temperature and weight conversions, making it easy to extend for additional unit types in the future.

2. **User Interaction:**
   - The program guides the user through a series of menus, allowing them to choose the type of units they want to convert (temperatures or weights) and then select the specific conversion within that category.

3. **Error Handling:**
   - The program incorporates error handling to manage unexpected inputs gracefully. It informs the user of invalid inputs and prompts them to enter the correct information.

4. **Flexibility:**
   - Users can choose to exit the program at any time by typing 'quit.' Additionally, after each conversion, users are given the option to continue or exit, enhancing the user experience.


## How to Use

1. **Launch the Program:**
   - Compile and run the `Main.java` file.
   - The program will display a welcome message and prompt the user to choose the type of units to convert.

2. **Choose Units:**
   - Enter the corresponding number to select either temperatures (1) or weights (2).

3. **Select Conversion:**
   - Depending on the chosen unit type, the program will present a menu with specific conversion options.
   - Enter the number associated with the desired conversion.

4. **Input Values:**
   - Follow the on-screen instructions to input the temperature or weight you want to convert.

5. **View Result:**
   - The program will display the converted result.

6. **Continue or Exit:**
   - After each conversion, the user can choose to continue with another conversion or exit the program.

7. **Exit Program:**
   - At any point, the user can type 'quit' to exit the program.


## Example Usage

    
    Welcome to Unit Converter!

    Choose units to convert:
    1: Temperatures
    2: Weights

    Or type 'quit' to exit program.

    Enter your choice: 1

    1. Fahrenheit to Celsius
    2. Celsius to Fahrenheit
    3. Celsius to Kelvin
    4. Kelvin to Celsius
    5. Fahrenheit to Kelvin
    6. Kelvin to Fahrenheit

    Enter your choice: 2

    Enter temperature you want to convert: 32.0

    32.0 Celsius is 89.6 Fahrenheit

    Do you want to convert some other temperature? (yes/no) yes

    Enter your choice: 3

    Enter temperature you want to convert: 273.15

    273.15 Celsius is 523.67 Fahrenheit

    Do you want to convert some other temperature? (yes/no) no

    Goodbye!
