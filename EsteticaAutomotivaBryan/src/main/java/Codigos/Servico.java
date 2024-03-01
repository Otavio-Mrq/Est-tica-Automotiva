package Codigos;

import javax.swing.JOptionPane;

public class Servico extends Cliente{

    protected float valor;
    protected String descricao;

    public Servico(float valor, String descricao, int id, String nome, String telefone, String cpf) {
        super(id, nome, telefone, cpf);
        this.valor = valor;
        this.descricao = descricao;
    }
    
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    

    @Override
    public void dados(){
        JOptionPane.showMessageDialog(null,"Ordem de serviço: \n"
                + "ID : "+id+""
                        + "\nValor : "+valor+"\n"
                                + "Descrição : "+descricao);
    }
    
}
