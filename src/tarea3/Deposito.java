package tarea3;
import java.awt.Graphics;
import java.util.ArrayList;
//"Almacen"

class Deposito{
    private ArrayList<Bebida> almacen;
    public Deposito(){
        almacen = new ArrayList<Bebida>();
    }
    public void addBebida(Bebida b1){
        almacen.add(b1);
        
    }
    public Bebida getBebida(){
        if (almacen.size()!=0) {
            Bebida b2 = almacen.remove(almacen.size()-1);
            return b2;
        }else return null;
    }
    public Bebida get(int n){
        return almacen.get(n);
    }
    public int getStock(){
        return almacen.size();
    }
    public void paint(Graphics g){
        int x = 80;
        int y = 95;
        for(int i=0;i<almacen.size();i++){
            switch(almacen.get(0).getSerie()){
            case 100: 
                x=80;
                break;
            case 200:
                x=230;
                break;
            case 300:
                x=380;
                break;
        }
        almacen.get(i).paint(g, x, y);
        y=y-5;
        }
    }
}
//"Almacen"
