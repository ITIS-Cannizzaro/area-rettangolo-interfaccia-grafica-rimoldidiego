import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
	
    JTextArea base=new JTextArea();
    
    JTextArea altezza= new JTextArea();
    
    JButton calcola=new JButton("Calcola");
    
    JButton cancella=new JButton("Cancella");
    
    JLabel bas=new JLabel("Lunghezza base: ");
    
    JLabel alt=new JLabel("Lunghezza altezza: ");
    
    JTextArea risultato= new JTextArea();
    
    JLabel ris=new JLabel("L'area misura: ");
    
    public MyFrame(){
        super("Calcolo Area Rettangolo");
        Container c = this.getContentPane();
        c.setLayout(new FlowLayout());

        c.add(bas);
        c.add(base);
        c.add(alt);
        c.add(altezza);

        base.setPreferredSize(new Dimension(265, 18));
        altezza.setPreferredSize(new Dimension(250, 18));

        c.add(ris);
        c.add(risultato);

        risultato.setPreferredSize(new Dimension(280, 18));

        c.add(calcola);
        calcola.addActionListener(e -> calc());

        c.add(cancella);
        cancella.addActionListener(e -> canc());

        setSize(400, 200);
        setVisible(true);
        setResizable(false);
    }

    public void calc(){
        double Base, Altezza, Area;
        Base=Double.parseDouble(base.getText());
        Altezza=Double.parseDouble(altezza.getText());
        Area=Base*Altezza;
        risultato.setText(Double.toString(Area));
    }

    public void canc(){
        base.setText("");
        altezza.setText("");
        risultato.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==calcola){
            calc();
        }
        if(e.getSource()==cancella){
            canc();
        }
    }
}
