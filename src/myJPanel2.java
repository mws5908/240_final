import java.awt.*;
import javax.swing.*;

public class myJPanel2 extends JPanel
{
	public JButton j1;
	
	
	
	public myJPanel2()
	{
		super();
		setBackground(Color.pink);
		//setLayout(new GridLayout(3,1));
		 j1 = new JButton("When the user clicks on the button in the UPPER panel" );
		add(j1);
	}
	
	
	
}