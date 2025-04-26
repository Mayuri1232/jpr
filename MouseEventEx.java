import java.awt.*;
import java.awt.event.*;
class MouseEventEx implements MouseMotionListener
{
Frame f;
public MouseEventEx()
{
f=new Frame();
f.setSize(500,500);
f.setVisible(true);
f.addMouseMotionListener(this);
}
public void mouseMoved(MouseEvent e)
{
f.setBackground(Color.red);
}
public void mouseDragged(MouseEvent e)
{
f.setBackground(Color.yellow);
}
public static void main(String args[])
{
new MouseEventEx();
}
}