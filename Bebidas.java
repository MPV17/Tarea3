package tarea3;

//Bebidas-Sabores

import java.awt.Color;
import java.awt.Font;
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
    public void paint (Graphics g,int x,int y){
        g.setColor(Color.gray);
        g.fillRect(x,y,125,250); //o llamar a paint de objetos creados


    }
}
class Sprite extends Bebida{
    public Sprite(int serie){
        super(serie);
    }
    public String beber(){
        return super.beber() + "sprite";
    }
    public void paint (Graphics g,int x,int y){
        g.setColor(Color.green);
        g.fillRect(x,y,125,250); //o llamar a paint de objetos creados
        g.setColor(Color.BLACK);
        g.drawRect(x, y, 125, 250);
        g.setColor(Color.white);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 25));
        g.drawString("Sprite", x+30, y+80);

    }
}
class CocaCola extends Bebida{
    public CocaCola(int serie){
        super(serie);
    }
    public String beber(){
        return super.beber() + "cocacola";
    }
    public void paint (Graphics g,int x,int y){
        g.setColor(Color.red);
        g.fillRect(x,y,125,250); //o llamar a paint de objetos creados
        g.setColor(Color.BLACK);
        g.drawRect(x, y, 125, 250);
        g.setColor(Color.white);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 25));
        g.drawString("CocaCola", x+5, y+80);
    }
}
class Fanta extends Bebida{
    public Fanta(int serie){
        super(serie);
    }
    public String beber(){
        return super.beber() + "fanta";
    }
    public void paint (Graphics g,int x,int y){
        g.setColor(Color.orange);
        g.fillRect(x,y,125,250); //o llamar a paint de objetos creados
        g.setColor(Color.BLACK);
        g.drawRect(x, y, 125, 250);
        g.setColor(Color.white);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 25));
        g.drawString("Fanta", x+30, y+80);
    }
}
//Bebidas-Sabores
