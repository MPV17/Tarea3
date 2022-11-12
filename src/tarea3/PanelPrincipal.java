package tarea3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class PanelPrincipal extends JPanel implements MouseListener{
    
    private Comprador com;
    private Expendedor exp;
    private Moneda m1;
    private Moneda m2 = new Moneda100();
    private Moneda m3 = new Moneda500();
    private Moneda m4 = new Moneda1000();
    
    public PanelPrincipal(){
        m1 = new Moneda500();
        exp = new Expendedor(8,500);
        exp.addMoneda(m2);
        exp.addMoneda(m3);
        exp.addMoneda(m4);
        com = new Comprador(m1,2,exp);
        this.setBackground(Color.white);
        this.addMouseListener(this); //Hace posible el dar click
    }
    //Metodo que detecta el click en una zona delimitada, getX y getY ya vienen hechos
    public void mousePressed(MouseEvent me){
        if(me.getX() >= 0 && me.getX() <= 1000 && me.getY() >= 0 && me.getY() <= 1450){
            System.out.println("Has dado click");
        }
        this.repaint();
    }
    public void paint (Graphics g) { //todo se dibuja a partir de este método
        
        super.paint(g); //llama al método paint al que hace override en la super clase
        exp.paint(g); //llama al metodo paint definido en el expendedor
        com.paint(g); //llama al metodo paint definido en el comprador
    }
    //Esta parte el implements MouseListener obliga a implementarla

    @Override
    public void mouseClicked(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
      this.setSize(1750,800); //se pueden pasar como parámetros del constructor
      this.setVisible(true);  //para que se abra y sea visible     
    
  }  
}
class PanelBotones extends JPanel{
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