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
    public void paint (Graphics g){
        g.setColor(Color.yellow);
        
       
    }
}
class Moneda100 extends Moneda{
    public Moneda100(){
        
    }
    public int getValor(){
        return super.getValor() + 100;
    }
    public void paint (Graphics g){
        super.paint(g);
        g.setColor(Color.green);
        g.fillOval(575,550,75,75); //o llamar a paint de objetos creados
       
    }
}
class Moneda500 extends Moneda{
    public Moneda500(){
        
    }
    public int getValor(){
        return super.getValor() + 500;
    }
    public void paint (Graphics g){
        super.paint(g);
        g.setColor(Color.red);
        g.fillOval(675,550,75,75); //o llamar a paint de objetos creados
       
    }
}
class Moneda1000 extends Moneda{
    public Moneda1000(){
        
    }
    public int getValor(){
        return super.getValor() + 1000;
    }
    public void paint (Graphics g){
        super.paint(g);
        g.setColor(Color.blue);
        g.fillOval(775,550,75,75); //o llamar a paint de objetos creados
       
    }
}
//Monedas