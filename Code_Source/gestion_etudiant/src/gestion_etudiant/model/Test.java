package gestion_etudiant.model;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// Etudiant e1 = new Etudiant("Aziz",22,18.5,"Tunis");
		Etudiant e2 = new Etudiant();

		// e1.info();
		e2.info();
		System.out.println("***");
		
		
		
		Scanner sc = new Scanner(System.in);

		boolean data = false;

		while (data == false) {
			System.out.println("Donner votre nom");
			String nom = sc.nextLine();

			if ((nom.length() >= 8) && (nom.length() <= 30)) {
				e2.setNom(nom);
				data = true;
			} else
				System.out.println("Le nom est invalide, merci de taper un nom de longeur entre 8 et 30 caractères");
		}
		data = false;
		
		e2.info();
		
		System.out.println("***");
		while (data == false) {
			System.out.println("Donner votre age");
			int age = sc.nextInt();
			if ((age >= 18) && (age <= 28))
			{
				e2.setAge(age);
			    data = true;
			}
			else
				System.out.println("L'age est invalide, merci de taper un age entre 18 et 28");
			
		}
		data = false;
		e2.info();
		while (data == false) {
		System.out.println("Donner votre moyenne");
		double moyenne = sc.nextDouble();
		if ((moyenne >= 0) && (moyenne <= 20))
		{
			e2.setMoyenne(moyenne);
			data = true;
		}
		else
			System.out.println("La moyenne est invalide");
		}
		data = false;
		e2.info();
		
		
		sc.nextLine(); // pour absorber le caractères "espace" dans le buffer

		System.out.println("Donner votre adresse");
		String adresse = sc.nextLine();
		// e2.adresse= adresse;
		e2.setAdresse(adresse);
		e2.info();
	}

}
