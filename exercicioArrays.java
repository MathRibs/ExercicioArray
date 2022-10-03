import java.util.Scanner;

public class exercicioArrays {
public static void main(String[] args) {
	
Scanner in = new Scanner(System.in);
int tamanho, busca, i, j, c = 0, aux = 0;
int[] array = new int[20];
for (i = 0; i < array.length; i++) {
    array[i] = 0;
}
System.out.print("Digite o tamanho do array: ");
tamanho = in.nextInt();
System.out.println("Digite os valores do array: ");
for (i = 0; i < tamanho; i++) {
    array[i] = in.nextInt();
}
System.out.print("Digite o valor da busca: ");
busca = in.nextInt();
for (i = 0; i < tamanho; i++) {
    if (array[i] == busca) {
        c++;
        aux = i;
    }
}
if (c > 0) {
    for (i = aux; i < tamanho; i++) {
        if (i == tamanho - 1) {
            array[i] = 0;
        } else {
            array[i] = array[i + 1];
        }
    }
}
for (i = 0; i < tamanho; i++) {
    for (j = i + 1; j < tamanho; j++) {
        if (array[i] > array[j]) {
            aux = array[i];
            array[i] = array[j];
            array[j] = aux;
        }
    }
}
System.out.println("");
for (i = 0; i < tamanho; i++) {
    System.out.println(array[i]);
}
}
}