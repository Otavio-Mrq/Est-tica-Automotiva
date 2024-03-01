package Controlador;

import Telas.CadastrarFuncionario;
import Telas.CadastrarServico;
import Telas.Principal;

public class ControladorFuncionario {

    private final CadastrarFuncionario view;
    
    
    public ControladorFuncionario(CadastrarFuncionario view) {
        this.view = view;
    
    }

    public void entrarFuncionario(){
        CadastrarFuncionario funcionario = new CadastrarFuncionario();
        funcionario.setVisible(true);
        this.view.dispose();
    }
    
    public void entrarPrincipal(){
        Principal principal = new Principal();
        principal.setVisible(true);
        this.view.dispose();
    }
    
}
