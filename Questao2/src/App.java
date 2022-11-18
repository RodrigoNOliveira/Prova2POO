import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o nome do curso: ");
        String nome= scanner.nextLine();
        LivroNotas livroNotas = new LivroNotas(nome);
        System.out.println();
        livroNotas.MostraMensagem();
        System.out.println();
        livroNotas.CalculaMediaClasse();
        System.out.println();
        System.out.print("Insira uma nota para verificar o conceito: ");
        float nota = scanner.nextFloat();
        livroNotas.CalculaConceito(nota);
        scanner.close();
    }
}
