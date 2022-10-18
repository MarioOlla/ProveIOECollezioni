package it.prova.proveioecollezioni.test;

import java.util.HashSet;

public class TestSet {
	public static void main(String[] args) {
		HashSet<Integer> numeriInteri;

		// provo a instanziare un nuovo set di interi
		numeriInteri = new HashSet<>();
		// controllo che sia vuota
		System.out.println("elementi nel set: " + numeriInteri.size());

		// provo ad aggiungere degli elementi...
		System.out.println("aggiungo 1 ,2 e 3 al set");
		numeriInteri.add(1);
		numeriInteri.add(2);
		numeriInteri.add(3);
		// ...e provo a stamparli
		for (Integer integer : numeriInteri) {
			System.out.println(integer);
		}
		// provo ad aggiungere un elemento ridondante
		numeriInteri.add(2);
		// faccio delle stampe per verificare che non sia cambuato nulla
		System.out.println("non dovrebbe essere cambiato nulla dopo aver tentato di riaggiungere 2");
		for (Integer integer : numeriInteri) {
			System.out.println(integer);
		}
		System.out.println("rimuovo il 2 dal set");
		numeriInteri.remove(2);
		for (Integer integer : numeriInteri) {
			System.out.println(integer);
		}
	}
}
