package Controlador;

import Telas.CadastrarServico;
import Telas.Principal;

public class ControladorServico {

    private final CadastrarServico view;
    
    public ControladorServico(CadastrarServico view){
        this.view = view;
    }
    
    public void EntrarPrincipal(){
        Principal principal = new Principal();
        principal.setVisible(true);
        this.view.dispose();
    }
}
