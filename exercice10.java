package exercice10;

public class exercice10 {

	public static void main(String[] args) {
		
		int tab1[] = {4, 67, 25, 87};
		double tab2[] = {4.5, 67, 25.50, 87.00};
		char tab3[] = {'r', '2', '?', '+'};
		String tab4[] = {"Robert", "Noemie", "David", "Bertrand"};
		
		System.out.println(tab1[0]);
		tab1[2] = 42;
		// remplace la donnée 2 du tab 1
		System.out.println(tab1[2]);
		
		for(int i = 0; i < tab3.length ; i++) {
		System.out.println(tab3[i]);
		}
		//Affiche toutes les valeurs de tab3
		
		System.out.println(tab1.length);
		//Affiche la taille de tab1
	}

}
