import java.awt.*;
class BorderLayoutEx extends Frame
{
BorderLayoutEx()
{
Button b1=new Button("West");
Button b2=new Button("East");
Button b3=new Button("North");
Button b4=new Button("South");
Button b5=new Button("Center");

add(b1,BorderLayout.WEST);
add(b2,BorderLayout.EAST);
add(b3,BorderLayout.NORTH);
add(b4,BorderLayout.SOUTH);
add(b5,BorderLayout.CENTER);
}
public static void main(String args[])
{
BorderLayoutEx e= new BorderLayoutEx();
e.setSize(500,500);
e.setVisible(true);

}
}