
public class Principal {

	public static void main(String[] args) {
		Compte compte1 = new Compte(6, 2000);
		compte1.afficher();
		Compte compte2 = new Compte(6, 2000);
		compte2.afficher();		
		/*
		 * compte.afficher(); compte.crediter(1000); compte.afficher();
		 * compte.debiter(500); compte.afficher();
		 */
		Client client = new Client("Hugo", "Victor");
		client.afficher();
		client.addCompte(compte1);
		client.addCompte(compte2);
	}

}
