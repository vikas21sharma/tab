import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

//<applet code="EventHandling" width="200" height="300"></applet>
public class EventHandling extends Applet
{
    Label l1;
    Label l2,l3;
    TextField t1;
    TextField t2;
    Button b1;

    public void init(){
        l1=new Label("enter the first no.");
        l2=new Label("enter the second no.");
        t1=new TextField();
        t2=new TextField();
        b1=new Button("Add");
        l3=new Label("sum is:=");
        setLayout(null);
        l1.setBounds(20,50,100,20);
        t1.setBounds(160,50,100,20);
        l2.setBounds(20,70,140,80);
        t2.setBounds(160,100,100,20);
        b1.setBounds(100,160,80,20);
        l3.setBounds(120,190,90,30);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(l3);
        b1.addActionListener(new myHandler());
    }
        public class myHandler implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                int a,b,s;
                a=Integer.parseInt(t1.getText());
                b=Integer.parseInt(t2.getText());
                s=a+b;
                l3.setText("sum is"+s);
            } 
        }
    }