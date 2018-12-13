import java.util.*;
import javax.swing.JOptionPane;
public class information extends Thread {
	Scanner String_Scan = new Scanner(System.in);
	Scanner scan1 = new Scanner(System.in);
	Scanner scan2 = new Scanner(System.in);
	private double payMoney=0;
	private String tiyer;
	private double lit;
	static String answer="a";
   public double Information(double carLocation , double thing_Location, String thing_name,double velocity){
	   payMoney=0;
	   if(thing_name.equals("camera")&&(thing_Location-carLocation)<=100&&velocity>120){
		   graphicPanel.comment.setText(graphicPanel.comment.getText()+"\nThe camera see you !!! you was very fast ");
                   JOptionPane.showMessageDialog(null,"The camera see you !!! you was very fast " ,"Message", JOptionPane.INFORMATION_MESSAGE);
		   payMoney=5000;
                   answer = "a";
		   return payMoney;
	   }else if(thing_name.equals("police")&&(thing_Location-carLocation)<=500&&velocity>120){
                    answer = "a";
	   	    return 1;
	   }else{
                    answer = "a";
		   return payMoney;
	   }
   }
   
   
   public double Information(double carLocation , double thing_Location, String thing_name,Feul feul){
	   payMoney = 0;
	   if(thing_name.equals("feulPlace")&&(thing_Location-carLocation)<=50){
		   graphicPanel.comment.setText(graphicPanel.comment.getText()+"\nDo you want to use Gas station (y/n)");
		   answer="n";
                   
		   try{Thread.sleep(5000);}
			catch(Exception e){e.getMessage();}
		   	if(answer.equals("y")){
		   		payMoney=((50-feul.getFeul())*100);
		   		feul.setFeul(50);
                                answer = "a";
		   		return payMoney;
		   	}else {
                            answer = "a";
                            return payMoney;
                        }
	   }
           else{
               answer = "a";
               return payMoney;
           }
   }
   
   public double Information(double carLocation , double thing_Location, String thing_name,tiyer ty,Order order){
	   payMoney=0;
	   if(thing_name.equals("fixer")&&(thing_Location-carLocation)<=50){
		   graphicPanel.comment.setText(graphicPanel.comment.getText()+"\nDo you want to use Repair shop (y/n)");
		   answer="n";
                   
		   try{Thread.sleep(5000);}
			catch(Exception e){e.getMessage();}
                   
		   	if(answer.equals("y")){
		   		graphicPanel.comment.setText(graphicPanel.comment.getText()+"\nDo you want to repair last tiyer? (y/n)");
		   		answer="n";
				   try{Thread.sleep(5000);}
					catch(Exception e){e.getMessage();}
		   		if(answer.equals("y")){
		   			payMoney=ty.getMoney();
		   			ty.setHealth(100);
		   		}else{
		   			graphicPanel.comment.setText(graphicPanel.comment.getText()+"\nWitch tiyer you want ? (Iran,China,USA)");
		   			graphicPanel.tiyer.setEnabled(true);
		   			tiyer=graphicPanel.tiyer.getText();
					if(tiyer.equals("Iran")) {
						ty = new tiyer("Iran",2500,0.01);
						payMoney=ty.getMoney();
					}else if (tiyer.equals("China")){
						ty = new tiyer("China",1000,0.10);
						payMoney=ty.getMoney();
					}else if (tiyer.equals("USA")){
						ty = new tiyer("USA",1000,0.03);
						payMoney=ty.getMoney();
					}
					graphicPanel.tiyer.setEnabled(false);
		   		}
		   		answer = "a";
		   		return payMoney;
		   	}else {
                            answer = "a";
                            return payMoney;
                        }
	   }
	   else return payMoney;
   }
   
   public double Information(double x,Calculate_velocity_and_acceleration cva,double U_K,double carLocation , double thing_Location,double t){
	 payMoney=0;
	 if(x==1&&(thing_Location-carLocation)<=0){
	   if(!answer.equals("y")&&!answer.equals("n")){ 
		  
		   graphicPanel.comment.setText(graphicPanel.comment.getText()+"\nyou are behind police !!! do you want to stop?? (y/n)");
		   	  //answer="y";
                          
		   	  try{Thread.sleep(5000);}
			  catch(Exception e){e.getMessage();}
	   		  if(answer.equals("y")){
                              
	   			   cva.setAcceleration((-1)*cva.maxBrakeAcceleration(U_K));
	   		  }
		  payMoney=0;
	  }else{
		  cva.setVelocity((cva.getAcceleration())*t+cva.getVelocity());
		  if(cva.getVelocity()<=0){
			  payMoney=5000;
			  answer="end";
			  graphicPanel.comment.setText(graphicPanel.comment.getText()+"\npolice take you  : "+payMoney);
		  }
	  }
	 }
	   return payMoney;
   }
   
}
