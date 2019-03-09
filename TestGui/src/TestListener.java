import java.awt.*;
import java.awt.event.*;


public class TestListener extends WindowAdapter{
	public void windowClosing(WindowEvent e){
		e.getWindow().dispose();
		System.exit(0);
	}
}
