import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//https://www.digitalocean.com/community/tutorials/threadpoolexecutor-java-thread-pool-example-executorservice
// Site referencia pro codigo
//Referencias futuras https://www.devmedia.com.br/trabalhando-com-threads-em-java/28780
public class SimpleThreadPool {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }
}