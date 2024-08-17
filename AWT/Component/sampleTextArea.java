import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code = "sampleTextArea.class"  width = 600 height=600></applet>*/

public class sampleTextArea extends Applet implements ActionListener
{
 String  msg ;
 TextArea t1,t2;
 Label l1 ,l2 ;
 
  public void init()
  {
        l1= new Label("Name: ");
	add(l1);
        t1 = new TextArea(10,20);
	add(t1);
	l2 = new Label("Passworld : ");
	add(l2);
	t2= new TextArea(10,20);
	add(t2);
	

	


  }
  
 public void actionPerformed(ActionEvent ae)  
 { 
		repaint();

 }

 public void paint(Graphics g)
 {

	g.drawString("Row of T1 : "+ t1.getRows(),300, 300);
	g.drawString("Row of T2 : "+ t2.getRows(),200,200);
 }

}