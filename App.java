import javax.swing.*;
import java.awt.event.*;

public class App extends JFrame implements ActionListener{
    private JButton si, no;
    private JLabel declaracion;

    public App(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        si = new JButton("Sí");
        si.setBounds(50, 80, 100, 30);
        add(si);
        si.addActionListener(this);

        no = new JButton("No");
        no.setBounds(210, 80, 100, 30);
        add(no);
        no.addActionListener(this);

        declaracion = new JLabel("¿Quieres ser mi novia?");
        declaracion.setBounds(125, 5, 300, 40);
        add(declaracion);
    }

    public void actionPerformed(ActionEvent m){
        if(m.getSource() == si){
            JOptionPane.showMessageDialog(this,"Sabía que dirías que sí <3");
        }

        if(m.getSource() == no){
            int x = (int) (Math.random() * 300)+1;
            int y = (int) (Math.random() * 170)+1;
            no.setBounds(x, y, 100, 30);
        }
    }

    public static void main(String args[]) {
        App tab = new App();
        tab.setBounds(500, 200, 400, 300);
        tab.setVisible(true);
        tab.setResizable(false);
    }
}
