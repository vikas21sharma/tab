//concept of java applet

//here applet is a package and Applet is class
import java.applet.Applet;
import java.awt.*;//for graphics fun. in paint()

/*this line run when Appletviewer run Appletvierwer don't understand commetns.
or we can run Applet program by write applet tag in another file.file can be txt/html formate
to run type in cmd appletviewer MyApplet or name.txt/html
*/

public class MyApplet extends Applet{
    //1=init call,2nd=start,3rd=paint/stop then,destroy()
    public void paint(Graphics g)
    {
        g.drawString("www.blog/vikasPradhan21.com",100,100); 
        //100 for left side and 200 form top
    }

}
/*
<applet code="MyApplet" width=300 height=100>
</applet>
*/