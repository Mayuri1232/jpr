import java.awt.event.*;
import java.awt.*;
class mousee implements MouseListener
{
Frame f;
public mousee()
{
f=new Frame();
f.setSize(500,500);
f.setVisible(true);
f.addMouseListener(this);
}
public void mousePressed(MouseEvent e)
{
f.setBackground(Color.red);
}
public void mouseClicked(MouseEvent e)
{
f.setBackground(Color.yellow);
}
public void mouseReleased(MouseEvent e)
{
f.setBackground(Color.black);
}

public void mouseEntered(MouseEvent e)
{
f.setBackground(Color.pink);
}
public void mouseExited(MouseEvent e)
{
f.setBackground(Color.orange);
}
public static void main(String args[])
{
new mousee();
}
}
