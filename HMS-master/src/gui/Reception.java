/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.*;

import java.sql.*;	
import java.awt.event.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Reception extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		new Reception();
	}
	
	public Reception(){
		
                setBounds(530, 200, 850, 570);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("images/fourth.jpg"));
                Image i3 = i1.getImage().getScaledInstance(500, 500,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(250,30,500,470);
                add(l1);
		
		JButton btnNewCustomerForm = new JButton("New Customer Form");
		btnNewCustomerForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				NewCustomer custom = new NewCustomer();
				custom.setVisible(true);
                                setVisible(false);
			}catch(Exception e1){
				e1.printStackTrace();
			}
			}
		});
		btnNewCustomerForm.setBounds(10, 30, 200, 30);
                btnNewCustomerForm.setBackground(Color.BLACK);
                btnNewCustomerForm.setForeground(Color.WHITE);
		contentPane.add(btnNewCustomerForm);
		
		JButton btnNewButton = new JButton("Rooms");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
				Room room = new Room();
				room.setVisible(true);
                                setVisible(false);
				}
				catch(Exception e){
					e.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(10, 70, 200, 30);
                btnNewButton.setBackground(Color.BLACK);
                btnNewButton.setForeground(Color.WHITE);

		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Customer Info");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            try {
                                new CustomerInfo().setVisible(true);
                            } catch (SQLException ex) {
                                
                            }
			
			}
		});
		btnNewButton_1.setBounds(10, 110, 200, 30);
                btnNewButton_1.setBackground(Color.BLACK);
                btnNewButton_1.setForeground(Color.WHITE);

		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Check In");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            new CheckIn().setVisible(true);
                            setVisible(false);
			}
		});
		btnNewButton_2.setBounds(10, 150, 200, 30);                
                btnNewButton_2.setBackground(Color.BLACK);
                btnNewButton_2.setForeground(Color.WHITE);

		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Check Out");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				new CheckOut().setVisible(true);
                                setVisible(false);
			}
				catch(Exception e1){
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_3.setBounds(10, 190, 200, 30);
                btnNewButton_3.setBackground(Color.BLACK);
                btnNewButton_3.setForeground(Color.WHITE);

		contentPane.add(btnNewButton_3);
	

		
		JButton btnNewButton_4 = new JButton("Search Room");
		btnNewButton_4.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
				try {
				SearchRoom search = new SearchRoom();
				search.setVisible(true);
                                setVisible(false);
				}
				catch (Exception ss){
					ss.printStackTrace();
				}
			}
		});
		btnNewButton_4.setBounds(10, 230, 200, 30);
                btnNewButton_4.setBackground(Color.BLACK);
                btnNewButton_4.setForeground(Color.WHITE);

		contentPane.add(btnNewButton_4);
		
//		JButton btnNewButton_5 = new JButton("Log Out");
//		btnNewButton_5.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent ae) {
//				try {
//                                    new Login().setVisible(true);
//                                    setVisible(false);
//                                    
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//				
//			}
//		});
//		btnNewButton_5.setBounds(10, 310, 200, 30);
//                btnNewButton_5.setBackground(Color.BLACK);
//                btnNewButton_5.setForeground(Color.WHITE);
//
//		contentPane.add(btnNewButton_5);
		
//		JButton btnNewButton_6 = new JButton("Update Room Status");
//		btnNewButton_6.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				try{
//					UpdateRoom room = new UpdateRoom();
//					room.setVisible(true);
//                                        setVisible(false);
//				}catch(Exception s)
//				{
//					s.printStackTrace();
//				}
//			}
//		});
//		btnNewButton_6.setBounds(10, 350, 200, 30);
//                btnNewButton_6.setBackground(Color.BLACK);
//                btnNewButton_6.setForeground(Color.WHITE);
//
//		contentPane.add(btnNewButton_6);
//		
////		JButton btnPickUpSerice = new JButton("Pick up Service");
////		btnPickUpSerice.addActionListener(new ActionListener() {
////			public void actionPerformed(ActionEvent arg0) {
////				try{
////				PickUp pick = new PickUp();
////				pick.setVisible(true);
////                                setVisible(false);
////				}
////				catch(Exception e){
////					e.printStackTrace();
////				}
////			}
////		});
////		btnPickUpSerice.setBounds(10, 390, 200, 30);
////                btnPickUpSerice.setBackground(Color.BLACK);
////                btnPickUpSerice.setForeground(Color.WHITE);
//
////		contentPane.add(btnPickUpSerice);
//		
//		JButton btnSearchRoom = new JButton("Search Room");
//		btnSearchRoom.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				try {
//				SearchRoom search = new SearchRoom();
//				search.setVisible(true);
//                                setVisible(false);
//				}
//				catch (Exception ss){
//					ss.printStackTrace();
//				}
//			}
//		});
//		btnSearchRoom.setBounds(10, 430, 200, 30);
//                btnSearchRoom.setBackground(Color.BLACK);
//                btnSearchRoom.setForeground(Color.WHITE);
//
//		contentPane.add(btnSearchRoom);
//
		JButton btnNewButton_7 = new JButton("Log Out");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
                                    new Login().setVisible(true);
                                    setVisible(false);
                                    
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		btnNewButton_7.setBounds(10, 470, 200, 30);
                btnNewButton_7.setBackground(Color.BLACK);
                btnNewButton_7.setForeground(Color.WHITE);

		contentPane.add(btnNewButton_7);
                getContentPane().setBackground(Color.WHITE);
                
                setVisible(true);
	}
}
