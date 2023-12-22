package All_Classes;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

public class FirstHome extends JFrame{
    public JFrame jFrame;
    public JLabel jLabel1,l2,l3,l4;
    public JPanel jPanel,P1,P11,P12,P2,P21;
  
    public JButton jButton1,jButton2;

    public FirstHome() 
    {
        //creating JFrame
        jFrame= new JFrame("Home Page");
        jFrame.setSize(800,700);
        jPanel=new JPanel();
        jPanel.setSize(800,700);
        jPanel.setBackground(Color.gray);

        P1=new JPanel();
        P1.setBounds(150,5,505,430);
        P1.setBackground(Color.BLUE);


        P11=new JPanel();
        P11.setBounds(20,0,460,50);

        jLabel1=new JLabel("Graveyard Management System");
        jLabel1.setFont(new Font("Serif", Font.PLAIN, 36)); 
        Border border = BorderFactory.createLineBorder(Color.BLACK, 3); 
       jLabel1.setBorder(border);
        jLabel1.setOpaque(true);
         jLabel1.setBounds(00,00,460,50);
        jLabel1.setBackground(Color.ORANGE); //adding the color of the background
        P11.add(jLabel1);
        P11.setLayout(null);
        P1.add(P11);


        
        P12= new JPanel();
        P12.setBackground(Color.BLUE);
        P12.setBounds(0,55,505,370);
        ImageIcon icon = new ImageIcon("Images/second.jpg");
        P12.add(new JLabel(icon));
        P1.add(P12);
        P1.setLayout(null);
        jPanel.add(P1);



        P2=new JPanel();
        P2.setBackground(Color.green);
        P2.setBounds(10,440,760,200);
        l2=new JLabel("Every soul will taste Death [Quran 3:185]");
        l2.setFont(new Font("Serif", Font.PLAIN, 24)); 
        Border border1 = BorderFactory.createLineBorder(Color.BLACK, 2); 
        l2.setBorder(border1);
        l2.setOpaque(true);
        l2.setBackground(Color.ORANGE);
        l2.setBounds(160, 3, 440, 30);
        P2.add(l2);

        P21=new JPanel();
        P21.setBackground(Color.red);
        P21.setBounds(10,35,740,300);
        
        l3=new JLabel(" To see the list of death Clict in 'Death List' ");
        l3.setFont(new Font("Serif", Font.PLAIN, 25)); 
        l3.setOpaque(true);
        l3.setBackground(Color.ORANGE);
        l3.setBounds(150, 3, 440, 30);
        P21.add(l3);
        P2.add(P21);
        

        jButton1=new JButton("Death List");
        jButton1.setBounds(240,80,280,25);
        jButton1.setFont(new Font("abadi", Font.PLAIN, 24));
        P2.add(jButton1);


        
        l4=new JLabel(" For Adding and Deleting Go to admin panel ");
        l4.setFont(new Font("Serif", Font.PLAIN, 25)); 
        l4.setOpaque(true);
        l4.setLayout(null);
        l4.setBackground(Color.ORANGE);
        l4.setBounds(140, 80, 480, 30);
        P21.add(l4);
        P2.add(P21);
        jButton1.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            jFrame.setVisible(false);
            new Welcome().setVisible(true);
            System.out.println("Death List Button Clicked");
          }
        });
        

        jButton2=new JButton("Admin Panel");
        jButton2.setBounds(240,155,280,25);
        jButton2.setFont(new Font("abadi", Font.PLAIN, 24));
        P2.add(jButton2);

        jButton2.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            System.out.println("Admin Panel Button Clicked");
            jFrame.setVisible(false);
            new LoginPanel().setVisible(true);
          
            
          
        }});


        
        
        
        P2.setLayout(null);
        jPanel.add(P2);

        P21.setLayout(null);
        
        
        
        
        
        jPanel.setLayout(null);
        jFrame.add(jPanel);
        jFrame.setLayout(null);
      
        jFrame.setVisible(true);
       jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        
        
  }

}