import java.util.ArrayList;

public class Matricula {
    Aluno aluno;
    Plano plano;
    String dataInicio;
    String dataPrevistoFim;
    ArrayList<Mensalidade> mensalidadesPagas;


    public boolean registrarMensalidade(String meioPagamento){
        Mensalidade mensalidade = new Mensalidade();
        mensalidade.dataPagamento = "26/02/2026";
        mensalidade.meioPagamento = meioPagamento;
        mensalidade.valor = plano.valor;

        aluno.ativo = true;

        return true;
    }

    public boolean alterarPlano(Plano novoPlano){
        plano = novoPlano;
        return true;
    }
    
}
