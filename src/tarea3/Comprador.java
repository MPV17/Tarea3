package tarea3;

//Comprador

import java.awt.Color;
import java.awt.Graphics;

class Comprador{
    private String queBebiste;
    private int cuantoVuelto;
    public Comprador(Moneda m ,int seleccion , Expendedor maquina){
        /*this.cuantoVuelto=0;
        try{
            Bebida mibebida = maquina.comprarBebida(m, seleccion);
            queBebiste =  mibebida.beber();
            while(maquina.getCuentaDeVuelto()!=0){
                cuantoVuelto = cuantoVuelto + (maquina.getVuelto()).getValor();
            }
            
            
        }catch(NoHayBebidaException | PagoIncorrectoException | PagoInsuficienteException e){
            System.out.println(e.getMessage());
        }*/
    }
    
    public String getQueBebiste(){
        return queBebiste;
    }
    public int getCuantoVuelto(){
        return cuantoVuelto;
    }
    public void paint (Graphics g){
        g.setColor(Color.orange); //o llamar a paint de objetos creados
        g.fillOval(45,500,150,150);
        g.fillOval(200,500,150,150);
        g.fillOval(355,500,150,150);
        g.setColor(Color.black);
        g.drawOval(45,500,150,150);
        g.drawOval(200,500,150,150);
        g.drawOval(355,500,150,150);
    }
}
//Comprador
