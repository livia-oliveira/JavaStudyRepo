public class testeCarro {
    public static void main(String[] args) {
        Carro van = new Carro();

        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        double autonomia = van.obterAutonomia();
        System.out.println("A autonomia do carro é "+autonomia);

        double qtdCombustivel = van.calcularCombustivel(10);
        System.out.println("A quantidade de combustível necessária é "+qtdCombustivel);
    }
}
