import java.awt.*;
import javax.swing.*;
class JComboEx
{
JComboEx()
{
JFrame f=new JFrame();
f.setSize(500,500);
f.setLayout(new FlowLayout());
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JLabel l=new JLabel("Select the City :"); 
JComboBox j=new JComboBox();
j.addItem("Mumbai");
j.addItem("Pune");
j.addItem("Solapur");
j.addItem("Satara");
f.add(l);
f.add(j);
}
public static void main(String args[])
{
new JComboEx();
}
}
