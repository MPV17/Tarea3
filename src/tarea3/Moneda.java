package tarea3;

//Monedas

import java.awt.Color;
import java.awt.Graphics;

class Moneda{
    public Moneda(){
        
    }
    public int getValor(){
        return 0;
    }
    public void paint (Graphics g,int x, int y){
        g.setColor(Color.yellow);
        
       
    }
}
class Moneda100 extends Moneda{
    public Moneda100(){
        
    }
    public int getValor(){
        return super.getValor() + 100;
    }
    public void paint (Graphics g,int x, int y){
        super.paint(g,x,y);
        g.setColor(Color.green);
        g.fillOval(x,y,75,75); //o llamar a paint de objetos creados
        g.setColor(Color.BLACK);
        g.drawOval(x,y,75,75);
    }
}
class Moneda500 extends Moneda{
    public Moneda500(){
        
    }
    public int getValor(){
        return super.getValor() + 500;
    }
    public void paint (Graphics g,int x, int y){
        super.paint(g,x,y);
        g.setColor(Color.red);
        g.fillOval(x,y,75,75); //o llamar a paint de objetos creados
        g.setColor(Color.BLACK);
        g.drawOval(x,y,75,75);
    }
}
class Moneda1000 extends Moneda{
    public Moneda1000(){
        
    }
    public int getValor(){
        return super.getValor() + 1000;
    }
    public void paint (Graphics g,int x, int y){
        super.paint(g,x,y);
        g.setColor(Color.blue);
        g.fillOval(x,y,75,75); //o llamar a paint de objetos creados
        g.setColor(Color.BLACK);
        g.drawOval(x,y,75,75);
       
    }
}
//Monedas