import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Digite sua nota ");
        int Nota = s.nextInt();
        String Notast = getNota(Nota);
         System.out.println(Notast);
    }
    String resposta = "";

        public static String getNota (int Nota){
            if (Nota >=7){
                return "Aprovado";
            } else if (Nota >=5 && Nota <=7){
                return "Está em recuperação!";
            }else {
                return "Está reprovado!";
            }



        }

}