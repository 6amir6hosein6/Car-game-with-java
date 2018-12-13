
public class Calculate_velocity_and_acceleration {
	private double velocity=0;
	private double acceleration=0;
	private double location=0;
	private double maxBrakeAcceleration=0;
	private double delta_x;
	
	
	
	public double getDelta_x() {
		return delta_x;
	}

	public void setDelta_x(double delta_x) {
		this.delta_x = delta_x;
	}

	public double getMaxBrakeAcceleration() {
		return maxBrakeAcceleration;
	}

	public void setMaxBrakeAcceleration(double maxAcceleration) {
		this.maxBrakeAcceleration = maxAcceleration;
	}

	public double getLocation() {
		return location;
	}

	public void setLocation(double location) {
		this.location = location;
	}

	public double getVelocity() {
		return velocity;
	}

	public void setVelocity(double velocity) {
		this.velocity = velocity;
	}

	public double getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(double acceleration) {
		this.acceleration = acceleration;
	}
	
	public void setBrakeAcceleration(double acceleration) {
		this.acceleration = ((-1)*acceleration);
	}
	
	
	public void Calculate_velocity_and_acceleration1(double t){
		location = ((0.5)*acceleration*t*t)+(velocity*t)+location;
		delta_x = ((0.5)*acceleration*t*t)+(velocity*t);
		velocity = acceleration*t + velocity;
	}
	
	public double delta(double t){
		
		return delta_x;
	}

	public double velocity(double t){
		
		return velocity;
	}
	
	public double maxBrakeAcceleration(double us){
		maxBrakeAcceleration = us*9.8;
		return maxBrakeAcceleration;
	}
}
