import javax.swing.*;
import java.awt.*;
class JTableEx extends JFrame
{
JTableEx()
{
final String colhead[]={"Name","percentage","Grade"};
final Object data[][]={{"abc","92","A"},
                                        {"pqr","90","A"},
                                        {"xyz","90","A"}};
JTable jt=new JTable(data,colhead);
JScrollPane sp=new JScrollPane(jt);
add(sp , BorderLayout.CENTER);
}
public static void main(String args[])
{
JTableEx f=new JTableEx();
f.setSize(500,500);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setVisible(true);
}
}

