public class Lampada {
    String marca;
    String modelo;

    String cor;
    String corLuz;
    boolean ligada;

    void ligarLampada(){
        ligada = true;
    }

    void desligarLampada(){
        ligada = false;
    }

    void mostrarEstado(){
        if(ligada){
            System.out.println("A lampada está ligada");
        }else{
            System.out.println("A lampada está desligada");
        }
    }

    void mudarEstado(){
        if(ligada){
            desligarLampada();
        }else{
            ligarLampada();
        }
    }
}
