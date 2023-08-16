public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;


    Carro(){
        System.out.println("Classe carro foi instânciada");
        numPassageiros = 4;
    }

    Carro(String marca_){
        marca = marca_;
    }

    void ExibirAutonomia(){
        System.out.println("A autonomia do carro é "+ capCombustivel * consumoCombustivel+"km");
    }

    double obterAutonomia(){
        System.out.println("O método obter autonomia foi chamado.");
        return capCombustivel * consumoCombustivel;
    }

    double calcularCombustivel(double km){
        double qtdCombustivel = km/consumoCombustivel;
        return qtdCombustivel;
    }
}
