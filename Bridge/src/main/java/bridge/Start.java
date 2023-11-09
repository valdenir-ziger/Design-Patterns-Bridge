package bridge;

/**
 *
 * @author Valdenir
 */
public class Start {

    public static void main(String[] args) {
        Pessoa monitor = new Monitor("Deno"); 
        DipositivoAvancado dipositivoAvancadoMonitor = new Mobile(monitor);
        dipositivoAvancadoMonitor.conectar();
        dipositivoAvancadoMonitor.ImprimirStatus();

        Pessoa aluno = new Aluno("Mateus"); 
        DipositivoAvancado dipositivoAvancadoAluno = new Desktop(aluno);
        dipositivoAvancadoAluno.conectar();
        dipositivoAvancadoAluno.ImprimirStatus();
        
        dipositivoAvancadoMonitor.desconectar();
        dipositivoAvancadoMonitor.ImprimirStatus();
        
        dipositivoAvancadoAluno.desconectar();
        dipositivoAvancadoAluno.ImprimirStatus();
    }  
}
