import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class factorGUI extends JFrame implements ActionListener {
    JLabel lb1,lb2;
    JTextField ta;
    JButton b;
    factorGUI(){
        super("Factoring Tool");
        lb1=new JLabel("Enter a big number with at least 7 digits:");
        lb1.setBounds(50,50,300,20);

        ta=new JTextField();
        ta.setBounds(50,100,100,20);

        lb2=new JLabel("Factors:");
        lb2.setBounds(50, 200, 300, 20);

        b=new JButton("Factor");
        b.setBounds(50,320, 80,30);//x,y,w,h  
        b.addActionListener(this);


        add(lb1);add(lb2);add(ta);add(b);

        setSize(400,400);
        setLayout(null);//using no layout manager  
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == b) {
                String text = ta.getText();
                lb2.setText("Factors: " + text);
                writeNumberToFile();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public void writeNumberToFile() throws IOException {
        File file = new File("number.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.write(ta.getText());
        pw.close();
    }

    public static void main(String[] args){
        try {
           ProcessBuilder builder = new ProcessBuilder("Factoring.exe");
           Process process = builder.start();
           InputStream inputStream = process.getInputStream();
           BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1);
           String line;
           while ((line = bufferedReader.readLine()) != null) {
               System.out.print(line);
           }
           inputStream.close();
           bufferedReader.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        new factorGUI();
    }
}
