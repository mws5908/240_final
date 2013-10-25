import java.awt.*;
import javax.swing.*;

public class myJPanelWelcome extends JPanel
{
	public JButton j1;
	
	
	
	public myJPanelWelcome()
	{
		super();
		setBackground(Color.blue);

		//setLayout(new GridLayout(3,1));
		 j1 = new JButton("Welcome Screen. This is the first screen the user will see." );
		add(j1);
	}
	
	

}