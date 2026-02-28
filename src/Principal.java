public class Principal {
    public static void main(String[] args) {
        Plano planoMensal = new Plano();
        planoMensal.nome = "Mensal";
        planoMensal.meses = 1;
        planoMensal.descricao = "Aluno vai embora depois de 15 dias";
        planoMensal.valor = 100.00;

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Fulano de tal";
        aluno1.cpf = "111.111.111-11";
        aluno1.telefone = "(64) 4444-4444";
        aluno1.dataNascimento = "10/10/10";
        aluno1.email = "email@email.com";

        Matricula matricula1 = new Matricula();
        matricula1.aluno = aluno1;
        matricula1.plano = planoMensal;
        matricula1.dataInicio = "25/02/2026";
        matricula1.dataPrevistoFim = "25/03/2026";

        matricula1.registrarMensalidade("Pix");

    }
}
