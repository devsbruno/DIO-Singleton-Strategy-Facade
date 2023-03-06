package one.digitalinnovation.boa;

public class BancoDeDados {
    private static BancoDeDados instanciaUnica;

    private BancoDeDados() {}

    public static BancoDeDados getInstanciaUnica() {
        if (instanciaUnica == null) {
            instanciaUnica = new BancoDeDados();
        }
        return instanciaUnica;
    }

    public void conectar() {
    }

    public void desconectar() {
    }

    // Métodos para conexão e manipulação do banco de dados
}