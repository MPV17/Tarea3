
package tarea3;

import java.awt.Color;
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
        
        g.setColor(Color.gray);
        g.fillRect(615,540,365,95);
        int x = 620;
        int y = 550;
        for(int i=0;i<var.size();i++){
            var.get(i).paint(g,x,y);
            x=x+15;
        }
        g.setColor(Color.white);
        g.drawRect(615,540,365,95);
    }
}

