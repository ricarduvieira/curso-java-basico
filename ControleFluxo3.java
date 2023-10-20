/**
 * FLUXO CONDICIONAL
 * Utilização de IF, ELSE IF, ELSE
 * @author Ricardo Vieira
 */

public class ControleFluxo3 {
    /* Método principal da classe */
    public static void main(String[] args) {
        int idade = 65;
        if (idade <= 7) { //a idade menor ou igual a 7?
            System.out.println ("Ainda é uma criança"); //se verdadeiro, imprima
        }   else if (idade > 7 && idade <= 18) { //a idade é maior que 7 e menor ou igual que 18?
                System.out.println ("É um adolecente"); //se verdadeiro, imprima
        }   else if (idade > 18 && idade <= 60) { //a idade é maior que 18 e menor ou igual a 60?
                System.out.println ("É um adulto"); //se verdadeiro, imprima
        }   else {
                System.out.println ("Esta na melhor idade");//senão, imprima
        }//fim do método
    }//fimm do método
}//fim da classe