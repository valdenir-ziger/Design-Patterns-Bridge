package bridge;

/**
 *
 * @author Valdenir
 */
public interface Pessoa {
    
    String getTipo();
    
    void setNome(String nome);
    
    void setLogado(Boolean logado);
    
    Boolean isLogado();
    
    void imprimir();
}
