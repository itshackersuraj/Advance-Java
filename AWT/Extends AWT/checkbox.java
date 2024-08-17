/*4. Display four checkboxes on the applet. Create their group. When we click any of these check boxes, their label must get appeared on the status bar.*/

/*
* <applet code=checkbox width=300 height=100>
* </applet>
*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class checkbox extends Applet
{

MyCheckbox myCheckbox1, myCheckbox2, myCheckbox3,myCheckbox4;
public void init()
{

myCheckbox1 = new MyCheckbox("Item 1");
add(myCheckbox1);
myCheckbox2 = new MyCheckbox("Item 2");
add(myCheckbox2);
myCheckbox3 = new MyCheckbox("Item 3");
add(myCheckbox3);
myCheckbox4 = new MyCheckbox("Item 4");
add(myCheckbox4);
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
showStatus("Checkbox name " + getLabel() + getState());
super.processItemEvent(ie);
}
}




























}