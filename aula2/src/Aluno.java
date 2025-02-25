public class Aluno {
    public String nome;
    public double altura;
    public String nacionalidade;

    public Aluno (String nome, double altura) {
        this.nome = nome;
        this.altura = altura;
        this.nacionalidade = "Brasileira";
    }
    
    public void estudar(String materia) {
        System.out.println(nome + "está estudando " + materia);
    }
    public void pedirNota(String nomeProfessor) {
        System.out.println(nome + "está pedindo nota ao professor " + nomeProfessor);
    }

    public Aluno (String nome, double altura, String nacionalidade) {
        this.nome = nome;
        this.altura = altura;
        this.nacionalidade = nacionalidade;
    }
}
