import java.util.ArrayList;

public class Aluno {
    private String nome;
    private String CPF;
    private String dataNascimento;
    private String telefone;
    private String email;
    private Plano planoAluno;
    private boolean ativo = false;
    private ArrayList<Matricula> historicoMatriculas= new ArrayList<>();

    

    


    public String getNome() {
        return nome;
    }






    public void setNome(String nome) {
        this.nome = nome;
    }






    public String getCPF() {
        return CPF;
    }






    public void setCPF(String cPF) {
        CPF = cPF;
    }






    public String getDataNascimento() {
        return dataNascimento;
    }






    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }






    public String getTelefone() {
        return telefone;
    }






    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }






    public String getEmail() {
        return email;
    }






    public void setEmail(String email) {
        this.email = email;
    }






    public Plano getPlanoAluno() {
        return planoAluno;
    }






    public void setPlanoAluno(Plano planoAluno) {
        this.planoAluno = planoAluno;
    }






    public boolean isAtivo() {
        return ativo;
    }




    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }


    public ArrayList<Matricula> getHistoricoMatriculas() {
        return historicoMatriculas;
    }
    
    public void adicionarMatriculaAoHistorico(Matricula matricula) {
        historicoMatriculas.add(matricula);
    }


    public boolean verificarUsuarioAtivo() {
        return ativo = true;
    }

}
