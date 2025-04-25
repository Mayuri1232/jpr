import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;
class JTreeEx
{
JTreeEx()
{
JFrame f=new JFrame();
f.setSize(500,500);
f.setLayout(new FlowLayout());
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
DefaultMutableTreeNode a=new DefaultMutableTreeNode("Option");
DefaultMutableTreeNode a1=new DefaultMutableTreeNode("A");
DefaultMutableTreeNode a2=new DefaultMutableTreeNode("B");
DefaultMutableTreeNode a11=new DefaultMutableTreeNode("a1");
DefaultMutableTreeNode a12=new DefaultMutableTreeNode("a2");
DefaultMutableTreeNode a21=new DefaultMutableTreeNode("b1");
a1.add(a11);
a1.add(a12);
a2.add(a21);
a.add(a1);
a.add(a2);
JTree jt=new JTree(a);
f.add(jt);
}
public static void main(String args[])
{
new JTreeEx();
}
}