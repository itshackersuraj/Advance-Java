/*13. Enter the text in the text area. When you press the button near to it, the total number of digits that text contains, will get appeared in the status bar.*/

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="textarea.class" width=500 height=500>
</applet>
*/
public class textarea.class extends Applet
{
	MyButton myButton;
	
	TextArea ta;
	static String text;
	public  int count=0;
	 char arr[];
	public void init()
	{
				
		ta=new TextArea(text,5,30);
		add(ta);
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
			text=ta.getText();
			arr=text.toCharArray();
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>='0' && arr[i]<='9')
				 	count++;
			}
			showStatus(String.valueOf(count));
			super.processActionEvent(ae);
		}
	}
}