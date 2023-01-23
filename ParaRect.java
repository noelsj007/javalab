import java.awt.*;
import java.applet.*;

public class ParaRect extends Applet{
    public void paint(Graphics g){ 

       Color col = new Color(Integer.parseInt(this.getParameter("color"),16));
       g.setColor(col);
       g.fillRect(Integer.parseInt(getParameter("x")),Integer.parseInt(getParameter("y")),150,100);
    }
}