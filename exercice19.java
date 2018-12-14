package exercice19;

import java.util.Arrays;

public class exercice19 {

	public static void main(String[] args) {

		int [] array = new int[8];

	    array[0] = ((int)(Math.random()*100+1));
	    array[1] = ((int)(Math.random()*100+1));
	    array[2] = ((int)(Math.random()*100+1));
	    array[3] = ((int)(Math.random()*100+1));
	    array[4] = ((int)(Math.random()*100+1));
	    array[5] = ((int)(Math.random()*100+1));
	    array[6] = ((int)(Math.random()*100+1));
	    array[7] = ((int)(Math.random()*100+1));

	    Arrays.sort(array);

	    System.out.println(array[0] +" " + array[1] +" " + array[2] +" " + array[3]
	    +" " + array[4] +" " + array[5]+" " + array[6]+" " + array[7]+" ");    
	
		}
	}

/* J'ai appris qu'il ne fallait pas utiliser cette méthode, je vais me mettre sur les exo front
et je reviendrai plus tard si j'ai du temps */
