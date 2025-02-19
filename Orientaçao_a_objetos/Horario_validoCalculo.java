package Orientaçao_a_objetos;

public class Horario_validoCalculo {

    public double hora;

    public Horario_validoCalculo(double hora){

        this.hora = hora;
    }
    public double VerificaHora() {

        if (hora >= 0 && hora < 24) {
            return 1;
        } else {
            return 2;
        }
    }
}

