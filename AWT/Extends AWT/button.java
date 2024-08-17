/*3. Display a button on the applet. When you press button the total number of clicks will get displayed on the status bar.*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
* <applet code=button width=200 height=100>
* </applet>
*/
public class button extends Applet
{
Button myButton;
static int i = 0;
public void init()
{
myButton = new MyButton("Button");
add(myButton);
}
class MyButton extends Button
{
public MyButton(String label)
{
super(label);
enableEvents(AWTEvent.ACTION_EVENT_MASK);
}
protected void processActionEvent(ActionEvent ae)
{
showStatus("action event: " + i++);
super.processActionEvent(ae);
}
}
}