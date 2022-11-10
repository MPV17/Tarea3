package tarea3;

//Bebidas-Sabores

import java.awt.Color;
import java.awt.Graphics;

abstract class Bebida{
    private int serie;
    public Bebida(int serie){
        this.serie=serie;
    }
    public int getSerie(){
        return serie;
    }
    public String beber(){
        return "sabor: ";
    }
    public void paint (Graphics g){
        g.setColor(Color.gray);
        g.fillRect(200,100,50,100); //o llamar a paint de objetos creados
        
    }
}
class Sprite extends Bebida{
    public Sprite(int serie){
        super(serie);
    }
    public String beber(){
        return super.beber() + "sprite";
    }
    public void paint (Graphics g){
        g.setColor(Color.green);
        g.fillRect(75,75,125,250); //o llamar a paint de objetos creados
       
    }
}
class CocaCola extends Bebida{
    public CocaCola(int serie){
        super(serie);
    }
    public String beber(){
        return super.beber() + "cocacola";
    }
    public void paint (Graphics g){
        g.setColor(Color.red);
        g.fillRect(225,75,125,250); //o llamar a paint de objetos creados
       
    }
}
class Fanta extends Bebida{
    public Fanta(int serie){
        super(serie);
    }
    public String beber(){
        return super.beber() + "fanta";
    }
    public void paint (Graphics g){
        g.setColor(Color.orange);
        g.fillRect(375,75,125,250); //o llamar a paint de objetos creados
       
    }
}
//Bebidas-Sabores