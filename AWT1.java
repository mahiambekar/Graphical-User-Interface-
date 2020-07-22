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
    public void mouseClicked(MouseEvent e){
        x=e.getX();
        y=e.getY();
        msg="Mouse clicked at"+x+","+y;
        repaint();
    }
    @Override 
    public void mousePressed(MouseEvent e){
        x=e.getX();
        y=e.getY();
        msg="Mouse pressed at"+x+","+y;
        reapint();
    }
    @Override 
    public void mouseReleased (MouseEvent e){
        x=e.getX();
        y=e.getY();
        msg="Mouse released at"+x+","+y;
        repaint();
    }
    @Override
    public void mouseEntered(MouseEvent e){
        msg="Mouse Entered";
        repaint();
    }
    @Override 
    public void mouseExited(MouseEntered e){
        msg="Mouse Entered";
        repaint();
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
