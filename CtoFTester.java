public class CtoFTester{
	/* The functions should have doubles that represent the degrees in 
	Celsius/Fahrenheit as parameters. The functions should return doubles
	*/
	public static double celsiusToFahrenheit(double c){
		return c * 9/5 + 32;
	}
	public static double fahrenheitToCelsius(double f){
                return (f - 32) * 5/9;
        }
        public static void main(String[] args){
                System.out.println(celsiusToFahrenheit(30.0));
                System.out.println(fahrenheitToCelsius(212.0));
	}
}
