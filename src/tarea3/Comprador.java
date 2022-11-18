package tarea3;

//Comprador

import java.awt.Color;
import java.awt.Graphics;

class Comprador{
    private String queBebiste;
    private int cuantoVuelto;
    public Comprador(int seleccion , Expendedor maquina){
        this.cuantoVuelto=0;
        
    }

    public void setQueBebiste(String queBebiste) {
        this.queBebiste = queBebiste;
    }
    
    public String getQueBebiste(){
        return queBebiste;
    }
    public int getCuantoVuelto(){
        return cuantoVuelto;
    }
    public void paint (Graphics g){
        g.setColor(Color.orange); //o llamar a paint de objetos creados
        g.fillOval(1150,50,200,200);
        g.fillOval(1150,249,200,400);
        g.fillOval(1000,300,200,75);
        g.fillOval(1300,300,200,75);
        g.fillOval(1150,600,75,200);
        g.fillOval(1275,600,75,200);
    }
}
//Comprador
