public class Conta {
    String titular;
    String agencia;
    String banco;
    String nroConta;
    double saldo = 0;

    public boolean sacar(double valor){
        if(valor > 0 && valor <= saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean depositar(double valor){
        if(valor > 0){
            saldo += valor;
            return true;
        }
        return false;
    }

    public boolean transferir(double valor, Conta destino){
        if(sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;

    }
}
