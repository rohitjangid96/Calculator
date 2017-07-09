import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;

import java.awt.*;
import java.awt.event.*;

class Calc extends Frame implements ActionListener,KeyListener
{

TextField t1;
Button num[];
Button mul,add,div,sub,mod;
Button clear,equal;
Panel p1,p2;

Calc()
{
	initComponents();
}

Object evaluate(String foo) throws Exception
{
	ScriptEngineManager mgr=new ScriptEngineManager();
		ScriptEngine engine=mgr.getEngineByName("JavaScript");
		
	return(engine.eval(foo));
}


public void keyPressed(KeyEvent e)
{

}
public void keyReleased(KeyEvent e)
{

}
public void keyTyped(KeyEvent e)
{
if(e.getKeyChar()=='x'||e.getKeyChar()=='X')
	System.exit(0);
}
public void actionPerformed(ActionEvent e)
{
	
	if(e.getSource()==num[1])
	{
		t1.setText(t1.getText()+"1");
	}
	else if(e.getSource()==num[2])
	{
		t1.setText(t1.getText()+"2");
	}
	else if(e.getSource()==num[3])
	{
		t1.setText(t1.getText()+"3");
	}
	else if(e.getSource()==num[4])
	{
		t1.setText(t1.getText()+"4");
	}
	else if(e.getSource()==num[5])
	{
		t1.setText(t1.getText()+"5");
	}
	else if(e.getSource()==num[6])
	{
		t1.setText(t1.getText()+"6");
	}
	else if(e.getSource()==num[7])
	{
		t1.setText(t1.getText()+"7");
	}
	
	else if(e.getSource()==num[8])
	{
		t1.setText(t1.getText()+"8");
	}
	else if(e.getSource()==num[9])
	{
		t1.setText(t1.getText()+"9");
	}
	else if(e.getSource()==num[0])
	{
		t1.setText(t1.getText()+"0");
	}
	else if(e.getSource()==num[10])
	{
		t1.setText(t1.getText()+".");
	}
	
	else if(e.getSource()==mul)
	{
		t1.setText(t1.getText()+"*");
	}
		else if(e.getSource()==add)
	{
		t1.setText(t1.getText()+"+");
	}
		else if(e.getSource()==sub)
	{
		t1.setText(t1.getText()+"-");
	}
		else if(e.getSource()==div)
	{
		t1.setText(t1.getText()+"/");
	}
		else if(e.getSource()==mod)
	{
		t1.setText(t1.getText()+"%");
	}
			else if(e.getSource()==clear)
	{
		t1.setText(" ");
	}
	
		else if(e.getSource()==equal)
	{
		try{
		t1.setText(t1.getText()+"="+evaluate(t1.getText())+"");
		}
		catch(Exception e1)
		{
			
		}
	}
}
void initComponents() 
{
	setTitle(" OUR CALCULATOR ");
	t1=new TextField("WELCOME TO OUR CALCULATOR",25);
	
	t1.setSize(400,100);
	num=new Button[11];
	num[0]=new Button("0");
	num[0].setSize(160,80);
	num[10]=new Button(".");
	num[10].setSize(80,80);
	for(int i=1;i<10;i++)
	{
		
		num[i]=new Button(" "+i)		;
		num[i].setSize(80,80);
		}
	
	
	mul = new Button("*");
	mul.setSize(80,80);
	sub = new Button("-");
	div = new Button("/");
	add = new Button("+");
	clear=new Button("C");
	mod = new Button("%");
	equal=new Button("=");
	clear.setSize(80,80);mod.setSize(80,80);sub.setSize(80,80);add.setSize(80,80);div.setSize(80,80);
	equal.setSize(160,80);
	p1=new Panel();
    for( int i=9;i>0;i--)
	{
		p1.add(num[i]);
	}
	
	p1.setLayout(new GridLayout(3,3));
	p1.setSize(240,240);
	p2=new Panel();
	
	p2.add(mul);p2.add(clear);p2.add(sub);p2.add(add);p2.add(div);p2.add(mod);
	p2.setLayout(new GridLayout(3,2));
	p2.setSize(160,240);
	
	setLayout(null);
	setSize(450,550);
	setLocation(250,100);
	
	t1.setLocation(20,50);
	p1.setLocation(20,160);
	p2.setLocation(260,160);
	num[0].setLocation(20,390);
	num[10].setLocation(180,390);
	equal.setLocation(260,390);
	
	add(t1);
	add(p1);
	add(p2);
	add(num[0]);add(num[10]);
	add(equal);
	
	for(int i=0;i<11;i++)
	{
		
		num[i].addActionListener(this);
		}
		add.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		equal.addActionListener(this);
		sub.addActionListener(this);
		clear.addActionListener(this);
		mod.addActionListener(this);
 t1.addKeyListener(this);
	
}

public static void main(String args[])
{
	
	new Calc().setVisible(true);
}
}