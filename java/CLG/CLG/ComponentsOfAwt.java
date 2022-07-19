import java.awt.*;
import java.awt.event.*;

class ComponentsOfAwt
{
    Frame f;
    Button b1;
    Label l;
    TextField tf;
    TextArea ta;
    Checkbox cb;
    //Choice c;
    //List l;
    Panel p,p1;
    ComponentsOfAwt()
    {
        f=new Frame("vikas 211020033");
        b1=new Button("button component");
        l=new Label("Label component");
        tf=new TextField("textField component");
        ta=new TextArea("TextArea component");
        cb=new Checkbox("CheckBox component");
        //c= new Choice("Choice component");
        //l= new List("List component");

        p= new Panel(new FlowLayout());
        //p1= new Panel(new FlowLayout());

        p.add(b1);
        p.add(l);p.add(tf);
        p.add(ta);p.add(cb);//p.add(c);
        f.add(p);
        //f.add(p1);

        f.setSize(800,800);
        f.setVisible(true);
        f.setLayout(null);
    }
    public static void main(String args[])
    {
        ComponentsOfAwt obj=new ComponentsOfAwt();
    }
}