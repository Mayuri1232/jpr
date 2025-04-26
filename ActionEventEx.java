import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ActionEventEx implements ActionListener
{
JButton b1,b2;
JFrame f;
JLabel l;
String msg="";
ActionEventEx()
{
b1=new JButton("Yes");
b2=new JButton("No");
f=new JFrame();
f.setSize(500,500);
f.setVisible(true);
f.setLayout(new FlowLayout());
l=new JLabel();
f.add(b1);
f.add(b2);
f.add(l);
b1.addActionListener(this);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent a)
{
if(a.getSource()==b1)
{
msg="You Pressed Yes";
}
else
{
msg="You Pressed No";
}
l.setText(msg);
}
public static void main(String args[])
{
new ActionEventEx();
}
}