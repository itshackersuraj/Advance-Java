import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code="SimpleLabel1.class" width =600 height=600></applet>*/

public class SimpleLabel1 extends Applet  implements ActionListener {

    Label l1,l2,l3; 
    Button b1,b2;

    public void init () 
   {
        l1= new Label("First Lable");
        l2=new Label("Second Label");
	l2.setBackground(new Color(255,0,0));
	l3=new Label("Third Label",1); 
	l3.setForeground(new Color(255,0,0));
	add(l1);
	add(l2);
	add(l3);
		
	 b1= new Button("Try Label Methods: Hide L1");
	 b1.addActionListener(this);
	 add(b1);
	b2= new Button("Try Label Methods: Show and move L1"); 
	b2.addActionListener(this); 
	add(b2);
    }

    public void actionPerformed (ActionEvent e)   //getting action command
   {

        
        if (e.getSource()==b1)    
  	{   
		l1.hide(); 
	}

	if (e.getSource()==b2)    
  	{   
		l1.show();
       		l1.move(500,500);}        
		
    }

   public void paint(Graphics g)
  {
    
  }

}

// Other Useful Methods

//show, hide, setEnabled,setBounds, move, resize, setForeground, setBackground


 