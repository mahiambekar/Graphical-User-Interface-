/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.awt.*;
class MyFrame extends Frame{
    public MyFrame(){
        super("This is title");
    }
    @Override 
    public void paint(Graphics g){
        g.drawString("Hello World",100,100);
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
