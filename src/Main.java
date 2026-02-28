public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.titular = "Marcel";
        c1.agencia = "0001";
        c1.nroConta = "123";
        c1.banco = "Brasil";


        c1.depositar(200);
        if(c1.sacar(1000)){
            System.out.println("Deu certo");
        }else{
            System.out.println("Deu errado");
        }

        c1.saldo -= 1000;
        System.out.println(c1.saldo);
    }
}
