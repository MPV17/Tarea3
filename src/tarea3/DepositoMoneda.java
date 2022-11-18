
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
    public void paint(Graphics g,int xdepo,int ydepo){
        g.setColor(Color.gray);
        g.fillRect(xdepo,ydepo,365,95);
        int x = xdepo+5;
        int y = ydepo+10;
        for(int i=0;i<var.size();i++){
            var.get(i).paint(g,x,y);
            x=x+15;
        }
        g.setColor(Color.white);
        g.drawRect(xdepo,ydepo,365,95);
    }
}

