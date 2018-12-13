import java.util.ArrayList;
import java.util.Random;

public class cars {
	Random rnd = new Random();
	
	private double Location;
	private double Velocity=25;
	private int line;
	 public cars(double Location,int line){
		 this.Location=Location;
		 this.line=line;
	 }
	
	
	public void puttingCar(double ourLoction){
		int x=rnd.nextInt(2)+1;
			if(x==1){
				line=1;
				Location=rnd.nextInt(200)+50+ourLoction;
			}else{
				line=2;
				Location=rnd.nextInt(200)+50+ourLoction;
			}
			
		x=0;
	}
	
	public void changeLine(){
		int line;
		line=rnd.nextInt(2)+1;
		graphicPanel.comment.setText(graphicPanel.comment.getText()+"\nthe car front of you change it's line to : "+line);
		this.line=line;
		
	}
	
	public double getLocation() {
		return Location;
	}
	public void setLocation(double location) {
		Location = location;
	}
	public double getVelocity() {
		return Velocity;
	}
	public void setVelocity(double Velocity) {
		this.Velocity = Velocity;
	}
	public int getLine() {
		return line;
	}
	public void setLine(int line) {
		this.line = line;
	}
	
}
