package mathelper1;

public class Mathelper {

    /*----------------------numeroseguinte-----------------------*/
    public int numeroSeguinte(int numero) {
        return numero + 1;
    }

    /*--------------------------nomecompleto----------------------*/
    public String juntarNome(String nome, String apelido) {
        return nome + " " + apelido;
    }

    /*-------------------------numeromaior------------------------*/
    public int maior(int[] numeros) {
        int maior = numeros[0];
        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }
        return maior;
    }

    /*---------------------------somar----------------------------*/
    public int soma(int[] numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    /*------------------------media-----------------------------*/
    public double media(double[] numeros) {
        double soma = 0.0;
        for (double numero : numeros) {
            soma += numero;
        }
        return soma / numeros.length;
    }
}
