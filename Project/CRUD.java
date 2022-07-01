package Project;

import java.sql.*;

import Project.App;
import Project.CRUD;
import Project.CreateConnection;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class CRUD
{
	static Connection cn;
	static Statement st1;
	static ResultSet rs1;
	
	static 
	{	
		cn = CreateConnection.connect();
	}
	
	
	public static void Show_Pizzas()
	{
	 JFrame F2 = new JFrame();

	JPanel P;
	JTable t;
	JScrollPane jsp;
		
	
	F2 = new JFrame("List Food");
	P= new JPanel();
	
	F2.setLayout(new FlowLayout(FlowLayout.CENTER));
	P.setLayout(new FlowLayout(FlowLayout.CENTER));
	P.setBackground(Color.RED);
	
	F2.add(P);
		
		F2.add(P);
		
	
			
		String col_heading[] = {"Pizza_Id","Pizza_Name","Pizza_Price"};
		String data[][]=new String[7][3];

		try
		{
			int i=0;

			 st1= CRUD.cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        	 rs1 = st1.executeQuery("select * from pizza");
        	
		while(rs1.next())
		{
			data[i][0]=String.valueOf(rs1.getInt("Pizza_Id"));
			data[i][1]=rs1.getString("Pizza_Name");
			data[i][2]=String.valueOf(rs1.getLong("Pizza_Price"));
			i++;	
		}
		
		t=new JTable(data,col_heading);
		 jsp = new JScrollPane(t); 
		P.add(jsp);
							
		F2.setVisible(true);
		F2.setSize(700,480);
	
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void Show_Pastas()
	{
	 JFrame F2 = new JFrame();

	JPanel P;
	JTable t;
	JScrollPane jsp;
		
	
	F2 = new JFrame("List Food");
	P= new JPanel();
	
	F2.setLayout(new FlowLayout(FlowLayout.CENTER));
	P.setLayout(new FlowLayout(FlowLayout.CENTER));
	P.setBackground(Color.RED);
	
	F2.add(P);
		
		F2.add(P);
		
	
			
		String col_heading[] = {"Pasta_Id","Pasta_Name","Pasta_Price"};
		String data[][]=new String[7][3];

		try
		{
			int i=0;

			 st1= CRUD.cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
       	 rs1 = st1.executeQuery("select * from pasta");
       	
		while(rs1.next())
		{
			data[i][0]=String.valueOf(rs1.getInt("Pasta_Id"));
			data[i][1]=rs1.getString("Pasta_Name");
			data[i][2]=String.valueOf(rs1.getLong("Pasta_Price"));
			i++;	
		}
		
		t=new JTable(data,col_heading);
		 jsp = new JScrollPane(t); 
		P.add(jsp);
							
		F2.setVisible(true);
		F2.setSize(700,480);
		F2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void Show_Sizzlers()
	{
		 JFrame F2 = new JFrame();

			JPanel P;
			JTable t;
			JScrollPane jsp;
				
			
			F2 = new JFrame("List Food");
			P= new JPanel();
			
			F2.setLayout(new FlowLayout(FlowLayout.CENTER));
			P.setLayout(new FlowLayout(FlowLayout.CENTER));
			P.setBackground(Color.RED);
			
			F2.add(P);
				
				F2.add(P);
				
			
					
				String col_heading[] = {"Sizzler_Id","Sizzler_Name","Sizzler_Price"};
				String data[][]=new String[7][3];

				try
				{
					int i=0;

					 st1= CRUD.cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		        	 rs1 = st1.executeQuery("select * from sizzler");
		        	
				while(rs1.next())
				{
					data[i][0]=String.valueOf(rs1.getInt("Sizzler_Id"));
					data[i][1]=rs1.getString("Sizzler_Name");
					data[i][2]=String.valueOf(rs1.getLong("Sizzler_Price"));
					i++;	
				}
				
				t=new JTable(data,col_heading);
				 jsp = new JScrollPane(t); 
				P.add(jsp);
									
				F2.setVisible(true);
				F2.setSize(700,480);
				F2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				
				}catch(Exception e)
				{
					e.printStackTrace();
				}
	}
	
	public static void Show_Beverages()
	{
		 JFrame F2 = new JFrame();

			JPanel P;
			JTable t;
			JScrollPane jsp;
				
			
			F2 = new JFrame("List Food");
			P= new JPanel();
			
			F2.setLayout(new FlowLayout(FlowLayout.CENTER));
			P.setLayout(new FlowLayout(FlowLayout.CENTER));
			P.setBackground(Color.RED);
			
			F2.add(P);
				
				F2.add(P);
				
			
					
				String col_heading[] = {"Beverages_Id","Beverages_Name","Beverages_Price"};
				String data[][]=new String[7][3];

				try
				{
					int i=0;

					 st1= CRUD.cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		        	 rs1 = st1.executeQuery("select * from beverages");
		        	
				while(rs1.next())
				{
					data[i][0]=String.valueOf(rs1.getInt("Beverages_Id"));
					data[i][1]=rs1.getString("Beverages_Name");
					data[i][2]=String.valueOf(rs1.getLong("Beverages_Price"));
					i++;	
				}
				
				t=new JTable(data,col_heading);
				 jsp = new JScrollPane(t); 
				P.add(jsp);
									
				F2.setVisible(true);
				F2.setSize(700,480);
				F2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				
				}catch(Exception e)
				{
					e.printStackTrace();
				}
	}
	public static void Show_Burgers()

	{
		 JFrame F2 = new JFrame();

			JPanel P;
			JTable t;
			JScrollPane jsp;
				
			
			F2 = new JFrame("List Food");
			P= new JPanel();
			
			F2.setLayout(new FlowLayout(FlowLayout.CENTER));
			P.setLayout(new FlowLayout(FlowLayout.CENTER));
			P.setBackground(Color.RED);
			
			F2.add(P);
				
				F2.add(P);
				
			
					
				String col_heading[] = {"Burger_Id","Burger_Name","Burger_Price"};
				String data[][]=new String[7][3];

				try
				{
					int i=0;

					 st1= CRUD.cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		        	 rs1 = st1.executeQuery("select * from burgers");
		        	
				while(rs1.next())
				{
					data[i][0]=String.valueOf(rs1.getInt("Burger_Id"));
					data[i][1]=rs1.getString("Burger_Name");
					data[i][2]=String.valueOf(rs1.getLong("Burger_Price"));
					i++;	
				}
				
				t=new JTable(data,col_heading);
				 jsp = new JScrollPane(t); 
				P.add(jsp);
									
				F2.setVisible(true);
				F2.setSize(700,480);
				F2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				
				}catch(Exception e)
				{
					e.printStackTrace();
				}
	}
	
	
	
	




		
}

