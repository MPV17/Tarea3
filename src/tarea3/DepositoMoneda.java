
package tarea3;

import java.awt.Graphics;
import java.util.ArrayList;

public class DepositoMoneda{
    private final ArrayList<Moneda> var;
    public DepositoMoneda(){
        var = new ArrayList();
    }
    public void addMoneda(Moneda b){
        var.add(b);
    }
    public Moneda getMoneda(){
        if(var.size()<1){
            return null;
        }else{ 
            return var.remove(0);
        }
    }
    public int size(){
        return var.size();
    }
    public void paint(Graphics g){
        for(int i = 0 ; i<var.size(); i++){
            var.get(i).paint(g);
        }
    }
}
