public class Carro {
        String marca;
        String modelo;
        int numPassageiros;
        double capCombustivel;
        double consumoCombustivel;


        void ExibirAutonomia(){
            System.out.println("A autonomia do carro é "+ capCombustivel * consumoCombustivel+"km");
        }
}
