
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// vize notunun %20 si, final notunun %40 ve proje notunun da %40 ını alarak ortalamayı hesaplasın
	Scanner scanner=new Scanner(System.in);
	System.out.print("Vize Notunuz :");
	float vize=scanner.nextFloat();
	System.out.print("Final Notunuz :");
	float fin=scanner.nextFloat();
	System.out.print("Proje Notunuz :");
	float proje=scanner.nextFloat();
	double ort=(vize*20/100)+(fin*40/100)+(proje*40/100);
	System.out.print("Ortalamanız :"+ ort);
    }
}
