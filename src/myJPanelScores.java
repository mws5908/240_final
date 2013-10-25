import java.awt.*;
import javax.swing.*;

public class myJPanelScores extends JPanel
{
	public JButton j1;
	
	
	
	public myJPanelScores()
	{
		super();
		setBackground(Color.blue);

		//setLayout(new GridLayout(3,1));
		 j1 = new JButton("This Panel will show the games high scores." );
		add(j1);
	}
	
	

}