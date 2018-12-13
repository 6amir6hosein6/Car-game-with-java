import java.util.Scanner;

public class Order {
	
	Calculate_velocity_and_acceleration cva= new Calculate_velocity_and_acceleration();
	Feul feul= new Feul();
	Calculate_Us calUS=new Calculate_Us();
	money money = new money();	
	
	private String weather="dry";
	private String road="asphalt";
	private String tiyer="Iran";
	private int power=1;
	private double t=0;
	tiyer ty=new tiyer("Iran",2500,0.01);
	Scanner double_Scan = new Scanner(System.in); 
	Scanner String_Scan = new Scanner(System.in);
	Scanner int_Scan = new Scanner(System.in);
	
	
	
	public String getTiyer() {
		return tiyer;
	}

	public void setTiyer(String tiyer) {
		this.tiyer = tiyer;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public void setRoad(String road) {
		this.road = road;
	}

	public void setT(double t) {
		this.t = t;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getWeather() {
		return weather;
	}

	public String getRoad() {
		return road;
	}

	public double getT() {
		return t;
	}


	public void setT(int t) {
		this.t = t;
	}

	
}
