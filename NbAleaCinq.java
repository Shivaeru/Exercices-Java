package nbaleaCinq;

public class NbAleaCinq {

	public static void main(String[] args) {
		boolean verif = true;
		while (verif) {
			
		int nb1 = (int)Math.floor(Math.random() * 1001);
		int nb2 = (int)Math.floor(Math.random() * 1001);
		int nb3 = (int)Math.floor(Math.random() * 1001);
// je déclare un nb aléatoire
		
		String nb1s = String.valueOf(nb1);
		String nb2s = String.valueOf(nb2);
		String nb3s = String.valueOf(nb3);
//transformer int en string
		
		boolean verif1;

		switch(nb1s.substring(nb1s.length() -1)){
		case "0": case "2": case "4": case "6": case "8": verif1 = true;
		break;
		default: verif1 = false;
		}
		boolean verif2;
		switch(nb2s.substring(nb2s.length() -1)){
		case "0": case "2": case "4": case "6": case "8": verif2 = true;
		break;
		default: verif2 = false;
		}
		boolean verif3;
		switch(nb3s.substring(nb3s.length() -1)){
		case "0": case "2": case "4": case "6": case "8": verif3 = true;
		break;
		default: verif3 = false;
		}
		
		if(verif1 == true && verif2 == true && verif3 == false) {
			System.out.println(nb1 + " " + nb2 + " " + nb3);
			verif = false;
		}
			
		}
	}
}
