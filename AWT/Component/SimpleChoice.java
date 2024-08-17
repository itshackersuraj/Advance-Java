import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code ="SimpleChoice.class" width=400 height=400></applet>*/

public class SimpleChoice extends Applet implements ItemListener

{
    String msg;
    Choice c1;
    Button b1, b2;
    TextField result = new TextField(27);

    public void init()

    {
        c1 = new Choice();
        c1.addItemListener(this);
        c1.addItem("AAA");
        c1.addItem("BBB");
        c1.addItem("CCC"); // add() also used

        add(c1);
        // b1 = new Button("Count");
        // b1.addActionListener(this);
        // add(b1);
        add(result);
    }

    public void paint(Graphics g) {
        g.drawString(msg, 100, 100);
    }

    // public void actionPerformed(ActionEvent ae)
    // {
    // if(ae.getSource() == b1) { msg= "Count is " +c1.getItemCount(); repaint(); }
    // }

    public void itemStateChanged(ItemEvent ie) {
        result.setText("The selection is " + c1.getSelectedItem());
        repaint();

    }
}

// Other Useful Methods : select(int pos), select (String str), removeAll(),
// remove(string item),
// getSelectedIndex(), String getItem(int index)
