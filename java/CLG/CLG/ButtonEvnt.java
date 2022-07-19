import java.awt.*;
import java.awt.event.*;

public class ButtonEvnt extends Frame implements ActionListener
{
    TextField tf;
    Label l1;
    Button b1;
    ButtonEvnt()
    {
        b1.addActionListener(this);
        tf=new TextField();
        tf.setBounds(10,20,200,20);
        b1=new Button("sum");
        b1.setBounds(50,200,100,20);
        l1=new Label("sum is");
        add(b1);add(l1);add(tf);
        setVisible(true);
    }
        public void actionPerformed()
        {
            String ac = "hii vikas";
            l1.setText(ac);
        }
    public static void main(String a[])
    {
        ButtonEvnt obj = new ButtonEvnt();
    }
}