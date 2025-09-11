public class Main {
    
    public static void main(String[] args) throws Exception {
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca poupanca = new ContaPoupanca();

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    

        
    }
}
