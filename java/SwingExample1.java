import javax.swing.*;
import java.awt.event.*;
class SwingExample1 implements ActionListener
{
    public static void main(String args[])
    {
        JFrame f1=new JFrame();
        JLabel l=new JLabel("Additon of Two Numbers:");
        JLabel l1=new JLabel("Enter The first Numbers:");
        JLabel l2=new JLabel("Enter The Second Numbers:");
        JLabel l3=new JLabel("Sum of Two Numbers:");        
        JTextField tf=new JTextField();
        JTextField tf1=new JTextField();
        JTextField tf2=new JTextField();
        
        JButton b1= new JButton("add");
       // JButton b2=new JButton();
        f1.setSize(300,300);
        f1.setLayout(null);

        l.setBounds(90,10,200,20);
        l1.setBounds(30,30,200,20);
        l2.setBounds(30,60,200,20);
        l3.setBounds(30,150,200,20);
        tf.setBounds(200,30,100,20);
        tf1.setBounds(200,60,100,20);
        tf2.setBounds(100,150,100,20);
        b1.setBounds(50,90,80,30);
        b1.addActionListener(new handler());

      // f1.add(b1);
        f1.add(l);
        f1.add(l1);
        f1.add(l2);
        f1.add(l3);
        f1.add(tf);
        f1.add(tf1);
        f1.add(tf2);
        f1.add(b1);

        //f1.add(l1);
        //f1.add(l2);
        //f1.add();
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cmd properly close/couser

        //Button Action Perform
        //b1.addActionPerformed()
    }
}
// class handler
// {
//   void actionPerformed(ActionEvent e)
//   {
//     int a=Integer.parseInt(tf.getText());
//     int b=Integer.parseInt(tf1.getText());
//     int c;
//     c=a+b;
//     tf2.setText(c);
//   }
// }