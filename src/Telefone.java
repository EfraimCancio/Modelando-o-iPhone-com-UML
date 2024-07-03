public class Telefone implements IPhone {
    public void ligar(String numero) {
        System.out.println("Ligando para o numero");
    }

    public void atender() {
        System.out.println("Atendendo telefone!");
    }

    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz!");
    }
}
