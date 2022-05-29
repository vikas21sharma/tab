import java.applet.Applet;
import java.awt.*;

//<applet code="AddNoBtn" width="200" height="300"></applet>
public class AddNoBtn extends Applet
{
    Label l1;
    Label l2;
    TextField t1;
    TextField t2;
    Button b1;

    public void init(){
        l1=new Label("enter the first no.");
        l2=new Label("enter the second no.");
        t1=new TextField();
        t2=new TextField();
        b1=new Button("Add");
        setLayout(null);
        l1.setBounds(20,50,100,20);
        t1.setBounds(160,50,100,20);
        l2.setBounds(20,70,140,80);
        t2.setBounds(160,100,100,20);
        b1.setBounds(100,160,80,20);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);

    }
}