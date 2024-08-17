import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code ="CheckboxGrpApplet.class" width=400 height=400></applet>*/

public class CheckboxGrpApplet extends Applet implements ItemListener

{
    String msg;
    Checkbox checkbox1,checkbox2,checkbox3;
    CheckboxGroup cbg;

    public void init()

    {
        cbg = new CheckboxGroup();
        checkbox1 = new Checkbox("Option 1", cbg, true);

        checkbox2 = new Checkbox("Option 2", cbg, false);

        checkbox3 = new Checkbox("Option 3", cbg, false);

        checkbox1.addItemListener(this);	
        checkbox2.addItemListener(this);	
        checkbox3.addItemListener(this);	
        add(checkbox1);  add(checkbox2);  add(checkbox3);

    }

   public void paint(Graphics g)
  {
     msg = "U selected " +cbg.getSelectedCheckbox().getLabel();
     g.drawString(msg,100,100);
  }
 
  public void itemStateChanged(ItemEvent ie)
 {
     repaint();

 }
}

// Other Useful Methods : setCurrent(Checkbox bx) , getCurrent()