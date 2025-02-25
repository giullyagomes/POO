public class App {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Ênio", 1.80);
        aluno1.pedirNota("Daniel");
        System.out.println(aluno1.nacionalidade);

        Aluno aluno2 = new Aluno("Túlio", 1.55, "Colombiano");
        System.out.println(aluno2.nacionalidade);

        Professor professor1 = new Professor("Iago", 35, "Brasileiro", "POO", 00000);
        System.out.println(professor1);
    }
}