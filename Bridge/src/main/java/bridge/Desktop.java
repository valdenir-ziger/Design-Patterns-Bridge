package bridge;

/**
 *
 * @author Valdenir
 */
public class Desktop extends DipositivoAvancado {
    
    public Desktop(Pessoa pessoa) {
        super(pessoa);
    }
    
    @Override
    public void ImprimirStatus(){
        System.out.println("Desktop: " + (pessoa.isLogado() ? "Você Foi Conectado!" : "Você Foi Desconectado!"));
        pessoa.imprimir();
    }
}
