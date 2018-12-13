
public class money {
	private double money=20000;
	
	
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}

	public double makeLessMoney(String reson){
		if(reson.equals("camerra")||reson.equals("police")) money = money-500;
		else if(reson.equals("running")) money = money-200;
		else if(reson.equals("fixing")) money = money-150;
		return money;
	}
	
	
	
	public double makeLessMoney(String reson,double how_much){
		money = money -(100*how_much);
		return money;
	}
}
