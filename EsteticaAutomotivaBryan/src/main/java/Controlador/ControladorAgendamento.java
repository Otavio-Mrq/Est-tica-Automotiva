package Controlador;

import ArquivoDAO.ClasseAgendamentoDAO;
import Codigos.Agendamento;
import Telas.AgendarHora;
import Telas.Principal;
import java.awt.TextField;
import javax.swing.JTextField;

public class ControladorAgendamento {
    
    private final AgendarHora view;
    
    public ControladorAgendamento(AgendarHora view){
        this.view = view;
    }
    
    public void atualizarTabela(){
        ClasseAgendamentoDAO agendamentoDAO = new ClasseAgendamentoDAO();
        
    }
    public void entraNoAgendamento(){
        AgendarHora agendar = new AgendarHora();
        agendar.setVisible(true);
        this.view.dispose();
        
    }
    public void entraPrincipal(){
        
        Principal principal = new Principal();
        principal.setVisible(true);
        this.view.dispose();
    }
    
    public void colocarPreço(){
        String servico = view.getAgendarServico().getSelectedItem().toString();
        JTextField teste = (JTextField) view.getAgendarServico().getSelectedItem();
        JTextField valor = null;
        
        if(servico.equals("LIMPEZA INTERNA")){
            view.setAgendarValor(teste);
        }
        if(servico.equals("LIMPEZA EXTERNA")){
            view.setAgendarValor(teste);
            valor = teste;
        }
        switch (servico) {
            case "LIMPEZA INTERNA" -> view.setAgendarValor(teste);
            case "LIMPEZA EXTERNA" -> view.setAgendarValor(new JTextField("125"));
            case "LIMPEZA GERAL" -> view.setAgendarValor(new JTextField("125"));
            case "HIGIENIZAÇÃO DO AR CONDICIONADO" -> view.setAgendarValor(new JTextField("125"));
            case "LIMPEZA TÉCNICA DE MOTOR" -> view.setAgendarValor(new JTextField("125"));
            default -> view.setAgendarValor(new JTextField("R$0,00"));
        }
       
        
    }
    
    public void colocarNome(){
        JTextField nome = view.getAgendarValor();
        view.setAgendarNome(nome);
    }
}
