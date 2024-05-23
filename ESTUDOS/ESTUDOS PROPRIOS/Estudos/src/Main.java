import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random jrv = new Random();
        RaizNo reggaeroot = new RaizNo();
        int i = jrv.nextInt(200);

        for(;i> 0; i--){
            int a = jrv.nextInt(1000);
            reggaeroot.insertNo(a);
        }

        reggaeroot.inorder();

    }
}