import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code="SimpleB.class" width =600 height=600></applet>*/

public class SimpleB extends Applet implements ActionListener {

    Button b;String msg;

    public void init () 
   {
        b = new Button ("One");
	add(b);
        b.addActionListener (this);
        b = new Button ("Two");
	add(b);
        b.addActionListener (this);
    }

    public void actionPerformed (ActionEvent e)   //getting action command
   {

         String s= e.getActionCommand();

        

        if ("One".equals(s)) {  msg = "one clicked"; repaint(); }
        if ("Two".equals(s)) {  msg = "two clicked";repaint(); }
    }

   public void paint(Graphics g)
  {
       g.drawString(msg,100,100);
  }

}

// Other Useful Methods

// hide , show , setBounds, setFont, setBackground, setForeGround, setSize, getActioncommand, 


 