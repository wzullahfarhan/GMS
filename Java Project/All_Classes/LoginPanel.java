package All_Classes;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

public class LoginPanel extends LogInCd{
    public JFrame jFrame;
    public JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    public JPanel jPanel,P1,P2,P2_1,P2_2,P2_3,P2_31;
    public JTextField textField;
    public JPasswordField passwordField;
    public JButton jButton;

    public LoginPanel() 
    {
        //creating JFrame
        jFrame= new JFrame("Login Panel");
        jFrame.setSize(750,640);
        jPanel=new JPanel();
        jPanel.setSize(750,600);

        
        P1=new JPanel();
        P1.setBounds(0,0,250,600);
        P1.setBackground(Color.YELLOW);
        P1.setLayout(null);
        jPanel.setLayout(null);
        


        l1=new JLabel("The Death");
        l1.setFont(new Font("Serif", Font.PLAIN, 24)); 
        l1.setOpaque(true);
        l1.setBackground(Color.YELLOW);
        l1.setBounds(10, 10, 200, 30);
        P1.add(l1);

        l2=new JLabel("You Are");
        l2.setFont(new Font("Serif", Font.PLAIN, 24)); 
        l2.setOpaque(true);
        l2.setBackground(Color.YELLOW);
        l2.setBounds(10, 50, 200, 30);
        l2.setOpaque(true);
        P1.add(l2);

        l3=new JLabel("Running");
        l3.setFont(new Font("Serif", Font.PLAIN, 24)); 
        l3.setOpaque(true);
        l3.setBackground(Color.YELLOW);
        l3.setBounds(10, 90, 200, 30);
        l3.setOpaque(true);
        P1.add(l3);
        jPanel.add(P1);

        l4=new JLabel("Away From");
        l4.setFont(new Font("Serif", Font.PLAIN, 24)); 
        l4.setOpaque(true);
        l4.setBackground(Color.YELLOW);
        l4.setBounds(10, 130, 200, 30);
        l4.setOpaque(true);
        P1.add(l4);

        l5=new JLabel("will inevitably");
        l5.setFont(new Font("Serif", Font.PLAIN, 24)); 
        l5.setOpaque(true);
        l5.setBackground(Color.YELLOW);
        l5.setBounds(10, 170, 200, 30);
        l5.setOpaque(true);
        P1.add(l5);

        l6=new JLabel("Come to you");
        l6.setFont(new Font("Serif", Font.PLAIN, 24)); 
        l6.setOpaque(true);
        l6.setBackground(Color.YELLOW);
        l6.setBounds(10, 210, 200, 30);
        l6.setOpaque(true);
        P1.add(l6);

        l7=new JLabel("[Quran 62:8]");
        l7.setFont(new Font("Serif", Font.PLAIN, 24)); 
        l7.setOpaque(true);
        l7.setBackground(Color.yellow);
        l7.setBounds(10, 250, 200, 30);
        l7.setOpaque(true);
        P1.add(l7);
        jPanel.add(P1);


        P2=new JPanel();
        P2.setBackground(Color.gray);
        P2.setBounds(250,0,500,600);
        

        P2_1=new JPanel();
        P2_1.setBounds(50,10,390,40);
        P2_1.setBackground(Color.red);

        l8=new JLabel("Graveyard Management System");
        l8.setFont(new Font("Serif", Font.PLAIN, 24)); 
        l8.setOpaque(true);
        l8.setBackground(Color.red);
        l8.setBounds(5, 0, 380, 30);
        P2_1.add(l8);
        P2.add(P2_1);

        P2_2=new JPanel();
        P2_2.setBounds(50,100,400,197);
        ImageIcon icon = new ImageIcon("Images/third.jpg");
        P2_2.setBackground(Color.gray);
        P2_2.add(new JLabel(icon));
        P2.add(P2_2);

        P2_3=new JPanel();
        P2_3.setBounds(15,310,460,250);
        l9=new JLabel("ADMIN PANEL");
        l9.setFont(new Font("Serif", Font.PLAIN, 26)); 
        l9.setBounds(150,10,200,30);
        l9.setOpaque(true);
        P2_3.setLayout(null);
        P2_3.add(l9);

        P2_31=new JPanel();
        P2_31.setBounds(15,70,440,230);
        P2_31.setLayout(null);


        l10 = new JLabel("User Name  :");
        l10.setBounds(20, 15, 110, 28);
        l10.setForeground(Color.black);
        l10.setOpaque(true);
        l10.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        P2_31.add(l10);
        textField = new JTextField();
        textField.setBounds(170, 15, 200, 26);
        textField.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        textField.setForeground(Color.black);
        textField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        P2_31.add(textField);

        l11 = new JLabel("Password   :");
        l11.setBounds(20, 60, 110, 28);
        l11.setOpaque(true);
        l11.setForeground(Color.black);
        l11.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        P2_31.add(l11);

        passwordField = new JPasswordField();
        passwordField.setBounds(170, 65, 200, 28);
        passwordField.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        passwordField.setForeground(Color.black);
        passwordField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        P2_31.add(passwordField);
        jButton=new JButton("Log In");
        jButton.setBounds(205,110,120,25);
        jButton.setFont(new Font("abadi", Font.PLAIN, 21));

        jButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {

            String textField1 = textField.getText().toLowerCase(); //for the  User Name
           // String textField2 = passwordField.getText(); //for the  Password
            char[] passwordChars = passwordField.getPassword(); // Preferred

// Convert char array to String if needed
            String password = new String(passwordChars);
                
            if ((!textField1.isEmpty() && !password.isEmpty())) {
                

                MatchInAdmin(textField1, password);

                if (k == 1) {
                    System.out.println("Successfully Login");
                    System.out.println("user name is: "+ textField1);
                    System.out.println("Password is: "+ password);
                    jFrame.setVisible(false);
                    new AdminPanel().setVisible(true);
                    
                }}else{
                
                    JOptionPane.showMessageDialog(null, " Fill the blank fields ", "Message", 2);
                }

                    
                        
                        
                    
            System.out.println("Log In Button Clicked");
          }}); 
        P2_31.add(jButton);
        P2_3.add(P2_31);
        P2.add(P2_3);
        P2.setLayout(null);
        jPanel.setLayout(null);
        jPanel.add(P2);
        jFrame.add(jPanel);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        
  }

    public void setVisible(boolean b) {
    }

}