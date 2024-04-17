public class TetePoliformismo {
    public static void main(String[] args) {
        String cachorro = "cachorro";
        Bicho b;
        if(args[0].equals("cachorro")){
            b = new Cachorro();
        }
        else {
            b = new Gato();
        }
        b.fala();
    }
}
