public class Conta {
    
    protected static int AGENCIA_PADRAO = 001;

    protected  int agencia;
    protected  int numero;
    private double saldo;


    public void sacar() {
        // lógica de saque
    }
    public void depositar() {
        // lógica de depósito
    }
    public void transferir() {
        // lógica de transferência
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

}