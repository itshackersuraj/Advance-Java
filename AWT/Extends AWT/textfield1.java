
/*1. Display a text field on the applet. After making any selection from the checkbox displayed near to it, text will get displayed on status bar.*/

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="textfield1" width=500 height=500>
</applet>*/

public class textfield1 extends Applet
{

        MyCheckbox mcb;
        TextField t;
	static String s;
        public void init()
        {
                   t=new TextField(20);
                   add(t);
        
                   mcb=new MyCheckbox("CLICK HERE");
                   add(mcb);
		   	   
        }

        class MyCheckbox extends Checkbox
        {
                public MyCheckbox(String label)
                {

                        super(label);
                        enableEvents(AWTEvent.ITEM_EVENT_MASK);
                }


                protected void processItemEvent(ItemEvent ie)
                {
                         s=t.getText();
			 if(getState()==true)
                         showStatus(s);
                         else
                         showStatus("Text Box Is Empty ");
                         super.processItemEvent(ie);
                }

        }

}                             
