import java.awt.*;
class GridEx extends Frame
{
GridEx()
{
int k=1;
for(int i=0;i<=24;i++)
{
add(new Button("  "+k));
k++;
}
}
public static void main(String args[])
{
GridEx e=new GridEx();
e.setSize(500,500);
e.setVisible(true);
e.setLayout(new GridLayout(5,5));
}
}
