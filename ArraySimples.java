/**
 * Utilização de Arrays
 * @author Ricardo Vieira
 */

import java.util.Arrays;

public class ArraySimples {
    /* Método principal da classe */
    public static void main (String[] args) {
        String[] paises = {"BRASIL", "RUSSIA", "INDIA", "CHINA"}; //Criando o Array paises

        System.out.println (paises [0]); //Printando a posição zero (0) do Array paises
        System.out.println (Arrays.toString (paises)); //Printando o Array

        int posicao = Arrays.binarySearch (paises, "BRASIL"); //Definindo a variavel que vai receber a posição BRASIL dentro do Array paises
        System.out.println (posicao); // Printando a posição do BRASIL no Array paises
    }//fim do método
}//fim da classe