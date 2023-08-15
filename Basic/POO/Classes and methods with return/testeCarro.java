public class testeCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.marca = "Corolla";
        carro.modelo = "HSJ";
        carro.numPassageiros = 5;
        carro.capCombustivel = 100;
        carro.consumoCombustivel = 0.2;

        System.out.println(carro.marca);
        System.out.println(carro.modelo);

        double autonomia = carro.obterAutonomia();
        System.out.println("A autonomia do carro é "+carro.obterAutonomia());
    }
}
