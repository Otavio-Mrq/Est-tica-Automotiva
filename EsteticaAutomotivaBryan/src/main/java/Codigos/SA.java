package Codigos;

public class SA {

    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente(01, "Tavinho", "Muito Macho","24/11/2005", "(47) 988241863", "16185776707", "otaviolourenco24@gmail.com", "Rua Amazonas 3495", 123456);
        Funcionario funcionario = new Funcionario(12, "Vitor", "Masculino","30/04/2001", "(47)912345678", "08123443202", "Vitaodabatata1@gmail.com", "Gerente", "Batatas!");
        Agendamento agenda = new Agendamento("10/10/2023", "Meu pau na sua mão", 3.000f, "Lavagem pubiana", 111, "Luizão", "40028922", "16185763729");
        
        cliente1.dados();
        funcionario.dados();
    }
    
}
