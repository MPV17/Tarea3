package tarea3;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;


public class PanelPrincipal extends JPanel implements MouseListener{
    boolean a;
    boolean b;
    boolean c;
    boolean d;
    boolean e;

    private Comprador com;
    private Expendedor exp;
    private Moneda m1;

    
    public PanelPrincipal(){
        exp = new Expendedor(8,500);
        com = new Comprador(2,exp);
        this.setBackground(Color.white);
        this.addMouseListener(this); //Hace posible el dar click
    }
    //Metodo que detecta el click en una zona delimitada, getX y getY ya vienen hechos
    public void mousePressed(MouseEvent me){
        if(me.getX() >= 625 && me.getX() <= 725 && me.getY() >= 100 && me.getY() <= 200){ //boton cocacola
            try {
                if (a==false && b==false && c==false) {
                    com.setQueBebiste(exp.comprarBebida(1).beber());
                    a = true;
                }
                

            }
            catch (PagoIncorrectoException | PagoInsuficienteException | NoHayBebidaException ex) {
                Logger.getLogger(PanelPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                a = false;
            }
        }
        if(me.getX() >= 750 && me.getX() <= 850 && me.getY() >= 100 && me.getY() <= 200){//boton sprite
            try {
                if(a==false && b==false && c==false){
                    com.setQueBebiste((exp.comprarBebida(2)).beber());
                    b = true;
                }
                

            } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayBebidaException ex) {
                Logger.getLogger(PanelPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                b = false;
            } 
        }
        if(me.getX() >= 875 && me.getX() <= 975 && me.getY() >= 100 && me.getY() <= 200){ // boton fanta
            try {
                if (a==false && b==false && c==false) {
                    com.setQueBebiste((exp.comprarBebida(3)).beber());
                    c = true;
                }
            
  
            } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayBebidaException ex) {
            Logger.getLogger(PanelPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            c = false;
            }
        }
        
        if(me.getX() >= 80 && me.getX() <= 205 && me.getY() >= 55 && me.getY() <= 345){
            exp.llenarDepositoCoca(8);
        }
        if(me.getX() >= 230 && me.getX() <= 355 && me.getY() >= 55 && me.getY() <= 345){
            exp.llenarDepositoSprite(8);
        }
        if(me.getX() >= 380 && me.getX() <= 505 && me.getY() >= 55 && me.getY() <= 345){
            exp.llenarDepositoFanta(8);
        }
        
        if (me.getX()>= 100 && me.getX() <= 500 && me.getY() >= 525 && me.getY()<= 650){
            a = false;
            b = false;
            c = false;
            d = true;
        }
        if (me.getX()>= 615 && me.getX() <= 980 && me.getY() >= 440 && me.getY()<= 535){
            exp.getVuelto();
        }
        
        
        
        
        if(me.getX() >= 1150 && me.getX() <= 1350 && me.getY() >= 50 && me.getY() <= 650){ //Beber dando click al comprador
            if (d==true) {
                e=true;
            }
            d=false;
            
        }
        this.repaint();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void paint (Graphics g) { //todo se dibuja a partir de este método
        
        super.paint(g); //llama al método paint al que hace override en la super clase
        exp.paint(g); //llama al metodo paint definido en el expendedor
        com.paint(g); //llama al metodo paint definido en el comprador
        if (a == true){
            g.setColor(Color.red);
            g.fillRect(100, 525, 400, 125);
            g.setColor(Color.white);
            g.drawString("CocaCola", 250, 600);
        }//Se dibuja una CocaCola en la ranura de recogida, cuando a == false, se retira la CocaCola
       
        if (b == true){
            g.setColor(Color.green);
            g.fillRect(100, 525, 400, 125);
            g.setColor(Color.white);
            g.drawString("Sprite", 250, 600);
        }//Se dibuja una Sprite en la ranura de recogida, cuando b == false, se retira la Sprite
        
        if (c == true){
            g.setColor(Color.orange);
            g.fillRect(100, 525, 400, 125);
            g.setColor(Color.white);
            g.drawString("Fanta", 250, 600);
        }//Se dibuja una Fanta en la ranura de recogida, cuando c == false, se retira la Fanta  
        if (e==true) {
            g.setColor(Color.black);
            g.drawString(com.getQueBebiste(), 1000, 40);
            e=false;
        }
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
