package All_Classes;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Welcome extends JFrame{
    public JFrame jFrame;
    public JLabel jLabel1;
    public JPanel jPanel;
    public JPanel jPanel1;
    public JPanel jPanel2;
    public JPanel jPanel3;
    public JButton jButton;

    public Welcome(){

        //creating JFrame
        jFrame= new JFrame("Welcome to GMS");
        jFrame.setSize(700,650);

        //jPanel1 for the title
        //creating jPanel
        jPanel=new JPanel();
        jPanel.setBounds(0,0,680,580);
        jPanel.setBackground(Color.green);
        //creating jPanel1 for Title
        jPanel1=new JPanel();
       // jPanel1.setLayout(null);
        //crating the width and height
        jPanel1.setBounds(50,40,385,43);
        //creating jLebel for the title
        jLabel1=new JLabel("Graveyard Management System");
        jLabel1.setFont(new Font("Serif", Font.PLAIN, 36)); //creating font and its size
        // Set the Border to the JLabel
        Border border = BorderFactory.createLineBorder(Color.BLUE, 4); // Blue border, 4 pixels wide            
        //adding the border in jLebel1
        jLabel1.setBorder(border);
        jLabel1.setOpaque(true);
        jLabel1.setBackground(Color.ORANGE); //adding the color of the background
        jPanel1.add(jLabel1); //adding the jLeble1 in jPanel1
        jPanel.add(jPanel1); //adding jPanel1 in to jPanel
        //finished jPanel1


        //jPanel2 for the photo
        //creating jPanel2
        jPanel2=new JPanel(); 
       // jPanel2.setLayout(null);
        jPanel2.setBounds(50,60,612,409);
        ImageIcon icon = new ImageIcon("Images/first.jpg");//adding the image
        jPanel2.add(new JLabel(icon)); //adding the image in jpanel2
        jPanel.add(jPanel2);//adding jPanel2 in jPanel
        //finishing jpanel2

        
        //jPanel3 for the Button
        jPanel3=new JPanel();
        jPanel3.setBounds(50,80,313,34);
        jPanel3.setBackground(Color.YELLOW);
        //creating button
        jButton=new JButton("START");
        jButton.setBounds(400,600,150,50);
        jButton.setFont(new Font("abadi", Font.PLAIN, 24));
        jPanel3.add(jButton);
        jPanel.add(jPanel3);
        //adding Jpanel in jFrame
        jFrame.add(jPanel);
        jFrame.setVisible(true);
        //creating functionality of the button
         jButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            jFrame.setVisible(false);
            new FirstHome().setVisible(true);
            System.out.println("START Button clicked");
          }
        });  
       // jPanel.setLayout(null);
        
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}