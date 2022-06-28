import java.util.Scanner;

public class AmostraTemperatura {

    private int numSeq;
    private Data data;
    private Hora hora;
    private float valor;
    private Scanner scanner;

    public AmostraTemperatura() {
        this.setData();
        this.setHora();
        this.setValor();
    }

    public AmostraTemperatura(int a, int b, int c, int d, int e, int f, float v) {
        this.setData(a, b, c);
        this.setHora(d, e, f);
        this.setValor(v);
    }

    public AmostraTemperatura(Data d, Hora h, float v) {
        this.setData(d.getDia(), d.getMes(), d.getAno());
        this.setHora(h.getHoras(), h.getMinutos(), h.getSegundos());
        this.setValor(v);
    }

    public void setData(int a, int b, int c) {
        this.data = new Data(a, b, c);
    }

    public void setData() {
        this.data = new Data();
    }

    public void setHora(int a, int b, int c) {
        this.hora = new Hora(a, b, c);
    }

    public void setHora() {
        this.hora = new Hora();
    }

    public void setValor(float v) {
        this.valor = v;
        this.numSeq++;
    }

    public void setValor() {
        try {
            this.scanner = new Scanner(System.in);
            System.out.println("Digite um valor para a temperatura: ");
            this.valor = scanner.nextInt();
            this.numSeq++;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getNumSeq() {
        return this.numSeq;
    }

    public String getData() {
        return this.data.getData();
    }

    public String getHora() {
        return this.hora.getHoraCompleta();
    }

    public float getValor() {
        return this.valor;
    }

}