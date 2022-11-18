package tarea3;

//Monedas

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;

class Moneda{
    protected int numserie;
    public Moneda(){
        Random rd = new Random();
        numserie = rd.nextInt(500); //Crea un numero random en (0,500) para usar como numero de serie
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
        g.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        g.drawString(Integer.toString (numserie), x+25, y+40);
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
        g.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        g.drawString(Integer.toString (numserie), x+25, y+40);
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
        g.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        g.drawString(Integer.toString (numserie), x+25, y+40);
        //g.fillRect(x, y, y, y);
       
    }
}
//Monedas