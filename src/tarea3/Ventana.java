package tarea3;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

class Ventana extends JFrame    {
  public Ventana(){
      this.setLayout(new BorderLayout());
      PanelPrincipal dp = new PanelPrincipal();
      add(dp,BorderLayout.CENTER); //se agrega al centro
      
      
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);//activar cierre en la X 
      this.setSize(1750,800); //se pueden pasar como parámetros del constructor
      this.setVisible(true);  //para que se abra y sea visible     
  }  
}