import java.awt.*;
import java.awt.event.*;;

public class gui3 extends Frame implements ActionListener,ItemListener
{
    TextField t1, t2, t3;
    Checkbox c1, c2;
    Button b1;

    gui3() 
    {
        //TextField t4 = new TextField("HELLO", 50);
        t1 = new TextField("Enter First Number:",50);
        t2 = new TextField("Enter Second Number:",50);
        t3 = new TextField(50);

        c1 = new Checkbox("Add");
        c2 = new Checkbox("Multiply");

        b1 = new Button("Close");

        setSize(1920, 1080);
        setVisible(true);
        setBackground(Color.GRAY);
        setLayout(new FlowLayout());

        add(t1);
        add(t2);
        add(t3);
        add(c1);
        add(c2);
        add(b1);

        b1.addActionListener(this);
        c2.addItemListener(this);
        c1.addItemListener(this);

    }
    boolean state1 = false;
    public void actionPerformed(ActionEvent ae) 
    {
        if (ae.getSource() == b1)   dispose();
        //if(ae.getSource() == c1 and c1.getState())
    }

    public void itemStateChanged(ItemEvent ie) 
    {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        
        if( ie.getSource() == c1 && c1.getState())
        {
        
            t3.setText(""+(a+b));
        }
        if( ie.getSource() == c2 && c2.getState())
        {
            t3.setText(" " + (a*b));
        }
    }
    public static void main(String[] args) 
    {
        gui3 obj = new gui3();
    }

    
}