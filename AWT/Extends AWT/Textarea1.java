import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code=Textarea1 width=500 height=500>
</applet>
*/
public class Textarea1 extends Applet
{
	MyButton myButton;
	TextField tf;
	TextArea ta;
	static String text;
	public void init()
	{
		tf=new TextField(10);
		add(tf);

		myButton = new MyButton("Button");
		add(myButton);

		ta=new TextArea(text,5,30);
		add(ta);
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
			text=tf.getText();
			ta.setText(text);
			super.processActionEvent(ae);
		}
	}
}