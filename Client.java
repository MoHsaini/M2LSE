import java.net.* ;
import java.io.* ;
import java.util.Scanner;

public class Client { 

	public static void main (String args[]) throws IOException { 

		String hote = "127.0.0.1" ;
 		int port = 3000;
		Socket soc = new Socket (hote, port) ;
		OutputStream flux = soc.getOutputStream() ;
		OutputStreamWriter sortie = new OutputStreamWriter (flux) ;
		Scanner scan = new Scanner(System.in);
		String s ;

		while(true){

	  		if(!(s = scan.nextLine()).equals("QUIT")) {
			   sortie.write("message envoye au serveur " + s + "\n") ;
			   sortie.flush(); // pour forcer l'envoi de la ligne
	        }

	        /*else{
	        	sortie.write("close") ;
			    sortie.flush(); // pour forcer l'envoi de la ligne
			    Break;
	        }*/

    	}

    } 

}