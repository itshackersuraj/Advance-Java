/*8. Display a list control on the applet. After we make the selection by double clicking the item name must be displayed in front of the string “Your Selection is: ” on the applet.*/
/*
* <applet code="listcontrol.class" width=800 height=800>
* </applet>
*/

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class listcontrol extends Applet
{
MyList list;
static String s;
public void init()
{
list = new MyList();
list.add("Red");
list.add("Green");
list.add("Blue");
add(list);
}

public void paint(Graphics g)
{
g.drawString(s,30,60);
}
class MyList extends List
{
public MyList()
{
enableEvents(AWTEvent.ACTION_EVENT_MASK);
}
protected void processActionEvent(ActionEvent ie)
{
s="Your selection is "+ie.getActionCommand();
showStatus(s);

super.processActionEvent(ie);
}
}
}