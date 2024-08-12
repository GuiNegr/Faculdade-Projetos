public class SomaInThread implements Calc, Runnable {
    private int a;
    private int b;

    public SomaInThread(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int soma(int a, int b) {
        return  a + b;
    }




    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Start Comando de soma parametros A =" +this.a+" PARAMETROS B = "+this.b);

        System.out.println(soma(this.a,this.b));
        processCommand();
        System.out.println(Thread.currentThread().getName()+ " END");
    }

    private void processCommand() {
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e ){
            e.printStackTrace();
        }
    }
}
