public class TesteHerança1{
    public static void main(String[] args){
        //Vejamos se alunos de graduação tem nome e idade
        //construtor que não recebe nada: construtor padrão
        AlunoDeGraduacao aluno = new AlunoDeGraduacao();
        aluno.nome = "joão";
        aluno.idade = 17;
        System.out.printf("nome: %s, idade: %d\n", aluno.nome, aluno.idade);
    }
}
