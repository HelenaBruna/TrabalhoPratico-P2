import java.util.Scanner;
import java.text.*;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    private Scanner Scanner;

    public Data() {
        setDia();
        setMes();
        setAno();
    }

    public Data(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }

    public void setDia(int d) {
        this.dia = d;
    }

    public void setMes(int m) {
        this.mes = m;
    }

    public void setAno(int a) {
        this.ano = a;
    }

    public void setDia() {
        try {
            this.Scanner = new Scanner(System.in);

            System.out.println("Digite um dia: ");
            this.dia = Scanner.nextInt();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setMes() {
        try {
            this.Scanner = new Scanner(System.in);

            System.out.println("Digite um mes: ");
            this.mes = Scanner.nextInt();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setAno() {
        try {
            this.Scanner = new Scanner(System.in);

            System.out.println("Digite um ano: ");
            this.ano = Scanner.nextInt();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAno() {
        return this.ano;
    }

    public String getData() {

        String date = this.dia + "/" + this.mes + "/" + this.ano;

        return date;
    }

    public String getDataExtenso() {

        String mesPorExtenso = "";

        switch (this.mes) {
            case 1:
                mesPorExtenso = "Janeiro";
                break;
            case 2:
                mesPorExtenso = "Feveiro";
                break;
            case 3:
                mesPorExtenso = "Março";
                break;
            case 4:
                mesPorExtenso = "Abril";
                break;
            case 5:
                mesPorExtenso = "Maio";
                break;
            case 6:
                mesPorExtenso = "Junho";
                break;
            case 7:
                mesPorExtenso = "Julho";
                break;
            case 8:
                mesPorExtenso = "Agosto";
                break;
            case 9:
                mesPorExtenso = "Setembro";
                break;
            case 10:
                mesPorExtenso = "Outubro";
                break;
            case 11:
                mesPorExtenso = "Novembro";
                break;
            case 12:
                mesPorExtenso = "Dezembro";
                break;
            default:
                break;
        }

        String date = this.dia + "/" + mesPorExtenso + "/" + this.ano;

        return date;
    }

    public Boolean AnoBissexto() {

        if (ano % 400 == 0) {
            return true;
            // se o ano for menor que 400
        } else if ((ano % 4 == 0) && (ano % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }

    public int diasTranscorridos() {

        // define datas
        LocalDateTime dataCadastro = LocalDateTime.of(this.ano, this.mes, this.dia, 0, 0, 0);
        LocalDateTime hoje = LocalDateTime.now();

        // calcula diferença
        long dias = dataCadastro.until(hoje, ChronoUnit.DAYS);

        return (int) dias;
    }

    public void apresentaDataAtual() {

        DateFormat DFormat = DateFormat.getDateInstance();

        String str = DFormat.format(new Date());

        System.out.println(str);
    }

}