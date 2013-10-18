
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class myJPanel1 extends JPanel 
{
    public JButton jl1;
    public student st1;

    public myJPanel1() {
        super();
        setBackground(Color.yellow);

        st1 = new student("Fred", "Fonseca", 44);
        // the whatsUp of this student has to shown in the other panel
        add(st1);
        
        jl1 = new JButton(st1.getInfo());
        add(jl1);

    }


}