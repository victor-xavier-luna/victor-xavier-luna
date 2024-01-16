package src.mygame;
import javax.swing.JFrame;

import src.mygame.mygameModel.Fase;

public class Container extends JFrame{
    
    public Container() {
        add(new Fase());
        setTitle("Jogo Teste 01");
        setSize(1024, 576); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // onde a tela apareceria
        this.setResizable(false);
        setVisible(true);
    }
    
    public static void main (String []args) {
        new Container();
    }
}
