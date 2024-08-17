
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="scrollBar" width=300 height=300>
</applet>*/

public class scrollBar extends Applet implements AdjustmentListener , MouseMotionListener 
{
Scrollbar sb;

public void init()
{
           sb=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,500);
           add(sb);
	sb.addAdjustmentListener(this);
	addMouseMotionListener(this);
}

public void  adjustmentValueChanged(AdjustmentEvent ae)
{
	repaint();
}
public void mouseDragged(MouseEvent m){
	int X = m.getX();
	sb.setValue(X);

}
public void mouseMoved (MouseEvent me){
	
}
public void paint(Graphics g ){
g.drawString (" value of sb :"+ sb.getValue(), 200,200);
}
}

