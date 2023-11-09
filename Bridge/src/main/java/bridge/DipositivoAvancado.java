package bridge;

/**
 *
 * @author Valdenir
 */
public class DipositivoAvancado implements Dispositivo{

    protected Pessoa pessoa;

    public DipositivoAvancado(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    @Override
    public void conectar() {
        pessoa.setLogado(true);
    }

    @Override
    public void desconectar() {
        pessoa.setLogado(false);
    }

    @Override
    public void ImprimirStatus() {};
}
