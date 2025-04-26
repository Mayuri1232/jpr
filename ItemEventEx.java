import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 
class ItemEventEx implements ItemListener 
{ 
JComboBox b; 
JFrame f; 
JLabel l; 
String msg=" "; 
ItemEventEx() 
{ 
f=new JFrame(); 
f.setSize(500,500); 
f.setVisible(true); 
f.setLayout(new FlowLayout()); 
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
l=new JLabel(); 
b=new JComboBox(); 
b.addItem("Mumbai"); 
b.addItem("Solapur"); 
b.addItem("Banglore"); 
b.addItem("Pune"); 
f.add(b); 
f.add(l); 
b.addItemListener(this); 
} 
public void itemStateChanged(ItemEvent ie) 
{ 
msg="You are in"; 
msg+=b.getSelectedItem(); 
l.setText(msg); 
} 
public static void main(String args[]) 
{ 
ItemEventEx e=new ItemEventEx(); 
} 
}