import java.awt.*;
import javax.swing.*;

public class myJPanelPlay extends JPanel
{
	public JButton j1;
	
	
	
	public myJPanelPlay()
	{
		super();
		setBackground(Color.blue);

		//setLayout(new GridLayout(3,1));
		 j1 = new JButton("The actual game play will take place from this panel." );
		add(j1);
	}
	
	

}