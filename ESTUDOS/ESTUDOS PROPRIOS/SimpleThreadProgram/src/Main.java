import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();

        //interface para uso de metodos assincronos
        ExecutorService executor = Executors.newFixedThreadPool(4);
        //a classe que eu fiz cria a tarefa para ser utilizado em trheads,
        //porem o executor faz com que as threads consigam executar elas
        for (int i = 0; i < 50 ; i++) {
            Runnable worker  = new SomaInThread(rd.nextInt(100), rd.nextInt(300));
            executor.execute(worker);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }
    }
