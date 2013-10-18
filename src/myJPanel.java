
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class myJPanel extends JPanel implements ActionListener {

    public myJPanel1 p1;
    public myJPanel2 p2;

    public myJPanel() {
        super();
        setBackground(Color.gray);

        setLayout(new BorderLayout());

        p1 = new myJPanel1();
        add(p1, "North");
        p1.jl1.addActionListener(this);



        p2 = new myJPanel2();
        add(p2, "Center");




    }

    public void actionPerformed(ActionEvent event) {
        Object obj = event.getSource();
        if (obj == p1.jl1) {
            p2.j1.setText(p1.st1.whatsUp());
        }
    }
}