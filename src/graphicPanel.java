
import java.awt.HeadlessException;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.util.*;
public class graphicPanel extends javax.swing.JFrame {
	String weatherfield = "dry";
	String roadfield = "asphalt";
	int powerfield=1;
	
    public graphicPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

    	jScrollPane2 = new javax.swing.JScrollPane();
        comment = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        answer = new javax.swing.JTextField();
        accelerationValue = new javax.swing.JLabel();
        velocityValue = new javax.swing.JLabel();
        locationValue = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lineValue = new javax.swing.JLabel();
        feulValue = new javax.swing.JLabel();
        healthValue = new javax.swing.JLabel();
        tiyerUK = new javax.swing.JLabel();
        uk = new javax.swing.JLabel();
        ok = new javax.swing.JButton();
        maxbrake = new javax.swing.JLabel();
        money = new javax.swing.JLabel();
        grgrg = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        acceleration = new javax.swing.JTextField();
        line = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        weather = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        road = new javax.swing.JTextField();
        change = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tiyer = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        power = new javax.swing.JTextField();
        weatherValue = new javax.swing.JLabel();
        powerValue = new javax.swing.JLabel();
        roadValue = new javax.swing.JLabel();
        tiyerValue = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        brake = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
        setPreferredSize(new java.awt.Dimension(640, 430));
        getContentPane().setLayout(null);
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        
        
        comment.setColumns(20);
        comment.setRows(5);
        comment.setEnabled(false);
        jScrollPane2.setViewportView(comment);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 30, 260, 110);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Comment : ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 190, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Your answer : ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(290, 30, 120, 30);
        getContentPane().add(answer);
        answer.setBounds(380, 30, 160, 30);

        accelerationValue.setText("Acceleration : ");
        getContentPane().add(accelerationValue);
        accelerationValue.setBounds(10, 160, 140, 20);

        velocityValue.setText("Velocity : ");
        getContentPane().add(velocityValue);
        velocityValue.setBounds(10, 180, 140, 20);

        locationValue.setText("Location : ");
        getContentPane().add(locationValue);
        locationValue.setBounds(10, 200, 310, 20);

        jLabel3.setText("Current Time : ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 140, 130, 20);

        lineValue.setText("Current Line : ");
        getContentPane().add(lineValue);
        lineValue.setBounds(10, 220, 310, 20);

        feulValue.setText("Feul : ");
        getContentPane().add(feulValue);
        feulValue.setBounds(10, 240, 310, 20);

        healthValue.setText("Current Health of tire : ");
        getContentPane().add(healthValue);
        healthValue.setBounds(10, 260, 310, 20);

        tiyerUK.setText("The Changes of U_K by tiyer : ");
        getContentPane().add(tiyerUK);
        tiyerUK.setBounds(10, 280, 310, 20);

        uk.setText("Current U-k : ");
        getContentPane().add(uk);
        uk.setBounds(10, 300, 310, 20);

        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        getContentPane().add(ok);
        ok.setBounds(540, 30, 70, 30);

        maxbrake.setText("Max Brake Acceleration : ");
        maxbrake.setToolTipText("");
        getContentPane().add(maxbrake);
        maxbrake.setBounds(10, 320, 310, 20);

        money.setText("Money : ");
        getContentPane().add(money);
        money.setBounds(10, 340, 310, 20);

        grgrg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        grgrg.setText("Line : ");
        getContentPane().add(grgrg);
        grgrg.setBounds(380, 130, 34, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Acceleration : ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(380, 90, 130, 30);
        getContentPane().add(acceleration);
        acceleration.setBounds(470, 90, 90, 30);
        getContentPane().add(line);
        line.setBounds(470, 130, 90, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Weather : ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(380, 170, 80, 30);
        getContentPane().add(weather);
        weather.setBounds(470, 170, 90, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Road : ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(380, 250, 60, 30);
        getContentPane().add(road);
        road.setBounds(470, 250, 90, 30);

        change.setText("Change");
        change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeActionPerformed(evt);
            }
        });
        getContentPane().add(change);
        change.setBounds(420, 340, 100, 23);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Tiyer :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(380, 290, 80, 30);
        getContentPane().add(tiyer);
        tiyer.setBounds(470, 290, 90, 30);
        tiyer.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Power : ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(380, 210, 90, 30);
        getContentPane().add(power);
        power.setBounds(470, 210, 90, 30);

        weatherValue.setText("Weather :");
        getContentPane().add(weatherValue);
        weatherValue.setBounds(150, 140, 150, 20);

        powerValue.setText("Power : ");
        getContentPane().add(powerValue);
        powerValue.setBounds(150, 160, 120, 20);

        roadValue.setText("Road : ");
        getContentPane().add(roadValue);
        roadValue.setBounds(150, 180, 120, 20);

        tiyerValue.setText("Tiyer : ");
        getContentPane().add(tiyerValue);
        tiyerValue.setBounds(10, 360, 240, 20);
        
        
        
        pack();
    }// </editor-fold>                        

    private void okActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    	information.answer=answer.getText();
        
    }    
    
    private void formKeyPressed(java.awt.event.KeyEvent evt) {                                
        int x=evt.getExtendedKeyCode();
        System.out.println(x);
        if(x==32){
            Tester.cva.setAcceleration(Tester.cva.getMaxBrakeAcceleration());
        }
    }    

    private void changeActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    	if(!acceleration.getText().trim().isEmpty()){
    		Tester.cva.setAcceleration(Integer.parseInt(acceleration.getText()));
    	}if(!line.getText().trim().isEmpty()){
    		Tester.curreve_line=Integer.parseInt(line.getText());
                if(Integer.parseInt(line.getText())==1){
                    carMove.car.setBounds(220, 410, 40, 70);
                }else if (Integer.parseInt(line.getText())==2){
                    carMove.car.setBounds(105, 410, 40, 70);
                }
                
    	}if(!weather.getText().trim().isEmpty()){
    		weatherfield=weather.getText();
    		Tester.order.setWeather(weatherfield);
    	}if(!power.getText().trim().isEmpty()){
    		powerfield=(Integer.parseInt(power.getText()));
    		Tester.order.setPower(powerfield);
    	}if(!road.getText().trim().isEmpty()){
    		roadfield=road.getText();
    		Tester.order.setRoad(roadfield);
    	}
    	Tester.us.Calculate_US_WR(roadfield, weatherfield, powerfield);
    	if(!tiyer.getText().trim().isEmpty()){
    		if(tiyer.getText().equals("Iran")) {
				Tester.order.ty = new tiyer("Iran",2500,0.05);
			}else if (tiyer.getText().equals("China")){
				Tester.order.ty = new tiyer("China",1000,0.15);
			}else if (tiyer.getText().equals("USA")){
				Tester.order.ty = new tiyer("USA",1700,0.09);
			}else{
				comment.setText(graphicPanel.comment.getText()+"There is no tiyer with this name !!");
			}
    	}
    }                                      
    
    public static void gr() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(graphicPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(graphicPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(graphicPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(graphicPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new graphicPanel().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify                     
    static javax.swing.JTextField acceleration;
    static javax.swing.JLabel accelerationValue;
    static javax.swing.JTextField answer;
    static javax.swing.JButton change;
    static javax.swing.JTextArea comment;
    static javax.swing.JLabel feulValue;
    static javax.swing.JLabel grgrg;
    static javax.swing.JLabel healthValue;
    static javax.swing.JLabel jLabel1;
    static javax.swing.JLabel jLabel2;
    static javax.swing.JLabel jLabel3;
    static javax.swing.JLabel jLabel4;
    static javax.swing.JLabel jLabel5;
    static javax.swing.JLabel jLabel6;
    static javax.swing.JLabel jLabel7;
    static javax.swing.JLabel jLabel8;
    static javax.swing.JScrollPane jScrollPane2;
    static javax.swing.JTextField line;
    static javax.swing.JLabel lineValue;
    static javax.swing.JLabel locationValue;
    static javax.swing.JLabel maxbrake;
    static javax.swing.JLabel money;
    static javax.swing.JButton ok;
    static javax.swing.JTextField power;
    static javax.swing.JLabel powerValue;
    static javax.swing.JTextField road;
    static javax.swing.JLabel roadValue;
    static javax.swing.JTextField tiyer;
    static javax.swing.JTextField brake;
    static javax.swing.JLabel tiyerUK;
    static javax.swing.JLabel tiyerValue;
    static javax.swing.JLabel uk;
    static javax.swing.JLabel velocityValue;
    static javax.swing.JTextField weather;
    static javax.swing.JLabel weatherValue;
    // End of variables declaration                   
}
