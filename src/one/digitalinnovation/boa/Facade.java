package one.digitalinnovation.boa;

public class Facade {
    private BancoDeDados bancoDeDados = BancoDeDados.getInstanciaUnica();
    private Processador processador = new Processador();

    public void executarEstrategia1() {
        Estrategia estrategia = new Estrategia1();
        processador.processar(estrategia);
        bancoDeDados.conectar();
        // Manipulação do banco de dados
        bancoDeDados.desconectar();
    }

    public void executarEstrategia2() {
        Estrategia estrategia = new Estrategia2();
        processador.processar(estrategia);
        bancoDeDados.conectar();
        // Manipulação do banco de dados
        bancoDeDados.desconectar();
    }
}