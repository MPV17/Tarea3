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
        g.fillOval(1350,100,200,200);
        g.setColor(Color.orange); //o llamar a paint de objetos creados
        g.fillOval(1350,299,200,400);
    }
}
//Comprador
