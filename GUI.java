import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;
public class GUI {  
JFrame f;  
GUI(){  
    f=new JFrame();//creating instance of JFrame  
    JFrame f= new JFrame("Factoring tool");  //creating instance of JButton  
    
    JLabel l1;  
    l1=new JLabel("Would you like to factor a really big number?");  
    l1.setBounds(50,50, 200,30);
    f.add(l1);//adding label

    JTextField t1;  
    t1=new JTextField("10 digits please");  
    t1.setBounds(50,100, 200,30);  
    f.add(t1);

    JDialog d;
    d = new JDialog(f , "Dialog Example", true);  
    d.setLayout( new FlowLayout() );  
    JButton b = new JButton ("OK");  
    b.addActionListener ( new ActionListener(){
        public void actionPerformed( ActionEvent e )  
        {  
            GUI.d.setVisible(false);  
        }  
    });
    d.add( new JLabel ("Click button to continue."));  
    d.add(b);   
    d.setSize(300,300);    
    d.setVisible(true);
            
    f.add(b);//adding button in JFrame  

    f.setSize(400,500);//400 width and 500 height  
    f.setLayout(null);//using no layout managers  
    f.setVisible(true);//making the frame visible  
}  
  
public static void main(String[] args) {  
    new GUI();  
}  
}  