import java.awt.*;
import java.awt.event.*;
 
public class Frame_ex extends Frame implements ActionListener
 {
    TextField T1, T2, T3;
    Label Lb1, Lb2, Lb3;
    Button b1,b2,b3;
 
    Frame_ex() {
        setLayout(new FlowLayout());
        T1 = new TextField(10);
        T2 = new TextField(10);
        T3 = new TextField(10);
        
 
        Lb1 = new Label("First No");
        Lb2 = new Label("Second No");
        Lb3 = new Label("Result");
        
 
        b1 = new Button("gt");
        b2= new Button("add");
        b3 = new Button("mul");
       
        add(Lb1);
        add(T1);
        add(Lb2);
        add(T2);
        add(Lb3);
        add(T3);
        add(b1);
        add(b2);
        add(b3);
        
        T1.setText(""); // Initialize text fields with empty strings
        T2.setText("");
        T3.setText("");
         
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }
 
    public void actionPerformed(ActionEvent ae) 
    {
        int a, b,result=0;
        
 
        if (ae.getSource() == b1)
           {
           
            a = Integer.parseInt(T1.getText());           
            b = Integer.parseInt(T2.getText());
            System.out.println(a+b);
 
            if (a < b)
             {
                result = b;
             } 
            else
            {
              result = a;
            } 
       
          }
       
           if (ae.getSource() == b2)
           {
            a = Integer.parseInt(T1.getText());           
            b = Integer.parseInt(T2.getText());
           
            result = a + b; 
           } 
            
            
           if (ae.getSource() == b3)
           {
            
            a = Integer.parseInt(T1.getText());           
            b = Integer.parseInt(T2.getText());
           
             result= a * b;
           }      
 
            T3.setText(String.valueOf(result)); 
        
    }
   
 
    public static void main(String[] args) 
    {
        Frame_ex ob = new Frame_ex();
        ob.setTitle("compare");
        ob.setSize(200,300);
        ob.setVisible(true);
    }
}
