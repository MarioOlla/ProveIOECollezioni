package it.prova.proveioecollezioni.test;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {

		Map<String, Integer> stringToInteger;

		// creo una nuova mappa che associa al nome di interi il loro valore...
		stringToInteger = new HashMap<>(); // ...mi aspetto sia vuota
		System.out.println("la mappa appena creata e'  vuota? -> " + stringToInteger.isEmpty());

		// provo ad aggiungere dei valori...
		stringToInteger.put("uno", 1);
		stringToInteger.put("due", 2);
		stringToInteger.put("tre", 3);
		// controllo che la taglia sia aumentata...
		System.out.println("dimensioni mappa :" + stringToInteger.size());
		for (String string : stringToInteger.keySet()) {
			System.out.println(string + " : " + stringToInteger.get(string));
		}
		// provo ad aggiornare un valore...
		stringToInteger.put("due", 4);
		// controllo se la taglia sia aumentata...
		System.out.println("dimensioni mappa :" + stringToInteger.size());
		for (String string : stringToInteger.keySet()) {
			System.out.println(string + " : " + stringToInteger.get(string));
		}
		//provo ad eliminare un valore...
		stringToInteger.remove("due");
		// controllo che la taglia sia diminuita...
				System.out.println("dimensioni mappa :" + stringToInteger.size());
				for (String string : stringToInteger.keySet()) {
					System.out.println(string + " : " + stringToInteger.get(string));
				}
	}

}
