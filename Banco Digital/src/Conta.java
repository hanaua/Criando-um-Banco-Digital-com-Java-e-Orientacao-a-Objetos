public class Conta {
    
    protected  static int AGENCIA_PADRAO = 321;
    protected  static int SEQUENCIAL = 0001;

    protected  int agencia;
    protected  int numero;
    private double saldo;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }
    public void depositar(double valor) {
        saldo += valor;
    }
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
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

    public void imprimirInfosComunso() {
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}