import java.util.ArrayList;


public class Matricula {
    private Aluno aluno;
    private Plano planoEscolhido;
    private String dataMatricula;
    private String dataTermino;
    private String status;


    private ArrayList<Mensalidade> listaMensalidades = new ArrayList<>();

    
    
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public ArrayList<Mensalidade> getListaMensalidades() {
        return listaMensalidades;
    }

    public void setListaMensalidades(ArrayList<Mensalidade> listaMensalidades) {
        this.listaMensalidades = listaMensalidades;
    }


    public Plano getPlanoEscolhido() {
        return planoEscolhido;
    }

    public void setPlanoEscolhido(Plano planoEscolhido) {
        this.planoEscolhido = planoEscolhido;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }




    

    public void registrarMatricula(String dataInicio, String meioPagamento) {
        this.dataMatricula = dataInicio;
        this.dataTermino = "calculada com base no plano";
        status = "Ativa";

        Mensalidade mensalidade = new Mensalidade();
        mensalidade.setDataPagamento(dataInicio);
        mensalidade.setMeioPagamento(meioPagamento);
        mensalidade.setValorMensalidade(planoEscolhido.getValorPlano());

        listaMensalidades.add(mensalidade);
        aluno.adicionarMatriculaAoHistorico(this);
    }

    public void cancelarMatricula() {
        status = "Cancelada";
    }
    
    public void renovarMatricula(String novaDataTermino) {
        if (status.equals("Ativa")) {
            dataTermino = novaDataTermino;
        }
    }

    public void verificarMatricula() {
        status = "vencida";
    }

    public boolean alterarPlano(Plano novoPlano) {
        planoEscolhido = novoPlano;
        return true;
    }

}
