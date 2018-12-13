

import java.awt.Color;
import javax.swing.SwingUtilities;




public class Calculate_Us {
  private carMove cm = new carMove();
  private double us;
  
  public double Calculate_US_WR(String road,String weather,int power){
	 
	  if(road.equals("asphalt")&&weather.equals("dry")){
              us = 0.9;
              carMove.jPanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("street_2.png")));
          }
	  else if(road.equals("asphalt")&&weather.equals("rain")){
              us = 0.75-((power-1)*0.03);
              carMove.jPanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("street_2.png")));
          }
	  else if(road.equals("dirt")&&weather.equals("dry")){
              us = 0.65;
              carMove.jPanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("street_dirt.png")));
          }
	  else if(road.equals("dirt")&&weather.equals("rain")){
              us = 0.55-((power-1)*0.03);
              carMove.jPanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("street_dirt.png")));
              
          }
	  else if(road.equals("sand")&&weather.equals("dry")){
              us = 0.6;
              carMove.jPanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("street_s.png")));
          }
	  else if(road.equals("sand")&&weather.equals("rain")){
              us = 0.52-((power-1)*0.03);
              carMove.jPanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("street_s.png")));
          }
	  else if(weather.equals("snow")&&(road.equals("asphalt")||road.equals("dirt")||road.equals("sand"))){
              us = 0.45-((power-1)*0.03);
              carMove.jPanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("street_smow.png")));
          }
          
	  return us;
  }
  
  
  
}
