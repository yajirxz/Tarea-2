import java.util.Scanner;
public class Tarea02 {
    public static void main(String[] args){
        Scanner scanner= new Scanner (System.in);
        System.out.print("Ingresa una cadena de caracteres: ");
        String inputString = scanner.nextLine();
        boolean EsSecuenciaConsecutiva = true;
        if (inputString.length() == 0 || inputString.length() == 1) {
            EsSecuenciaConsecutiva = false;
        }
        else {
            char[] charArray = inputString.toCharArray();
            for(int i = 1; i < charArray.length; i++){
                if ((int)charArray[i] - (int)charArray[i-1]  !=1) {
                    EsSecuenciaConsecutiva = false;
                    break;
                }
            }
        }
        if(EsSecuenciaConsecutiva) {
            System.out.println("la cadena es consecutiva");
        }
        else {
            System.out.println("la cadena no es consecutiva");

        }
    }
}
