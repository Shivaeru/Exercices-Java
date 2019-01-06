package mailQuatre;

public class MailQuatre {

	public static void main(String[] args) {

		String[] tab = new String[10];
		int countGmail = 0, countHotmail = 0, countMsn = 0;

		tab[0] = "arobase@hotmail.fr";
		tab[1] = "ioanna@gmail.com";
		tab[2] = "mail@msn.com";
		tab[3] = "tsoukalas@hotmail.fr";
		tab[4] = "rien@msn.com";
		tab[5] = "arrow@hotmail.fr";
		tab[6] = "google@gmail.com";
		tab[7] = "facebook@msn.com";
		tab[8] = "pasdidees@hotmail.fr";
		tab[9] = "zero@msn.com";

		for (int i = 0; i<tab.length; i++) {
			//System.out.println(tab[i].substring(tab[i].indexOf("@")));		
			switch (tab[i].substring(tab[i].indexOf("@"))) {
			case "@gmail.com": countGmail++;
			break;
			case "@hotmail.fr": countHotmail++;
			break;
			case "@msn.com": countMsn++;
			break;
			}
		}			
		System.out.println("Il y a " + countGmail + " adresses Gmail");
		System.out.println("Il y a " + countHotmail + " adresses Hotmail");
		System.out.println("Il y a " + countMsn + " adresses Msn");
	}
}

