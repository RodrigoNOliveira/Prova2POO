import java.util.Scanner;

public class LivroNotas {

    private String nomeCurso;
    private Scanner scanner = new Scanner(System.in);

    public LivroNotas(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public LivroNotas() {
    }


    public void MostraMensagem(){
        System.out.println("Seja bem vindo, o livro de notas pertence ao curso: " + this.nomeCurso);
    }

    public void CalculaMediaClasse(){

        float[] vetor = new float[10];
        float media = 0;
        System.out.println("Insira as 10 notas para realizar o calculo da media: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextFloat();
            if(vetor[i] < 0 || vetor[i]> 100){
                System.out.println("Nota inserida invalida, insira novamente.");
                i--;
            } else{
            media = media + vetor[i];
            }
        }
        media = media/10;
        System.out.println("A média é de: " + media);
    }

    public void CalculaConceito(float nota){
        String msg = "";
        if (nota >=95 && nota<=100){
            msg = "A nota é conceito A";
        } else if (nota <95 && nota >=80){
            msg = "A nota é conceito B";
        } else if (nota >=60 && nota <80){
            msg = "A nota é conceito C";
        } else if (nota < 60 && nota >= 40){
            msg = "A nota é conceito D";
        } else if (nota >= 20 && nota <40){
            msg = "A nota é conceito E";
        } else if (nota < 20 && nota >= 0){
            msg = "A nota é conceito F";
        } else{
            msg = "Nota inserida invalida";
        }
        System.out.println(msg);
    }



}
