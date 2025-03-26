package Heranca_Ingressos;

class VIP extends Ingresso {
    private double valor;
    private double adicionalVIP;

    public VIP(double valor, double adicionalVIP) {
        super(valor);
        this.adicionalVIP = adicionalVIP;
    }

    // Método para retornar o valor total (valor base + adicionalVIP)
    public double getValor() {
        return valor + adicionalVIP;
    }

    public double getAdicionalVIP() {
        return adicionalVIP;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setAdicionalVIP(double adicionalVIP) {
        this.adicionalVIP = adicionalVIP;

        }
    }
