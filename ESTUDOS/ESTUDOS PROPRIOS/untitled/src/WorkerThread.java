
//ESSA CLASSE JA REPRENSENTA A CRIAÇÃO DE UMA TRHEAD, OQUE EU PASSAR NO RUM,
//VAI SER OQUE O OBJETO DESSA CLASSE IRÁ FAZER NA SUA TREAD
//A INTERFACE RUNABLE, PELO QUE EU ENTENDI E A INTERFACE PAI DAS CLASSES DE CRIAÇAO DE TRHEAD
public class WorkerThread  implements Runnable{
    private  String command;


    public WorkerThread(String command) {
        this.command = command;
    }

//ESSE METODO INICIA E MATA UMA THREAD
    @Override
    public void run() {
        //esse metodo passado pela trhead, utiliza um tipo de marcação chamada intrissica.
        //Um metodo que o compilador/interpretador pode realocar dependendo do contexto de uso
        System.out.println(Thread.currentThread().getName()+"Start. Command = "+command);
        processCommand();
        System.out.println(Thread.currentThread().getName()+ "END");
    }

    private void processCommand() {
        try {
           Thread.sleep(5000);
        }catch (InterruptedException e ){
           e.printStackTrace();
        }
    }
}
