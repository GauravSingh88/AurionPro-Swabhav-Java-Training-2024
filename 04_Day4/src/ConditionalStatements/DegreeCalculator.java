package ConditionalStatements;
import java.util.Scanner;

public class DegreeCalculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter temperature: ");
        double temperature = scanner.nextDouble();
        
        
        
        System.out.println("Choose conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
        case 1:
        	double fahrenheitFromCelsius= ((9/5) * temperature) + 32;
        	System.out.println(fahrenheitFromCelsius + " is the converted temprature");
        	break;
        case 2:
        	double celsiusFromFahreinHeit= (temperature - 32) * (5/9);
        	System.out.println(celsiusFromFahreinHeit + " is the converted temprature");
        	break;
        case 3:
        	double kelvinFromCelsius= temperature + 273.15;
        	System.out.println(kelvinFromCelsius + " is the converted temprature");
        	break;
        case 4:
        	double celsiusFromKelvin= temperature - 273.15;
        	System.out.println(celsiusFromKelvin + " is the converted temprature");
        	break;
        case 5:
        	double kelvinFromFahreinHeit= ((temperature - 32) * (5/9)) + 273.15;
        	System.out.println(kelvinFromFahreinHeit + " is the converted temprature");
        	break;
        case 6:
        	double fahrenheitFromKelvin= ((temperature -273.15) * (9/5) +32);
        	System.out.println(fahrenheitFromKelvin + " is the converted temprature");
        	break;
        
        }

	}

}
