// Program No=1-1
import  java.awt.*;
import  java.applet.*;
public class pgm1 extends Applet
{
Label  l1,l2;
Button b;
public void init()
{
l1=new Label("Hello");
l2=new Label("Welcome");
b=new Button("OK");
add(l1);
add(l2);
add(b);
}
}

/*<applet code=pgm1.class width=500 height=500>
</applet>*/