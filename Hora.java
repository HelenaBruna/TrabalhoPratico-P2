
/**
 * Hora
 */
import java.util.Scanner;

public class Hora {

    private int ValorHoras;
    private int ValorMinutos;
    private int ValorSegundos;

    private final String HoraTemplate = "%s:%s:%s";
    private Scanner Scanner;

    public Hora() {
        this.setHoras();
        this.setMinutos();
        this.setSegundos();
    }

    public Hora(int Horas, int Minutos, int Segundos) {
        this.ValorHoras = Horas;
        this.ValorMinutos = Minutos;
        this.ValorSegundos = Segundos;

        try {
            ValidarValores();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String FormatarValores(int valor) {

        String stringifiedValue = "00" + Integer.toString(valor);

        return stringifiedValue.substring(stringifiedValue.length() - 2);
    }

    private void ValidarValores() throws Exception {

        if (this.ValorSegundos < 0 || this.ValorSegundos > 59) {
            throw new Exception("Segundos invalido");
        }

        if (this.ValorMinutos < 0 || this.ValorMinutos > 59) {
            throw new Exception("Minutos invalido");
        }

        if (this.ValorHoras < 0 || this.ValorHoras > 23) {
            throw new Exception("Hora invalida");
        }

    }

    public static boolean HoraValida(int ValorHora) {
        return ValorHora >= 0 && ValorHora < 24;
    }

    public static boolean MinutoValido(int ValorMinuto) {
        return ValorMinuto >= 0 && ValorMinuto < 60;
    }

    public static boolean SegundoValido(int ValorSegundos) {
        return ValorSegundos >= 0 && ValorSegundos < 60;
    }

    public void ValidarHorario(int ValorHoras, int ValorMinutos, int ValorSegundos) throws Exception {
        if (ValorHoras < 0 || ValorHoras > 23) {
            throw new Exception("Segundos invalido");
        }

        if (ValorMinutos < 0 || ValorMinutos > 59) {
            throw new Exception("Minutos invalido");
        }

        if (ValorSegundos < 0 || ValorSegundos > 59) {
            throw new Exception("Hora invalida");
        }
    }

    private int HorasParaMinutos(int ValorHoras) {
        return ValorHoras * 60;
    }

    private int MinutosParaSegundos(int ValorMinutos) {
        return ValorMinutos * 60;
    }

    public int ConverterSegundos() {
        int qntMinutos = 0, qntSegundos = 0;

        qntMinutos += this.ValorMinutos + HorasParaMinutos(this.ValorHoras);

        qntSegundos += this.ValorSegundos + MinutosParaSegundos(qntMinutos);

        return qntSegundos;
    }

    public void setHoras(int Horas) {
        this.ValorHoras = Horas;

        try {
            ValidarValores();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void setMinutos(int Minutos) {
        this.ValorMinutos = Minutos;

        try {
            ValidarValores();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void setSegundos(int Segundos) {
        this.ValorSegundos = Segundos;

        try {
            ValidarValores();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void setHoras() {
        try {
            this.Scanner = new Scanner(System.in);

            System.out.print("Digite um valor para a hora: ");
            this.ValorHoras = Scanner.nextInt();

            ValidarValores();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void setMinutos() {
        try {
            this.Scanner = new Scanner(System.in);

            System.out.print("Digite um valor para os minutos: ");
            this.ValorMinutos = Scanner.nextInt();

            ValidarValores();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void setSegundos() {
        try {
            this.Scanner = new Scanner(System.in);

            System.out.print("Digite um valor para os segundos: ");
            this.ValorSegundos = Scanner.nextInt();

            ValidarValores();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public int getHoras() {
        return this.ValorHoras;
    }

    public int getMinutos() {
        return this.ValorMinutos;
    }

    public int getSegundos() {
        return this.ValorSegundos;
    }

    public String getHoraCompleta() {
        String HoraCompleta = String.format(
                this.HoraTemplate,
                FormatarValores(this.ValorHoras),
                FormatarValores(this.ValorMinutos),
                FormatarValores(this.ValorSegundos));

        return HoraCompleta;
    }

    public String getHoraCompleta(boolean FormatoVinteQuatroHoras) {

        boolean FormatoHora = this.ValorHoras - 12 > 0;

        String Sufixo = FormatoHora ? "PM" : "AM";

        String HoraCompleta = String.format(
                this.HoraTemplate + " %s",
                FormatarValores(FormatoHora ? this.ValorHoras - 12 : this.ValorHoras),
                FormatarValores(this.ValorMinutos),
                FormatarValores(this.ValorSegundos),
                Sufixo);

        return HoraCompleta;
    }
}