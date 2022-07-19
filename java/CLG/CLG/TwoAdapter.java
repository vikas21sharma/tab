import java.awt.*;    
import java.awt.event.*;    
  
public class TwoAdapter extends MouseAdapter
{  
    Frame f;  
    String msg;  
    TwoAdapter()
     {    
        f = new Frame ("Vikas 211020033"); 
        f.addMouseListener(this);
        f.addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                f.dispose();    
            }    
        });    

        f.setSize (800,800);    
        f.setLayout (null);    
        f.setVisible (true);    
    }    

    public void mouseClicked (MouseEvent e) {    
       
                Graphics g = f.getGraphics();    
                g.setColor (Color.RED);
                //g.drawString(msg,30,30);    
                g.fillRect(e.getX(), e.getY(), 30, 30);    
            }    
  
public static void main(String[] args) {    
    TwoAdapter obj = new TwoAdapter();    
}    
}