import javax.swing.*;
import java.awt.*;
public class JTabEx
{
public static void main(String args[])
{
JFrame f=new JFrame();
JTabbedPane e=new JTabbedPane();
f.setSize(1000,1000);
f.setLayout(new FlowLayout());
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
City c=new City();
e.addTab("Cities ",c);
e.addTab("Color",new Colour());
f.add(e);
}
}
class City extends JPanel
{
public City()
{
JButton b1=new JButton("Pune");
JButton b2=new JButton("Mumbai");
add(b1);
add(b2);
}
}
class Colour extends JPanel
{
public Colour()
{
JLabel l1=new JLabel("Yellow");
JLabel l2=new JLabel("Red");
add(l1);
add(l2);
}
}