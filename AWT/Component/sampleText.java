
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="sampleText.class" width=800 height=800>
 </applet>
*/

public class sampleText extends Applet implements AdjustmentListener,MouseMotionListener

{

   Scrollbar b1,b2;
   String msg="";

   public void init()
 {
   b1=new Scrollbar(Scrollbar.VERTICAL,0,1,0,100);
   b2=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,100);
   add(b1);
   b1.addAdjustmentListener(this);
   add(b2);
   b2.addAdjustmentListener(this);
   addMouseMotionListener(this);
 }


public void adjustmentValueChanged(AdjustmentEvent ae)
{
   repaint();

 }
public void mouseDragged(MouseEvent me)
{
  int x=me.getX();
  int y=me.getY();
  b1.setValue(x);
  b2.setValue(y);
  repaint();
}

public void mouseMoved(MouseEvent me){}

 public void paint(Graphics g)
{
  msg= "vertical: "+ b1.getValue();
  msg += "Horizontal: "+ b2.getValue();
  
   g.drawString(msg,6,100);
 
   
 }
}

