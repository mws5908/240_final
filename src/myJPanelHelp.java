import java.awt.*;
import javax.swing.*;

public class myJPanelHelp extends JPanel
{
	public JButton j1;
	
	
	
	public myJPanelHelp()
	{
		super();
		setBackground(Color.blue);
		//setLayout(new GridLayout(3,1));
		 j1 = new JButton("Help Screen. This will contain Help information to play the game." );
		add(j1);
	}
	
	

}