package Controlador;

import Telas.Principal;
import Telas.VisuAgendamentos;

public class ControladorVisualizador {
    
    private final VisuAgendamentos view;
    
    public ControladorVisualizador(VisuAgendamentos view){
        this.view=view;
    } 
    
    public void entrarPrincipal(){
        Principal principal = new Principal();
        principal.setVisible(true);
        this.view.dispose();
    }
    
    public void preencherTabela(){
        
    }
}
