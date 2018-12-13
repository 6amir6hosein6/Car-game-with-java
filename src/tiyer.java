
public class tiyer {
	private String name;
	private double money;
	private double health=100;
	private double timeOfDestroy;
	private double affectOnU;
	
	

	 public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public tiyer(String name , double money , double timeOfDestroy){
		 this.name=name;
		 this.money=money;
		 this.timeOfDestroy=timeOfDestroy;
		 affectOnU = (100-health)/1000;
	 }
	
	public double getAffectOnU() {
		return affectOnU;
	}
	public void setAffectOnU(double affectOnU) {
		this.affectOnU = affectOnU;
	}

	public double HealthMakeLess(double x){
		health = health - x*(timeOfDestroy);
		affectOnU = (100-health)/1000;
		if(health<=0){
			return 0;
		}
		else return health;
	}
	
	public double HealthMakeUp(){
		health = 100;
		return health;
	}
	
}
