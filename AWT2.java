/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements MouseListener{
    public MyFrame(){
        addMouseListener(this);
    }
    @Override 
    public void paint(Graphics g){
        g.drawString(msg,x,y);
    }
    @Override
    public void mouseDragged(MouseEvent e){
        x=e.getX();
        y=e.getY();
        msg="Mouse dragging at"+x+","+y;
        repaint();
    }
    @Override 
    public void mouseMoved(MouseEvent e){
        x=e.getX();
        y=e.getY();
        msg="Mouse moved at"+x+","+y;
        reapint();
    }
}
public class Main
{
	public static void main(String[] args) {
		MyFrame f1=new MyFrame();
		f1.setSize(500,500);
		f1.setVisible(true);
	}
}
