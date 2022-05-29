import java.awt.*;
import java.awt.event.*;
class MouseEvnt implements MouseListener
{
    Frame f1=new Frame();
    Label l1=new Label();
    f1.setVisible(true);
    f1.setSize(400,400);
    l1.setBounds(40,50,200,300);
    f1.add(l1);

    public void mouseClicked(MouseEvent e)
    {

        l1.setText("mouse clicked");
        l1.repaint();
    }
    public void mouseEntered(MouseEvent e)
    {
        l1.setText("entered");
    }
    public void mouseExited(MouseEvent e)
    {
        l1.setText("mouse Exited");
    }
    public void mousePressed(MouseEvent e)
    {
        l1.setText("mouse Pressed");
    }
    public void mouseReleased(MouseEvent e)
    {
        l1.setText("mouse Released");
    }
    public static void main(String args[])
    {
    new MouseEvnt();
}
}