//UTILIZAÇÃO DE CLASSES E DEMONSTRAÇÃO DE METODOS CHAMADOS POR BIBLIOTECAS

import java.sql.SQLOutput;
import java.util.Calendar;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        c.set(Calendar.YEAR,1990);
        c.set(Calendar.MONTH, 11);
        c.set(Calendar.DAY_OF_MONTH, 25);
        c.set(Calendar.HOUR_OF_DAY, 23);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);

        imprimirData(c);

        System.out.println("=============ALTERAÇÃO=============");

        imprimirData(c);

    }

    private static void imprimirData(Calendar c) {
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH)+1);
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
    }
}