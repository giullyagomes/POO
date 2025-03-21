 public class PessoaJuridica extends Pessoa {
    private String CNPJ;
    private String nomeFantasia;

    public PessoaJuridica(String CNPJ, String nomeFantasia, String nome, String, data) {
        super(nome, data);
        this.CNPJ;
        this.nomeFantasia;
    }

    public void CNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setnomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getnomeFantasia() {
        return nomeFantasia;
    }

 }