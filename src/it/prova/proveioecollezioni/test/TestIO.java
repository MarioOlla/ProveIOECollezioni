package it.prova.proveioecollezioni.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestIO {
	public static void main(String[] args) {
		// creo un nuovo riferimento tipato file
		File mioFile = new File("mioFile.txt");
		// esiste gia'?
		System.out.println("il file mioFile.txt esite gia'? ->" + mioFile.exists());

		// provo a creare un nuovo file visto che non esiste
		System.out.println("creo mioFile.txt ");
		try {
			mioFile.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// contollo che sia stato effettivamente creato
		System.out.println("controllo se il file e' stato creato ->" + mioFile.exists());

		// provo a scrivere su file
		try {
			FileWriter mioWriter = new FileWriter(mioFile);
			mioWriter.write("sto scrivendo nel mio file");
			mioWriter.close();
			System.out.println("ho scritto qualcosa nel mio file");
		} catch (IOException e) {
			System.out.println("non sono riuscito a scrivere nulla");
			e.printStackTrace();
		}
		
		//provo a leggere da file
		String lettoDaFile = "";
		try {
			Scanner mioReader = new Scanner(mioFile);
			while(mioReader.hasNextLine())
				lettoDaFile += mioReader.nextLine();
			mioReader.close();
			System.out.println("sono riuscito a leggere dal file");
		} catch (FileNotFoundException e) {
			System.out.println("non sono riuscito a leggere dal file");
			e.printStackTrace();
		}
		System.out.println("dal file:'"+lettoDaFile+"'");

		// infine elimino il file...
		mioFile.delete();
		// ...e controllo che non esista piu
		System.out.println("dopo averlo cancellato mioFile.txt esiste ancora? ->" + mioFile.exists());

	}
}
