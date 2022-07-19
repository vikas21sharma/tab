import java.awt.*;
import java.awt.event.*;

class New implements ActionListener,WindowListener,WindowAdapter
{
    Frame f;
    TextField tf;
    Button b1,b2,b3;
    New()
    {
        f= new Frame();
        f.addWindowListener(this);
        b1=new Button();
        tf=new TextField();
        f.add(b1);f.add(tf);
        b1.addActionListener(this);
        f.setSize(500,500);
        f.setVisible(true);
        f.setLayout(new GridLayout(1,1));
    }
    // public class myWindowAdapter extends WindowAdapter
    // {
        public void windowClosing(WindowEvent we){
        System.exit(0);
        }
    //}
    public void actionPerformed(ActionEvent ae)
    {
        tf.setText("hii vikas");
    }
    public static void main(String a[])
    {
        new New();
    }
}