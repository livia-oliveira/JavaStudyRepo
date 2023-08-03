public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;


    void ExibirAutonomia(){
        System.out.println("A autonomia do carro é "+ capCombustivel * consumoCombustivel+"km");
    }

    double obterAutonomia(){
        System.out.println("O método obter autonomia foi chamado.");
        return capCombustivel * consumoCombustivel;
    }
}
