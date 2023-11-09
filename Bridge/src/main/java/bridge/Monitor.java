package bridge;

/**
 *
 * @author Valdenir
 */
public class Monitor implements Pessoa {
    
    private String tipo = "Monitor";
    private String nome;
    private Integer idade = 30;
    private Boolean isLogado;

    public Monitor(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String getTipo() {
        return this.tipo;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public Integer getIdade() {
        return this.idade;
    }

    @Override
    public void setLogado(Boolean logado) {
        this.isLogado = logado;
    }

    @Override
    public Boolean isLogado() {
        return this.isLogado;
    }

    @Override
    public void imprimir() {
        System.out.println("------------------------------------");
        System.out.println("| Eu sou um " + this.tipo);
        System.out.println("| Eu estou " + (isLogado() ? "online" : "offline"));
        System.out.println("| Meu nome é " + getNome());
        System.out.println("| Eu tenho " +  getIdade() + " anos");
        System.out.println("------------------------------------\n");
    }
}
