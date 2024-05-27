package es3;

public class ContoCorrente {
    final int maxMovimenti = 50;
    String titolare;
    int nMovimenti;
    double saldo;

    ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.nMovimenti = 0;
    }

    void preleva(double x) {
        if (nMovimenti < maxMovimenti) {
            saldo -= x;
            nMovimenti++;
        } else {
            saldo = saldo - x - 0.50;
        }
    }

    double restituisciSaldo() {
        return saldo;
    }
}
