import java.util.Scanner;

public class TestarAmostraTemperatura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a, b, c, d, e, f;
        float v;

        System.out.println("Digite um valor para o dia: ");
        a = scanner.nextInt();

        System.out.println("Digite um valor para o mes: ");
        b = scanner.nextInt();

        System.out.println("Digite um valor para o ano: ");
        c = scanner.nextInt();

        System.out.println("Digite um valor para a hora: ");
        d = scanner.nextInt();

        System.out.println("Digite um valor para o minuto: ");
        e = scanner.nextInt();

        System.out.println("Digite um valor para o segundos: ");
        f = scanner.nextInt();

        System.out.println("Digite um valor para a temperatura: ");
        v = scanner.nextInt();

        AmostraTemperatura t1 = new AmostraTemperatura(a, b, c, d, e, f, v);

        System.out.println("DATA: " + t1.getData());
        System.out.println("HORA: " + t1.getHora());
        System.out.println("VALOR DA TEMPERATURA: " + t1.getValor());
        System.out.println("NUMERO SEQUENCIAL: " + t1.getNumSeq());

        AmostraTemperatura t2 = new AmostraTemperatura();

        System.out.println("DATA: " + t2.getData());
        System.out.println("HORA: " + t2.getHora());
        System.out.println("VALOR DA TEMPERATURA: " + t2.getValor());
        System.out.println("NUMERO SEQUENCIAL: " + t2.getNumSeq());

        t1.setData();
        t1.setHora();
        t1.setValor();

        System.out.println("DATA: " + t1.getData());
        System.out.println("HORA: " + t1.getHora());
        System.out.println("VALOR DA TEMPERATURA: " + t1.getValor());
        System.out.println("NUMERO SEQUENCIAL: " + t1.getNumSeq());

    }
}
