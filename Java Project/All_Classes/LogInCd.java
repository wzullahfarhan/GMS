package All_Classes;

import Oparetions.*;
import java.io.*;
import java.nio.file.*;
import javax.swing.*;



public class LogInCd implements InterfaceLoginOp {
    String TF1;
    String TF2;
    int k=0;
    public void MatchInAdmin( String TF1, String TF2) {
        try {
            String User_Name = "User_Name:" + TF1;
            String PassWord = "PassWord:" + TF2;
            BufferedReader reader = new BufferedReader(new FileReader(".\\Data\\admin_data.txt"));

            int totalLines = 0;
            while (reader.readLine() != null)
                totalLines++;
            reader.close();

            for (int i = 0; i <= totalLines; i++) {
                String line = Files.readAllLines(Paths.get(".\\Data\\admin_data.txt")).get(i);
                if (line.equals(User_Name)) {
                    String line2 = Files.readAllLines(Paths.get(".\\Data\\admin_data.txt")).get((i + 1));
                    if (line2.equals(PassWord)) {

                       // new AdminPanel();
                        k = 1;
                        break;

                    }
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, " Wrong User Name or Password ", "Message", 2);
        }
    }

    
}
