import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class PanelPrincipal extends JPanel{
    private Comprador com;
    private Expendedor exp;

    // Variables solo para testear, al final solo deben quedar comp y exp
    private Moneda m3;
    private CocaCola coca;
    // Variables solo para testear, al final solo deben quedar comp y exp

    public PanelPrincipal(){
        m3 = new Moneda1000();
        exp = new Expendedor(50,500);
        com = new Comprador(m3,1,exp);
        coca = new CocaCola(1);

        this.setBackground(Color.white);
    }
    public void paint (Graphics g) { //todo se dibuja a partir de este método

        super.paint(g); //llama al método paint al que hace override en la super clase

        com.paint(g); //llama al metodo paint definido en el comprador
        exp.paint(g); //llama al metodo paint definido en el expendedor
        m3.paint(g);
        coca.paint(g);
    }
}
class Ventana extends JFrame    {
    public Ventana(){
        this.setLayout(new BorderLayout());
        PanelPrincipal dp = new PanelPrincipal();
        add(dp,BorderLayout.CENTER); //se agrega al centro

        PanelBotones bp = new PanelBotones();
        this.add(bp,BorderLayout.EAST); //se agrega al sur

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//activar cierre en la X
        this.setSize(1000,800); //se pueden pasar como parámetros del constructor
        this.setVisible(true);  //para que se abra y sea visible

    }
}
class PanelBotones extends JPanel {
    BotonFin bf;
    BotonFin df;
    public PanelBotones(){
        bf=new BotonFin();
        df=new BotonFin();
        this.add(bf);
        this.add(df);
    }
    private class BotonFin extends JButton implements ActionListener {
        BotonFin(){
            super("Fin");
            this.addActionListener(this);
        }
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }
}