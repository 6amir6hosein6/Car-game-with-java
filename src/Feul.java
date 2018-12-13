
public class Feul {
    private double feulTank=200;
    private double feul=50;
    private double feulConsumption=0.01;
    
    
    public double getFeulTank() {
		return feulTank;
	}

	public void setFeulTank(double feulTank) {
		this.feulTank = feulTank;
	}

	public double getFeul() {
		return feul;
	}

	public void setFeul(double feul) {
		this.feul = feul;
	}
	
	public double getFeulConsumption() {
		return feulConsumption;
	}
	
	public void setFeulConsumption(double feulConsumption) {
		this.feulConsumption = feulConsumption;
	}
	
	public void Feul(double feulTank,double feul,double feulConsumption){
    	this.feul=feul;
    	this.feulTank=this.feul;
    	this.feulConsumption=feulConsumption;
    }
	
	public double feulMakeLess(double t){
		feul=feul-(feulConsumption*t);
		return feul;
	}
    
    
}
