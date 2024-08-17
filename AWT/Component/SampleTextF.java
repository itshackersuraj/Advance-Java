import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code = "SampleTextF"  width = 600 height=600></applet>*/

public class SampleTextF extends Applet implements ActionListener
{
 String  msg ;
 TextField t1,t2,t3,t4;
 Label l1 ,l2 ;
 
  public void init()
  {
        l1= new Label("Name: ");
	add(l1);
        t1 = new TextField(10);
	add(t1);
	l2 = new Label("Passworld : ");
	add(l2);
	t2= new TextField(10);
	add(t2);
	t2.setEchoChar('#');
	
	

t1.addActionListener(this);
	t2.addActionListener(this);


  }
  
 public void actionPerformed(ActionEvent ae)  
 { 
		repaint();

 }

 public void paint(Graphics g)
 {

	g.drawString("Name is: "+ t1.getText(),200, 200);
	g.drawString("Password is: "+ t2.getText(),100,100);
 }

}