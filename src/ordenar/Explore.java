package ordenar;

import model.Lista;
import quickSort.Quick_Sort;

public class Explore {

	public static void main(String[] args) throws Exception {
		Lista<Integer> Lis = new Lista<Integer>();
		Quick_Sort Quick = new Quick_Sort(); //para organizar o vetor
		
		int [] Vet = new int [10]; //para guardar os valores da lista
		Lis.addFirst(6);
		Lis.addFirst(3);
		Lis.addFirst(7);
		Lis.addFirst(4);
		Lis.addFirst(2);
		Lis.addFirst(9);
		Lis.addFirst(1);
		Lis.addFirst(8);
		Lis.addFirst(5);
		Lis.addFirst(10);
			for(int i = 0; i<10;i++) {
			Vet[i] = Lis.get(i); //preenchendo o vetor com os valores da lista
			}
		int tamanho = Vet.length;
		Vet = Quick.QuickSort(Vet, 0, tamanho-1);
		for(int i = 0; i<10; i++) {
				Lis.addFirst(Vet[i]); //carregando a fila com os valores em ordem
			}
		for(int i = 0; i < 10; i++) {
			System.out.println(Lis.get(i));
		}
	}
}