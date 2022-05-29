import java.applet.Applet;
import java.awt.*;
/*<applet code="ParamTag" width="400" height='400'>
    <param name="site" value="www.vikaspradhan21.bloger.com">
 </applet>*/

public class ParamTag extends Applet
{
    private String defaultmsg = "hlo";
   public void paint(Graphics g)
    {
        String s1=getParameter("site");
        if(s1==null)
        s1=defaultmsg;
        g.drawString(s1,100,100); 
        //100 for left side and 200 form top
    }
}