import java.awt.*;
public class Demo extends Frame{
	Demo(){
		Button b = new Button("click me");
		b.setBounds(30,100,80,30);
		add(b);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		setTitle("Test");
		addWindowListener(new TestListener());
	}
	
	
}
