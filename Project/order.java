package Project;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class order extends JFrame implements ActionListener {
	 Container container = getContentPane();
	    JLabel Food = new JLabel("Food Name:");
	    JLabel Quantity = new JLabel("Quantity");
	    JTextField TextField1 = new JTextField();
	    JTextField TextField2 = new JTextField();
	    JButton orderButton = new JButton("ORDER");
	    JButton resetButton = new JButton("RESET");
	    
	    JFrame frame = new JFrame();

	

	 
order()
{
setLayoutManager();

}

  

   public   void setLayoutManager() {
	   
   	  frame.setTitle("Order page");
	        frame.setVisible(true);
	        frame.setBounds(10, 10, 370, 600);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setResizable(false);
       container.setLayout(null);
   
       Food.setBounds(50, 150, 100, 30);
       Quantity.setBounds(50, 220, 100, 30);
       TextField1.setBounds(150, 150, 150, 30);
       TextField2.setBounds(150, 220, 150, 30);
       orderButton.setBounds(50, 300, 100, 30);
       resetButton.setBounds(200, 300, 100, 30);


   

   
       container.add(Food);
       container.add(Quantity);
       container.add(TextField1);
       container.add(TextField2);
       container.add(orderButton);
       container.add(resetButton);
   
        frame.add(container);
   
       orderButton.addActionListener(this);
       resetButton.addActionListener(this);
 
   

   }
   @Override
   public void actionPerformed(ActionEvent e) {
       if (e.getSource() == orderButton) {
           String Text1;
           String Text2;
           Text1 = TextField1.getText();
           Text2 = TextField2.getText();
           if (e.getActionCommand().equals("ORDER")) {
               JOptionPane.showMessageDialog(this, "Order Successful !!");
               System.out.println("Food name: " + Text1);
               System.out.println("Food Qantity: " + Text2);
       		
           } 
           else {
               JOptionPane.showMessageDialog(this, "Order Not Placed Yet !!");
           }

       }
       //Coding Part of RESET button
       if (e.getSource() == resetButton) {
           TextField1.setText("");
           TextField2.setText("");
       }
 


       }
   




}
