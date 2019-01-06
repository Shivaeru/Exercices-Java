package nbaleaModulo;

public class NbAleaModulo {

	public static void main(String[] args) {
		int i = 0;
		boolean verif = true;

		
		while(verif) {
			int nb1 = (int)Math.floor(Math.random() * 1001);
			int nb2 = (int)Math.floor(Math.random() * 1001);
			int nb3 = (int)Math.floor(Math.random() * 1001);
			if(nb1%2 == 0 && nb2%2 == 0 && nb3%3 == 1) {
				System.out.println(nb1 + " " + nb2 + " " + nb3);
				verif = false;
			}
			i++;
		}
		
		System.out.println("Il a trouvé en " +i+ " essai.");

	}
}
