/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsagui.GradeMark;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author johnl
 */ 
public class gradeMark extends JFrame {
    private JLabel gradeMark,lblName;
    gradeMark(){
        setSize(600,600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        gradeMark = new JLabel("Grades",SwingConstants.CENTER);
        gradeMark.setBounds(220, 20, 90, 50);
        add(gradeMark);
        
        lblName = new JLabel("Name: ",SwingConstants.LEFT);
        lblName.setBounds(80, 40, 90, 50);
        add(lblName);
        
        
        
    }
        
    
}
