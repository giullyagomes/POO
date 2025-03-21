public class Pessoa {
    private String nome;
    private String data;

    public Pessoa(String nome, String data) {
        this.nome = nome;
        this.data = data;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getnome() {
        return nome;
    }

    public void setdata(String data) {
        this.data = data;
    }

    public String getdata() {
        return data;
    }



}