package classes;

public class Contato {
    private int codigo;
    private String nome;
    private String telefone;
    private String email;

    public Contato() {
    }

    public Contato(int codigo, String nome, String telefone, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    

    @Override
    public String toString() {
        return "Contato [codigo=" + codigo + ", nome=" + nome + ", telefone=" + telefone + ", email=" + email + "]";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

}
