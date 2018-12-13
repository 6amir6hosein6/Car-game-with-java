
import java.util.*;
import javax.swing.JOptionPane;

public class Tester extends Thread {
	static int curreve_line = 1;
	static Order order = new Order();
	static Calculate_velocity_and_acceleration cva = order.cva;
	static Feul feul = order.feul;
	static Calculate_Us us= new Calculate_Us();
	static alarm alarm = new alarm();
	static tiyer ty = order.ty; 
	static money money = order.money;
	static information info = new information();
        static carMove cm = new carMove();
	public static void main(String args[]) {
		Random rnd = new Random();
		double camera_current_location=750;
		double feulPlace_current_location=400;
		double fixer_current_location=100;
		double police_current_location=1000;
                int place_of_changing_weather;
                int weather;
		
		graphicPanel gr= new graphicPanel();
		
                
                
		thing_in_road cam=new thing_in_road("camera", camera_current_location);
		thing_in_road feulPlace=new thing_in_road("feulPlace", feulPlace_current_location);
		thing_in_road fixer=new thing_in_road("fixer", fixer_current_location);
		thing_in_road police=new thing_in_road("police", police_current_location);
		
		
		
		cars car = new cars(0,0);
		cars policeCar=null;
		car.puttingCar(cva.getLocation());
		//System.out.println("loc : "+car.getLocation());
		//System.out.println("line : "+car.getLine());
		double t=0,T=1;
		double U_K;
		double have_you_were_fast=0;
		gr.setVisible(true);
                cm.setVisible(true);
                if((car.getLocation()-cva.getLocation())<1000){
                            if(car.getLine()==1){
                               carMove.car1.setBounds(220,430-(int)(car.getLocation()-cva.getLocation()),40,70);
                               carMove.car1.setVisible(true);
                            }else if(car.getLine()==2){
                               carMove.car1.setBounds(50,430-(int)(car.getLocation()-cva.getLocation()),40,70); 
                               carMove.car1.setVisible(true);
                            }   
                        }if((feulPlace_current_location-cva.getLocation())<1000){
                            carMove.feul.setBounds(310,430-(int)(feulPlace_current_location-cva.getLocation()),70,70);
                            carMove.feul.setVisible(true);
                        }if((camera_current_location-cva.getLocation())<1000){
                            carMove.camera.setBounds(310,430-(int)(camera_current_location-cva.getLocation()),70,70);
                            carMove.camera.setVisible(true);
                        }if((fixer_current_location-cva.getLocation())<1000){
                            carMove.fix.setBounds(310,430-(int)(fixer_current_location-cva.getLocation()),70,70);
                            carMove.fix.setVisible(true);
                        }
                
             
		while(feul.getFeul()!=0||ty.getHealth()!=0){
			info = new information();
			cva = order.cva;
			ty = order.ty;
			cva.Calculate_velocity_and_acceleration1(T);
			t=t+T;
			U_K=(us.Calculate_US_WR(order.getRoad(),order.getWeather(),order.getPower()))-ty.getAffectOnU();
			
			//-----------------car-----------------------
			
			car.setLocation((car.getVelocity()*T)+car.getLocation());
			
			//car.changeLine();
			
			//--------------------pring_atrebiutes--------------------
			
			if(cva.getVelocity()<=0) cva.setVelocity(0);
			if(ty.getHealth()<=0) ty.setHealth(0);
                        if(feul.getFeul()<=0) feul.setFeul(0);
                        if(cva.getLocation()<=0) cva.setLocation(0);
                        
			graphicPanel.jLabel3.setText("Current Time : "+(t));
			graphicPanel.accelerationValue.setText("Acceleration : " + cva.getAcceleration());
			graphicPanel.velocityValue.setText("Velocity : "+cva.getVelocity());
			graphicPanel.locationValue.setText("Location : "+cva.getLocation());
			graphicPanel.lineValue.setText("Current line : "+curreve_line);
			graphicPanel.feulValue.setText("Feul :"+(feul.feulMakeLess(cva.delta(T))));
			graphicPanel.healthValue.setText("Current Health of tire : "+ty.HealthMakeLess(cva.delta(T)));
			graphicPanel.tiyerUK.setText("The Changes of U_K by tiyer : "+ty.getAffectOnU());
			graphicPanel.uk.setText("Current U-k : "+U_K);
			graphicPanel.maxbrake.setText("max Brake Acceleration : "+cva.maxBrakeAcceleration(U_K));
			graphicPanel.money.setText("Money : "+money.getMoney());
			graphicPanel.weatherValue.setText("Weather : "+order.getWeather());
			graphicPanel.roadValue.setText("Road : "+order.getRoad());
			graphicPanel.powerValue.setText("Power : "+order.getPower());
			graphicPanel.tiyerValue.setText("Tiyer : "+ty.getName());
                        carMove.jLabel2.setText(cva.getLocation()+"");
                        carMove.jLabel3.setText((cva.getLocation()+500)+"");
                        carMove.jLabel1.setText((cva.getLocation()+1000)+"");
			//----------------------------------------------------------
			
			//--------------police---------------------
			if(have_you_were_fast==0){
				have_you_were_fast=info.Information(cva.getLocation(), police_current_location, "police", cva.getVelocity());
				alarm.Alarm(cva.getLocation(),police_current_location,"police",have_you_were_fast);
			}
			    double x,follow=0;
			    
				x=info.Information(have_you_were_fast,cva,U_K,cva.getLocation(),police_current_location,T);
				money.setMoney(money.getMoney()-x);
				x=0;
				                
			if(information.answer.equals("n")){
				if(follow==0){
					policeCar = new cars(police_current_location-150,curreve_line);
					graphicPanel.comment.setText(graphicPanel.comment.getText()+"\nthe police started to following you !!!\n"
							+"police Location is : "+policeCar.getLocation());
					policeCar.setVelocity(150);
					x=1;
				}
				policeCar.setLocation((policeCar.getVelocity()*T)+policeCar.getLocation());
				policeCar.setLine(curreve_line);
				if(policeCar.getLocation()==cva.getLocation()){
					graphicPanel.comment.setText(graphicPanel.comment.getText()+"\npolice get you !!");
					break;
				}else if (cva.getLocation()-policeCar.getLocation()>1000){
					graphicPanel.comment.setText(graphicPanel.comment.getText()+"\nyou ran out !!");
					information.answer="end";
				}
			}
			
			try{Thread.sleep(200);}
			catch(Exception e){e.getMessage();}
                        //----------------deleting after passing-------------------------
                        if(feulPlace_current_location<cva.getLocation()+20) carMove.feul.setVisible(false);
                        if(camera_current_location<cva.getLocation()+20) carMove.camera.setVisible(false);
                        if(fixer_current_location<cva.getLocation()+20) carMove.fix.setVisible(false);
                        //--------------------changing weather------------------------
                         //Random r = new Random();
                        place_of_changing_weather=500;
                        weather = rnd.nextInt(1);
                        System.out.println(weather);
                        if(cva.getLocation()>=place_of_changing_weather){
                            
                            if(weather==0){
                                order.setRoad("dirt");order.setWeather("dry");
                            }else if(weather==1){
                                order.setRoad("dirt");order.setWeather("rain");
                            }else if(weather==2){
                                order.setRoad("asphalt");order.setWeather("rain");
                            }else if(weather==3){
                                order.setRoad("asphlat");order.setWeather("dry");
                            }else if(weather==4){
                                order.setRoad("sand");order.setWeather("rain");
                            }else if(weather==5){
                                order.setRoad("sand");order.setWeather("dry");
                            }else if(weather==6){
                                order.setWeather("snow");
                            }
                        }
                         place_of_changing_weather = place_of_changing_weather + rnd.nextInt(500)+1000;
			//----------------changing_place_of_thing-------------------------
				
			if(!(cva.getLocation()<camera_current_location)){
				camera_current_location=rnd.nextInt(900)+400+cva.getLocation();
				cam = new thing_in_road("camera", camera_current_location);
			}if(!(cva.getLocation()<feulPlace_current_location)){
				feulPlace_current_location=rnd.nextInt(3000)+1000+cva.getLocation();
				feulPlace = new thing_in_road("feulPlace", feulPlace_current_location);
			}if(!(cva.getLocation()<police_current_location)&&information.answer.equals("end")){
				System.out.println("police place changed!!!");
				police_current_location=rnd.nextInt(12000)+80000+cva.getLocation();
				police = new thing_in_road("police", police_current_location);
				have_you_were_fast=0;
			}if(!(cva.getLocation()<fixer_current_location)){
				fixer_current_location=rnd.nextInt(1500)+500+cva.getLocation();
				fixer= new thing_in_road("fixer", fixer_current_location);
			}
			if(cva.getLocation()>car.getLocation()&&curreve_line==car.getLine()){
				cva.setVelocity(0);
				cva.setAcceleration(0);
				graphicPanel.comment.setText(graphicPanel.comment.getText()+"\nyou had an accident !!!");
                                JOptionPane.showMessageDialog(null,"you had an accident !!!" ,"Message", JOptionPane.INFORMATION_MESSAGE);
				break;
			}if(cva.getLocation()>car.getLocation()){
				car.puttingCar(cva.getLocation());
				/*System.out.println("loc : "+car.getLocation());
				System.out.println("line : "+car.getLine());*/
			}
                        //-------------------showing object in road--------------------   
                        if((car.getLocation()-cva.getLocation())<1000){
                            if(car.getLine()==1){
                               carMove.car1.setBounds(220,430-(int)(car.getLocation()-cva.getLocation()),40,70);
                               carMove.car1.setVisible(true);
                            }else if(car.getLine()==2){
                               carMove.car1.setBounds(105,430-(int)(car.getLocation()-cva.getLocation()),40,70); 
                               carMove.car1.setVisible(true);
                            }   
                        }if((feulPlace_current_location-cva.getLocation())<1000){
                            carMove.feul.setBounds(310,430-(int)(feulPlace_current_location-cva.getLocation()),70,70);
                            carMove.feul.setVisible(true);
                        }if((camera_current_location-cva.getLocation())<100){
                            carMove.camera.setBounds(310,430-(int)(camera_current_location-cva.getLocation()),70,70);
                            carMove.camera.setVisible(true);
                        }if((fixer_current_location-cva.getLocation())<1000){
                            carMove.fix.setBounds(310,430-(int)(fixer_current_location-cva.getLocation()),70,70);
                            carMove.fix.setVisible(true);
                        }
                        
			//----------------------alarming----------------------
			alarm.Alarm(cva.getLocation(), camera_current_location, "camera");
			alarm.Alarm(cva.getLocation(), feulPlace_current_location, "feulPlace");
			alarm.Alarm(cva.getLocation(), fixer_current_location, "fixer");
			alarm.Alarm(cva.getLocation(), car ,"car");
			alarm.Alarm(cva.getLocation(), police_current_location, "police");
			
			//-------------------getingMoney----------------------
			
			money.setMoney(money.getMoney()-info.Information(cva.getLocation(), camera_current_location, "camera",cva.getVelocity()));
			money.setMoney(money.getMoney()-info.Information(cva.getLocation(), feulPlace_current_location, "feulPlace",feul));
			money.setMoney(money.getMoney()-info.Information(cva.getLocation(), fixer_current_location, "fixer",ty,order));
                        
			                 System.out.println(feul.getFeul());
                                         System.out.println(ty.getHealth());
			
		}
                //-----------------ending game--------------------
                if(ty.getHealth()==0) JOptionPane.showMessageDialog(null, "your heath of tiyer is 0 ", "Messege", 0);
                if(feul.getFeul()==0) JOptionPane.showMessageDialog(null, "your feul is 0 ", "Messege", 0);
        }

}
