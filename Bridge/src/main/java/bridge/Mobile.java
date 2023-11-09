package bridge;

/**
 *
 * @author Valdenir
 */
public class Mobile extends DipositivoAvancado {
    
    public Mobile(Pessoa pessoa) {
        super(pessoa);
    }
    
    @Override
    public void ImprimirStatus(){ 
        System.out.println("Mobile: " + (pessoa.isLogado() ? "Você Foi Conectado!" : "Você Foi Desconectado!"));
        pessoa.imprimir();
    }
}
