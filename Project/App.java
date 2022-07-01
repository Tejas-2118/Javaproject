package Project;


import javax.swing.*;

import Project.order;

import java.awt.*;
import java.awt.event.*;

class ActionEventDemo implements ActionListener {
	CRUD obj ;
	order obj1;

	
    JFrame JF=new JFrame();
    JFrame JF2 = new JFrame();
    
    JButton button=new JButton("Logout");
	JButton B2=new JButton("Pizza");
	JButton B3=new JButton("Burgers");
	JButton B4=new JButton("Pasta");
	JButton B5=new JButton("Sizzler");
	JButton B6=new JButton("Beverages");
	JButton B1= new JButton("  Our menu page  ") ;



    ActionEventDemo(){
    	obj = new CRUD();
   

    	
        buttonProperties();
        page();
    }

    public void page() {
    	 JF.setTitle("Food ordering");
         JF.getContentPane().setLayout(null);
         JF.setVisible(true);
         JF.setBounds(200,200,400,400);
         JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         JF.getContentPane().setBackground(Color.CYAN);
       
         
         
		JF.setLayout(null);

				
		B1.setBounds(230, 50, 200, 50);
		JF.add(B1);
				
		
			
		
		B2.setBounds(25, 150, 100, 50);
		B2.addActionListener(this);
		JF.add(B2);	
		
		B3.setBounds(150, 150, 100, 50);
		B3.addActionListener(this);
		JF.add(B3);

		B4.setBounds(277, 150, 100, 50);
		B4.addActionListener(this);
		JF.add(B4);
			
		B5.setBounds(402, 150, 100, 50);
		B5.addActionListener(this);
		JF.add(B5);
		
		B6.setBounds(527, 150, 100, 50);
		B6.addActionListener(this);
		JF.add(B6);
					
		
		JF.setSize(700,480);
		JF.setVisible(true);	
		
	}

    public void buttonProperties(){
        button.setBounds(277, 250, 100, 50);
        JF.add(button);
        button.addActionListener(this);
    }

    @SuppressWarnings("static-access")
	@Override
    public void actionPerformed(ActionEvent e) {
      	
    	try
    	{
 
    if(e.getActionCommand().equals("Pizza"))		
    {
     	JF.getContentPane().setBackground(Color.pink);
    	obj.Show_Pizzas();
     	obj1 = new order();
	
      }

    if(e.getActionCommand().equals("Burgers"))						
    {
     	JF.getContentPane().setBackground(Color.pink);
    	obj.Show_Burgers();

    }

    if(e.getActionCommand().equals("Pasta"))			
    {    
    	JF.getContentPane().setBackground(Color.pink);
    	obj.Show_Pastas();
    	
    }
    if(e.getActionCommand().equals("Sizzler"))						
    {
    	JF.getContentPane().setBackground(Color.pink);
    	//JOptionPane.showMessageDialog(JF, "Sizzler is clicked ! ");		
    	obj.Show_Sizzlers();
    }	

    if(e.getActionCommand().equals("Beverages"))						
    {
    	//JOptionPane.showMessageDialog(JF, "Beverages is clicked ! ");		
    	JF.getContentPane().setBackground(Color.pink);
    	obj.Show_Beverages();
    	}

    if(e.getActionCommand().equals("Logout"))		
    {
    JOptionPane.showMessageDialog(JF, "Bye ! ");
     	JF.getContentPane().setBackground(Color.pink);
    }

    				

    }catch(Exception e1)
    {
    	e1.printStackTrace();
    }
    	    }
}

public class App {
    public static void main(String[] args)
    {
        new ActionEventDemo();
      
       
        
    }
}

