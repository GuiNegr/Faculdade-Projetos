public class Main {
    public static void main(String[] args) {
        //tentando entender o conceito de chave valor hash
        //aplicando uma tentativa de criação de valor para chave
        //nao tem TRATAMENTO DE COLISAO
        String b = "maikon!"; // teve uma colisao com esse
        String x = "maikolas";
        String d = "douglas";
        int a = 0;
        for(int i = 0; i < b.length();i++){
            a++;
        }
        String[] s = new String[13];
        a = a % s.length - 1;
        s[a] = b;

        for (int i = 0; i < s.length ; i++) {
            System.out.print(i + s[i] + " ");
        }

        a = 0;
        for(int i = 0; i < x.length();i++){
            a++;
        }
        a = a % s.length - 1;
        s[a] = x;

        a = 0;
        for(int i = 0; i < d.length();i++){
            a++;
        }
        a = a % s.length - 1;
        s[a] = d;
        System.out.println();
        for (int i = 0; i < s.length ; i++) {
            System.out.print(i + s[i] + " ");
        }

    }
}