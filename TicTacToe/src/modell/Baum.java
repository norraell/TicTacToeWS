package modell;

import java.io.Serializable;

public class Baum implements Serializable{
	
	public Knoten root;
	
	public void neuerBaum() {
		System.out.println("Starte generierung eines neuen Baums");
		//9 mögliche Felder
		root = new Knoten();
		root = setzeParameter(root);
		for (int a = 1; a <= 9; a++) {
			Knoten newK9 = new Knoten();
			setzeParameter(newK9);
			//8 mögliche Felder
			for (int b = 1; b <= 8; b++) {
				Knoten newK8 = new Knoten();
				setzeParameter(newK8);	
				//7 mögliche Felder
				
				//Ende 7  mögliche Felder
				newK9.ns.add(newK8);
			}
			//Ende 8 mögliche Felder
			root.ns.add(newK9);
		}
	}
	
	/**
	 * Setzt die Paramter von k bei der Initialisierung
	 * @param k
	 * @return der geänderte Knoten k
	 */
	private Knoten setzeParameter(Knoten k) {
		//Tiefe bestimmen
		if (k.v != null) {
			k.tiefe = (short) (k.v.tiefe - 1);
		} else {
			k.tiefe = 0;
		}
		
		//0 Werte setzen
		k.niederlagen = 0;
		k.siege = 0;
		k.unentschieden = 0;
		
		//unklar setzten
		k.unklar = fakultät(9 - k.tiefe);
		
		return k;
	}
	
	private int fakultät(int zahl) {
		int fak = 1;
		while (zahl > 1) {
			fak = fak * zahl;
			zahl--;
		}
		return fak;
	}

}
