import java.util.Scanner;
import br.com.aplicacaotarget.Inverter;

public class Main {
    public static void main(String[] args) {
        Inverter inverter = new Inverter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserir uma String para invertê-la: ");
        String stringInverte = scanner.nextLine();
        //System.out.println(inverter.MetodoInversor(stringInverte));
        //System.out.println(stringInverte.charAt(0));
        //System.out.println(stringInverte.replace("o","p"));
        System.out.println(inverter.MetodoInversor(stringInverte));
        }
    }
