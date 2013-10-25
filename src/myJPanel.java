
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class myJPanel extends JPanel implements ActionListener {


    public myJTabbedPane myJTP;

    public myJPanel() {
        super();
        setBackground(Color.gray);
        myJTP = new myJTabbedPane();
        add(myJTP);





    }

    public void actionPerformed(ActionEvent event) {
        Object obj = event.getSource();

    }
}