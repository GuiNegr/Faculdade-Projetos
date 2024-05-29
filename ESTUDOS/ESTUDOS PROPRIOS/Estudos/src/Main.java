import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random jrv = new Random();
        RaizNo reggaeroot = new RaizNo();
        int i = jrv.nextInt(200);

        reggaeroot.insertNo(10);
        reggaeroot.insertNo(5);
        reggaeroot.insertNo(15);
        reggaeroot.insertNo(3);
        reggaeroot.insertNo(7);
        reggaeroot.insertNo(20);

        reggaeroot.preoderTraversal();

    }
}