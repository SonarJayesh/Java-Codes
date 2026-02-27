import java.awt.*;
class GUIDemo1{
	
	Frame frame;
	Panel panel;

	public GUIDemo1(){

		frame = new Frame();
		frame.setSize(400,400);
		frame.setLayout(50,50);
		frame.setTitle("GUI Demo");
		frame.setVisible(true);	
	}
	public static void main(String[] args){
	
		new GUIDemo1();
	}
}