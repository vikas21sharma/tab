import java.awt.*;    
import java.awt.event.*;

public class NewGrid implements ActionListener
{    
Frame f;    
Button b1, b2, b3;
Label l;
NewGrid() {    
    f=new Frame();          
    b1 = new Button("1");
    b1.addActionListener(this);
    b2 = new Button("2");
    b2.addActionListener(this);
    b3 = new Button("3");
    b3.addActionListener(this);

    l = new Label();

    f.add(b1); f.add(b2); f.add(b3); f.add(l) ;
  
    f.setLayout(new GridLayout(2,2));    
    f.setSize(300,300);    
    f.setVisible(true);    
}  
public void actionPerformed(ActionEvent e) {
    l.setText("Hello");
}
public static void main(String[] args) {    
    new NewGrid();    
}    
}    