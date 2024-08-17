/*4. Display four checkboxes on the applet. Create their group. When we click any of these check boxes, their label must get appeared on the status bar.*/

/*
* <applet code="checkboxgrp.class" width=300 height=100>
* </applet>
*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class checkboxgrp extends Applet
{
CheckboxGroup cbg;
MyCheckbox myCheckbox1, myCheckbox2, myCheckbox3,myCheckbox4;
public void init()
{
cbg = new CheckboxGroup();
myCheckbox1 = new MyCheckbox("Item 1", cbg, true);
add(myCheckbox1);
myCheckbox2 = new MyCheckbox("Item 2", cbg, false);
add(myCheckbox2);
myCheckbox3 = new MyCheckbox("Item 3", cbg, false);
add(myCheckbox3);
myCheckbox4 = new MyCheckbox("Item 4", cbg, false);
add(myCheckbox4);
}
class MyCheckbox extends Checkbox
{
  
public MyCheckbox(String label, CheckboxGroup cbg, boolean flag)
{
super(label, cbg, flag);
enableEvents(AWTEvent.ITEM_EVENT_MASK);
}
protected void processItemEvent(ItemEvent ie)
{
showStatus("Checkbox name " + getLabel());
super.processItemEvent(ie);
}
}
}