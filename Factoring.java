import java.awt.*;  
import javax.swing.*;  
import java.awt.event.*;  

public class Factoring extends JFrame implements ActionListener{  
    JLabel lb1,lb2;  
    JTextField ta;  
    JButton b;  
    Factoring(){  
        super("Factoring Tool");  
        lb1=new JLabel("Enter a big number with at least 7 digits:");  
        lb1.setBounds(50,50,300,20);  
          
        ta=new JTextField();  
        ta.setBounds(50,100,100,20);
          
        b=new JButton("Factor");
        b.setBounds(50,320, 80,30);//x,y,w,h  
        b.addActionListener(this);  
      
  
        add(lb1);add(ta);add(b); 
          
        setSize(400,400);  
        setLayout(null);//using no layout manager  
        setVisible(true);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    static{
        System.loadLibrary("Factoring");
    }
    
    public void actionPerformed(ActionEvent e){  
        if(e.getSource()==b){
            Factoring Tool = new Factoring();
            String text=ta.getText(); 
            String Factors = Tool.Factor(String text);

            lb1.setText("Factors: " + Factors);
        }
    }  

private native void Factor(String numStr);

public static void main(String[] args) {  
    new Factoring();
}

}  