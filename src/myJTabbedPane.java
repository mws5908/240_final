
import javax.swing.JTabbedPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cjh
 */
public class myJTabbedPane extends JTabbedPane {

    myJPanelWelcome mjpWelcome;
    myJPanelHelp mjpHelp;
    myJPanelPlay mjpPlay;
    myJPanelScores mjpScores;

    public myJTabbedPane() {
        //setBackground(Color.pink);
        mjpWelcome = new myJPanelWelcome();
        mjpHelp = new myJPanelHelp();

        mjpPlay = new myJPanelPlay();
        mjpScores = new myJPanelScores();


        addTab("Welcome", mjpWelcome);
        addTab("Help", mjpHelp);
        addTab("Play", mjpPlay);
        addTab("High Scores", mjpScores);

    }
}