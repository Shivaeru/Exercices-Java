package exercice12;

public class exercice12 {

	public static void main(String[] args) {
	
		int tab1[] = new int[5];
		for (int x = 0; x < tab1.length; x++)
		{
			tab1[x] = (int)(Math.random() * 10+1);
			
			System.out.println(tab1[x]);
		}
		
		for (int i = 0; i < tab1.length; i++)
		{
			if (tab1[i] == 4) {
				System.out.println("Le chiffre 4 est en position : " + (tab1[i]));
			}
		}

	}

}
