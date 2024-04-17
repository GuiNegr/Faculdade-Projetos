import java.sql.SQLOutput;
import java.util.Calendar;
public class Idade {
    int dia, mes, ano;
    static Calendar c = Calendar.getInstance();
    static Calendar a = Calendar.getInstance();

    int anoatual = a.get(Calendar.YEAR);
    int mesatual = a.get(Calendar.MONTH) + 1;
    int diaatual = a.get(Calendar.DAY_OF_MONTH);

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

}

