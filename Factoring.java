import java.awt.*;  
import javax.swing.*;  
import java.awt.event.*;  
public class Factoring extends JFrame implements ActionListener{  
    JLabel lb1,lb2;  
    JTextField ta;  
    JButton b;  
    Factoring
(){  
        super("Factoring Tool");  
        lb1=new JLabel("Factors:");  
        lb1.setBounds(50,50,100,20);  
          
        ta=new JTextField();  
        ta.setBounds(50,50,100,100);  
          
        b=new JButton("click");  
        b.setBounds(50,320, 80,30);//x,y,w,h  
        b.addActionListener(this);  
      
  
        add(lb1);add(ta);add(b); 
          
        setSize(400,400);  
        setLayout(null);//using no layout manager  
        setVisible(true);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }  
    public void actionPerformed(ActionEvent e){  
        if(e.getSource()==b){  
        String text=ta.getText();  
        lb1.setText("Factors: ");  
        }
    }  
public static void main(String[] args) {  
    new Factoring
();  
}}  