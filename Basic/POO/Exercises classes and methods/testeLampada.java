public class testeLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        lampada.modelo = "LuxoMax 2000";
        lampada.marca = "LumiTech";
        lampada.cor = "Prata Escovado";
        lampada.corLuz = "Branco Quente";
        lampada.ligada = false;

        lampada.ligarLampada();
        lampada.mostrarEstado();
        lampada.desligarLampada();
        lampada.mostrarEstado();
        lampada.mudarEstado();
        lampada.mostrarEstado();
    }
}
