import java.util.Scanner;
public class WeatherSys {
	double temperature;
	int n;
	
	
	public WeatherSys(double temperature, int n) {
		this.temperature=temperature;
		this.n=n;
	}
	
	public void Temp() {
		
		switch(n) {
		case 1: if ((temperature>60)||(temperature<-10))
			       System.out.println("Warning!!!");
		       else
		    	   System.out.println("Perfect");
		break;
		case 2:double t = (5.0/9.0)*(temperature-32.0); 
			   if ((t>60)||(t<-10))
		       System.out.println("Warning!!!");
			   else
		    	   System.out.println("Perfect");
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Enter the temperature");
		Scanner sc= new Scanner(System.in);
		double temperature = sc.nextDouble();
		System.out.println("Enter 1 for Celcius and 2 for Fahrenheit");
		Scanner m= new Scanner(System.in);
		int n = m.nextInt();
		
		WeatherSys w=new WeatherSys(temperature,n);
		w.Temp();				
	}
}
