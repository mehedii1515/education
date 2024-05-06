
importjava.awt.*; 

import java.awt.event.*;
importjava.applet.Applet;
public class Fact extends Applet implements ActionListener
{
Label l1,l2; TextField t1,t2; Button b1;
public void init(){
l1=new Label("enter the value"); add(l1);
t1=new TextField(10); add(t1);
b1=new Button("Factorial"); add(b1); b1.addActionListener(this);
l2=new Label("Factorial of given no is"); add(l2);
t2=new TextField(10); add(t2);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
int fact=fact(Integer.parseInt(t1.getText())); t2.setText(String.valueOf(fact));
}
}
int fact(int f)

{
int s=0; if(f==0) return 1; else
return f*fact(f-1);
}
}


/*<applet code="Fact.class" height=300 width=300></applet>*/