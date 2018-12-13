import javax.swing.JOptionPane;

public class alarm {
	public void Alarm(double carLocation , double thing_Location, String thing_name ){
		if(thing_name.equals("camera")&&(thing_Location-carLocation)<=100){
			graphicPanel.comment.setText(graphicPanel.comment.getText()+"\nOh There is camera ahead");
		}if(thing_name.equals("feulPlace")&&(thing_Location-carLocation)<=1000){
			graphicPanel.comment.setText(graphicPanel.comment.getText()+"\nOh There is gas station ahead");
		}if(thing_name.equals("fixer")&&(thing_Location-carLocation)<=1000){
			graphicPanel.comment.setText(graphicPanel.comment.getText()+"\nOh There is repair shop ahead");
		}
	}
	
	
	public void Alarm(double carLocation , double thing_Location, String thing_name,double x){
		if(thing_name.equals("police")&&(thing_Location-carLocation)<=400&&x==1){
			graphicPanel.comment.setText(graphicPanel.comment.getText()+"\nOh There is a police ahead !!! \nyou were so fast you have to stop !!! ");
		}
	}
	
	
	public void Alarm(double carLocation ,cars car, String thing_name){
		if(thing_name.equals("car")&&(car.getLocation()-carLocation)<=200){
			graphicPanel.comment.setText(graphicPanel.comment.getText()+"\nOh There is car "+(car.getLocation()-carLocation)+" in line  "+car.getLine());
		}
	}
	
}
