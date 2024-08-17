import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code ="CheckboxApplet.class" width=400 height=400></applet>*/

public class CheckboxApplet extends Applet implements ItemListener

{
    String msg;
    Checkbox checkbox1,checkbox2,checkbox3;


    public void init()

    {

        checkbox1 = new Checkbox("Option 1", null, false);

        checkbox2 = new Checkbox("Option 2", null, false);

        checkbox3 = new Checkbox("Option 3", null, false);
	 add(checkbox1);  add(checkbox2);  add(checkbox3);
       checkbox1.addItemListener(this);	
        checkbox2.addItemListener(this);	
        checkbox3.addItemListener(this);	
       

    }
 public void itemStateChanged(ItemEvent ie)
 {


     repaint();

 }

   public void paint(Graphics g)
  {
         msg =  "1  "+ checkbox1.getState();  
     g.drawString(msg,100,100);
     msg =  "2  "+ checkbox2.getState();    
     g.drawString(msg,100,110);
     msg =  "3  "+ checkbox3.getState();    
     g.drawString(msg,100,120);

  }
 
 
}

// Other Useful Methods: disable, show,hide,setCheckboxGroup, getCheckboxGroup