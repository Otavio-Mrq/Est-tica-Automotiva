package Controlador;

import Telas.CadastrarCliente;
import Telas.Principal;
public class ControladorCliente {
    
    private final CadastrarCliente ver;
    
    public ControladorCliente(CadastrarCliente ver) {
        this.ver=ver;
    }
    
    
    public void entrarCliente(){
        CadastrarCliente cliente = new CadastrarCliente();
        cliente.setVisible(true);
        this.ver.dispose();
    }
    
    public void entrarPrincipal(){
        Principal principal = new Principal();
        principal.setVisible(true);
        this.ver.dispose();
    }
}
