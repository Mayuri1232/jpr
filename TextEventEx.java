import java.awt.*;
import java.awt.event.*;
class TextEventEx extends Frame implements TextListener 
{
TextField textField;
Label label;
TextEventEx() 
{
textField = new TextField(30);
label = new Label("Type something...");
setLayout(new FlowLayout());
textField.addTextListener(this);
add(textField);
add(label);
setSize(300, 150);
setVisible(true);
}
public void textValueChanged(TextEvent e) 
{
label.setText("You typed: " + textField.getText());
}
public static void main(String[] args) 
{
new TextEventEx();
}
}
