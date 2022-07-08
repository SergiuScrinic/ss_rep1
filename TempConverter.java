public class TempConverter{
	
	public static void main(String[] args){
		   int tCelsius=20;
		   double tFahreng=75.55D;
		   
		   double convertToFar= tCelsius*9/5+32;
		   double convertToCelsius=(tFahreng-32) * 5/9 ;
		
		System.out.println(convertToFar);
		System.out.println(convertToCelsius);
	}
	
}