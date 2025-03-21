// extend para herdar a super classe
public class PessoaFisica extends Pessoa{
    private String CPF;
    private string RG;

    public PessoaFisica(String CPF, String RG, String nome, String data){
        // Primeiro se inicializa os atributos da super classe
        super(nome, data);
        this.CPF = CPF;
        this.RG = RG;
    }

    public void andar() {

    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getRG() {
        return RG;
    }


}