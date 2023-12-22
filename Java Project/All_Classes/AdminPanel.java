package All_Classes;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;

public class AdminPanel extends LogInCd{
    public JFrame jFrame;
    public JLabel l1,l2,l3,l4,l5;
    public JPanel jPanel,P1,P2,P2_1,P2_2,P3;
    public JTextField textField;
    public JPasswordField passwordField;
    public JButton jButton1,jButton2,jButton3;

    public AdminPanel() 
    {
        //creating JFrame
        jFrame= new JFrame("Admin Panel");
        jFrame.setSize(750,640);
        jPanel=new JPanel();
        jPanel.setSize(730,600);
        P1=new JPanel();
        P1.setBounds(5,5,730,70);
        P1.setBackground(Color.YELLOW);
        P1.setLayout(null);

        l1=new JLabel("Welcome to the admin panel");
        l1.setBounds(180,6,500,60);
        l1.setFont(new Font("Serif", Font.PLAIN, 34));
        l1.setBackground(Color.YELLOW);
        l1.setLayout(null);
        P1.add(l1);
        jPanel.add(P1);

        P2 =new JPanel();
        P2.setBounds(5,80,320,510);
        P2.setBackground(Color.red);
        P2.setLayout(null);
        P2_1 =new JPanel();
        P2_1.setBounds(5,80,300,170);
        P2_1.setBackground(Color.green);
       

        
        ImageIcon icon = new ImageIcon("Images/forth.jpg");
        P2_1.add(new JLabel(icon));
        P2_1.setBackground(Color.red);
        P2.add(P2_1);

        P2_2 =new JPanel();
        P2_2.setBounds(5,250,300,90);
        P2_2.setBackground(Color.green);
       

        
        ImageIcon icon1 = new ImageIcon("Images/fifth.jpg");
        P2_2.setBackground(Color.red);
        P2_2.add(new JLabel(icon1));
        P2.add(P2_2);

        P3 =new JPanel();
        P3.setBounds(330,80,400,510);
        P3.setLayout(null);
        //P3.setBackground(Color.green);
        

        l2=new JLabel("  Choose anything you want");
        Border border = BorderFactory.createLineBorder(Color.BLUE, 4); 
        l2.setBorder(border);
        l2.setOpaque(true);
        l2.setBounds(20,10,350,40);
        l2.setFont(new Font("Serif", Font.PLAIN, 28));
        
        P3.add(l2);

        l3=new JLabel("For new ADD click 'Add New'");
        l3.setOpaque(true);
        l3.setBounds(20,100,300,40);
        l3.setFont(new Font("Serif", Font.PLAIN, 24));
       
        P3.add(l3);

        jButton1=new JButton("Add new");
        jButton1.setBounds(130,150,140,25);
        jButton1.setOpaque(true);
        jButton1.setFont(new Font("Serif", Font.PLAIN, 24));
        P3.add(jButton1);



        l4=new JLabel("For Update click 'Update'");
        l4.setOpaque(true);
        l4.setBounds(20,200,300,40);
        l4.setFont(new Font("Serif", Font.PLAIN, 24));
       
        P3.add(l4);

        jButton2=new JButton("Update");
        jButton2.setBounds(130,250,140,25);
        jButton2.setOpaque(true);
        jButton2.setFont(new Font("Serif", Font.PLAIN, 24));
        P3.add(jButton2);


        l5=new JLabel("For Delete click 'Delete'");
        l5.setOpaque(true);
        l5.setBounds(20,300,300,40);
        l5.setFont(new Font("Serif", Font.PLAIN, 24));
       
        P3.add(l5);

        jButton3=new JButton("Delete");
        jButton3.setBounds(130,350,140,25);
        jButton3.setOpaque(true);
        jButton3.setFont(new Font("Serif", Font.PLAIN, 24));
        P3.add(jButton3);
       
        
        jPanel.add(P3);
        jPanel.add(P2);
        jPanel.setLayout(null);
        jFrame.add(jPanel);


      
        jFrame.setLayout(null);
      
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
  }

    public void setVisible(boolean b) {
    }
}