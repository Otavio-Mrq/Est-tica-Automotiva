package Codigos;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Agendamento extends Servico{

    private String data;
    private String observacao;

    public Agendamento(String data, String observacao, float valor, String descricao, int id, String nome, String telefone, String cpf) {
        super(valor, descricao, id, nome, telefone, cpf);
        this.observacao = observacao;
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
public void agendamento(){
    
    JOptionPane.showMessageDialog(null, email);
}
   
}