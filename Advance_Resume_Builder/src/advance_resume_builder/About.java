/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advance_resume_builder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Window.Type;

public class About {
        JFrame frmAbout;
        
        public static void main(String args[]){
            EventQueue.invokeLater(new Runnable(){
                public void run(){
                    try{
                        About window= new About();
                        window.frmAbout.setVisible(true);
                    }
                    catch(Exception e){
                        e.printStackTrace();
                    }
                }
            });
        }
        
        public About(){
            initialize();
        }
        
        private void initialize(){
            frmAbout= new JFrame();
            frmAbout.setType(Type.UTILITY);
            frmAbout.setTitle("About");
            frmAbout.getContentPane().setBackground(new Color(250, 250, 210));
            frmAbout.setBounds(400, 100, 450, 247);
            frmAbout.getContentPane().setLayout(null);
            
            JLabel lblAboutApp= new JLabel("About App");
            lblAboutApp.setFont(new Font("Tahoma", Font.BOLD, 18));
            lblAboutApp.setBounds(167, 11, 137, 43);
            frmAbout.getContentPane().add(lblAboutApp);
            
            JTextArea txtrThisAppIs= new JTextArea();
            txtrThisAppIs.setEditable(false);
            txtrThisAppIs.setBackground(new Color(250, 250, 210));
            txtrThisAppIs.setText("This app is Created By Akash Kumar Srivastava");
            txtrThisAppIs.setBounds(21, 47, 403, 22);
            frmAbout.getContentPane().add(txtrThisAppIs);
            
            JTextArea txtrH= new JTextArea();
            txtrH.setEditable(false);
            txtrH.setBackground(new Color(250, 250, 210));
            txtrH.setText("Roll Number: - 14");
            txtrH.setBounds(21, 75, 403, 33);
            frmAbout.getContentPane().add(txtrH);
            
            JTextArea txtrOopLabProject= new JTextArea();
            txtrOopLabProject.setEditable(false);
            txtrOopLabProject.setBackground(new Color(250, 250, 210));
            txtrOopLabProject.setText("Java Lab Project: Automatic Resume Builder");
            txtrOopLabProject.setBounds(21, 108, 403, 22);
            frmAbout.getContentPane().add(txtrOopLabProject);
            
            JTextArea txtrUserNameIqra= new JTextArea();
            txtrUserNameIqra.setEditable(false);
            txtrUserNameIqra.setBackground(new Color(250, 250, 210));
           txtrUserNameIqra.setText("User Name: Akash");
           txtrUserNameIqra.setBounds(21, 138, 380, 33);
           frmAbout.getContentPane().add(txtrUserNameIqra);
           
           JTextArea txtrPasswordIqra= new JTextArea();
           txtrPasswordIqra.setEditable(false);
           txtrPasswordIqra.setBackground(new Color(250, 250, 210));
           txtrPasswordIqra.setText("Password: Akash");
           txtrPasswordIqra.setBounds(21, 169, 391, 33);
           frmAbout.getContentPane().add(txtrPasswordIqra);
        }
}
