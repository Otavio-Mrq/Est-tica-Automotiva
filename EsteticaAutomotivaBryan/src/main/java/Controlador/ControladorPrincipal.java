package Controlador;

import Telas.AgendarHora;
import Telas.CadastrarCliente;
import Telas.CadastrarFuncionario;
import Telas.CadastrarServico;
import Telas.TelaLogin;
import Telas.Principal;
import Telas.VisuAgendamentos;

public class ControladorPrincipal {

    public ControladorPrincipal(Principal view) {
        this.view = view;
    }

    private final Principal view;


    
        public void entrarAgendamento(){
            
            AgendarHora agendar = new AgendarHora();
            agendar.setVisible(true);
            this.view.dispose();
            
        }
        
            
    public void entrarServico(){
        CadastrarServico servico = new CadastrarServico();
        servico.setVisible(true);
        this.view.dispose();
                
            
    }
        
        public void entrarPrincipal(){
            Principal principal = new Principal();
            principal.setVisible(true);
            this.view.dispose();
        }
        
        public void entrarCliente(){
            CadastrarCliente cliente = new CadastrarCliente();
            cliente.setVisible(true);
            this.view.dispose();
        }
        
        public void entrarFuncionario(){
            CadastrarFuncionario funcionario = new CadastrarFuncionario();
            funcionario.setVisible(true);
            this.view.dispose();
        }
        
        public void entrarLogin(){
            TelaLogin login = new TelaLogin();
            login.setVisible(true);
            this.view.dispose();
        }
        public void entrarVisualizador(){
            VisuAgendamentos visualizador = new VisuAgendamentos();
            visualizador.setVisible(true);
            this.view.dispose();
        }
}
