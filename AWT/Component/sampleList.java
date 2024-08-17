
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="sampleList.class" width=800 height=800>
 </applet>
*/

class sampleList extends Applet implements ActionListener

{
  List os;
  String msg = " ";

  public void init() {
    os = new List(3, true);
    os.add("Windows 98");
    os.add("Windows XP");
    os.add("Windows NT");
    os.add("Windows 2000");
    add(os);
    os.addActionListener(this);
  }

  public void actionPerformed(ActionEvent ae) {
    repaint();
  }

  public void paint(Graphics g) {
    msg = "Current os: ";
    int idx[];
    idx = os.getSelectedIndexes();
    for (int i = 0; i < idx.length; i++)

      msg += os.getItem(idx[i]);
    g.drawString(msg, 6, 100);
  }
}
