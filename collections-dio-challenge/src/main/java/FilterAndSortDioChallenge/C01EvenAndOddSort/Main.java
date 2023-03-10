package FilterAndSortDioChallenge.C01EvenAndOddSort;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        List<Integer> numbers = new ArrayList<Integer>();

        while(scanner.hasNext()){
            numbers.add( scanner.nextInt() );
        }

        scanner.close();

        numbers.stream()
                .filter(number -> number % 2 == 0)
                .sorted()
                .forEach(System.out::println);

        numbers.stream()
                .filter(number -> number % 2 != 0)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
/*
Crie um programa onde você receberá valores inteiros não negativos como entrada.

Ordene estes valores de acordo com o seguinte critério:

Primeiro os Pares

Depois os Ímpares

Você deve exibir os pares em ordem crescente e na sequência os ímpares em ordem decrescente.

Entrada
A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000) Este é o número de linhas de entrada que vem logo a seguir. As próximas N linhas terão, cada uma delas, um valor inteiro não negativo.

Saída
Exiba todos os valores lidos na entrada segundo a ordem apresentada acima. Cada número deve ser impresso em uma linha, conforme exemplo de saída abaixo.


Exemplo de Entrada
10
4
32
34
543
3456
654
567
87
6789
98

Exemplo de Saída
4
32
34
98
654
3456
6789
567
543
87
 */