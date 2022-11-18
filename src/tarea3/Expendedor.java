package tarea3;

//Expendedor

import java.awt.Color;
import java.awt.Graphics;




public class Expendedor{
    private Deposito coca;
    private Deposito sprite;
    private Deposito fanta;
    private DepositoMoneda depoMoneda;
    private DepositoMoneda depoMonedaVuelto;
    private int vuelto;
    private int precios;
    private Bebida bebidaComprada;
    public Expendedor(int cantidad ,int precios){
        this.precios = precios;
        depoMoneda = new DepositoMoneda();
        depoMonedaVuelto = new DepositoMoneda();
        coca = new Deposito();
        sprite = new Deposito();
        fanta = new Deposito();
        bebidaComprada = null;
        for (int i = 0; i < cantidad; i++) {
            Bebida b1= new CocaCola(i+100);
            coca.addBebida(b1);
            
        }
        for (int k = 0; k < cantidad; k++) {
            Bebida b1= new Sprite(k+200);
            sprite.addBebida(b1);
            
        }
        for (int j = 0; j < cantidad; j++) {
            Bebida b1= new Fanta(j+300);
            fanta.addBebida(b1);
            
        }
    }
    public void llenarDepositoCoca(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            if(coca.getStock()>cantidad-1){
                break;
            }
            Bebida b1= new CocaCola(i+100);
            coca.addBebida(b1);
        }
    }
    public void llenarDepositoSprite(int cantidad){
        for (int k = 0; k < cantidad; k++) {
            if(sprite.getStock()>cantidad-1){
                break;
            }
            Bebida b1= new Sprite(k+200);
            sprite.addBebida(b1);
        }
    }
    public void llenarDepositoFanta(int cantidad){
        for (int j = 0; j < cantidad; j++) {
            if(fanta.getStock()>cantidad-1){
                break;
            }
            Bebida b1= new Fanta(j+300);
            fanta.addBebida(b1);
        }
    }
    public Bebida comprarBebida(int seleccion) throws PagoIncorrectoException, PagoInsuficienteException, NoHayBebidaException {
        Moneda m = new Moneda1000();
        if (m == null) {
            throw new PagoIncorrectoException("Pago no valido");
            
        }else if (m.getValor() < precios){
            throw new PagoInsuficienteException("Pago insuficiente");
        }else if((coca.getStock()== 0 && seleccion == 1 )|| (sprite.getStock()== 0 && seleccion == 2 ) || (fanta.getStock()== 0 && seleccion == 3 )){
            throw new NoHayBebidaException("No hay de este sabor");
            
        }
            if (m.getValor() == precios) {
                depoMoneda.addMoneda(m);
                switch (seleccion){
                   case 1: return coca.getBebida();
                   case 2: return sprite.getBebida();
                   case 3: return fanta.getBebida();
                }
            }else if(m.getValor() > precios){
                vuelto = m.getValor() - precios;
                for(int i=0;i<vuelto/100;i++){
                    Moneda n = new Moneda100();
                    depoMonedaVuelto.addMoneda(n);
                }
                depoMoneda.addMoneda(m);
                switch (seleccion){
                     case 1: return coca.getBebida();
                     case 2: return sprite.getBebida();
                     case 3: return fanta.getBebida();
                }
            }
        return null;
    }
    
    public Moneda getVuelto(){
        if (vuelto!=0) {
            vuelto = vuelto - 100;
            return depoMonedaVuelto.getMoneda();
        }else return null;
    }
    public int getCuentaDeVuelto(){
        return vuelto;
    }
    public int getStock(int seleccion){
        switch(seleccion){
            case 1: return coca.getStock();
            case 2: return sprite.getStock();
            case 3: return fanta.getStock();
        }
        return 0;
    }
    
    public void addMoneda(Moneda m){
        depoMoneda.addMoneda(m);
    }
    public void pasarUnicaCoca(){
        bebidaComprada = coca.getBebida();
    }
    public void pasarUnicaSprite(){
        bebidaComprada = sprite.getBebida();
    }
    public void pasarUnicaFanta(){
        bebidaComprada = fanta.getBebida();
    }

    public Bebida getBebidaComprada() {
        return bebidaComprada;
    }
    
    
    
    
    
    
    public void paint (Graphics g){
        g.setColor(Color.gray);
        g.fillRect(0,400,600,360); //o llamar a paint de objetos creados
        g.setColor(Color.black);
        g.fillRect(50, 500, 500, 150);
        g.fillRect(600, 0, 400, 800);
        g.drawRect(0,0,600,400);
        g.drawRect(0,400,600,360);
        g.setColor(Color.red);
        g.fillRect(625,100,100,100);
        g.setColor(Color.green);
        g.fillRect(750,100,100,100);
        g.setColor(Color.orange);
        g.fillRect(875,100,100,100);
        g.setColor(Color.white);
        g.drawString("CocaCola",645,150);
        g.drawString("Sprite",785,150);
        g.drawString("Fanta",905,150);
        coca.paint(g);
        sprite.paint(g);
        fanta.paint(g);
        depoMoneda.paint(g,615,540);
        depoMonedaVuelto.paint(g,615,440);
    }
}
    
//Expendedor