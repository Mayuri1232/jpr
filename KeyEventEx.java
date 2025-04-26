import java.awt.*; 
import java.awt.event.*; 
class KeyEventEx implements KeyListener
{ 
KeyEventEx() 
{ 
Frame f=new Frame(); 
f.setSize(500,500); 
f.setVisible(true); 
f.setLayout(null); 
f.addKeyListener(this); 
} 
public void keyReleased(KeyEvent k) 
{ 
System.out.println("Key Released"); 
} 
public void keyTyped(KeyEvent k) 
{ 
System.out.println("Key Typed"); 
} 
public void keyPressed(KeyEvent k) 
{ 
System.out.println("Key Pressed"); 
} 
public static void main(String args[]) 
{ 
new KeyEventEx();
} 
}