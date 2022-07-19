import java.awt.*;
import java.awt.event.*;

class ColorAndFont
{
    Frame f;
    Font font;
    String msg;
    ColorAndFont()
    {
        f=new Frame("vikas 211020033");
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(500,500);
    }
    public void paint(Graphics g)
        {
            msg="font color and Font";
            font=new Font("java",Font.PLAIN,20);
            g.setFont(font);
            g.drawString(msg, 30,50);
        }        
        public static void main(String args[])
        {
            ColorAndFont obj=new ColorAndFont();
        }
}