public class Carro {
    public String marca;
    String modelo;
    private int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro(String marca, String modelo) {
        this(marca, modelo, 10);
        System.out.println("Chamando o construtor com 2 parâmetros");
    }

    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando o construtor com 3 parâmetros");
    }

    public Carro() {

    }
    public void ExibirAutonomia(){
        System.out.println("A autonomia do carro é "+ this.capCombustivel * this.consumoCombustivel+"km");
    }

    public double obterAutonomia(){
        System.out.println("O método obter autonomia foi chamado.");
        return this.capCombustivel * this.consumoCombustivel;
    }

    private double divideKMporConsumoCombustivel(double km){
        return km/this.consumoCombustivel;
    }
    public double calcularCombustivel(double km){
        return this.divideKMporConsumoCombustivel(km);
    }
}