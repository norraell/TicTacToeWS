package modell;

import java.io.Serializable;
import java.util.Date;

public class Baum implements Serializable{
	
	public Knoten root;
	
	public void neuerBaum() {
		System.out.println("Starte generierung eines neuen Baums");
		Date start = new Date();
		
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
				for (int c = 1; c <= 7; c++) {
					Knoten newK7 = new Knoten();
					setzeParameter(newK7);
					//6 mögliche Felder
					for (int d = 1; d <= 6; d++) {
						Knoten newK6 = new Knoten();
						setzeParameter(newK6);
						//5 mögliche Felder
						for (int e = 1; e <= 5; e++) {
							Knoten newK5 = new Knoten();
							setzeParameter(newK5);
							//4 mögliche Felder
							for (int f = 1; f <= 4; f++) {
								Knoten newK4 = new Knoten();
								setzeParameter(newK4);
								//3 mögliche Felder
								for (int g = 1; g <= 3; g++) {
									Knoten newK3 = new Knoten();
									setzeParameter(newK3);
									//2 mögliche Felder
									for (int h = 1; h <= 2; h++) {
										Knoten newK2 = new Knoten();
										setzeParameter(newK2);
										//2 mögliche Felder
										for (int i = 1; i <= 2; i++) {
											Knoten newK1 = new Knoten();
											setzeParameter(newK1);
											newK1.v = newK2;
											newK2.ns.add(newK1);
										}
										//Ende 2 mögliche Felder
										newK2.v = newK3;
										newK3.ns.add(newK2);
									}
									//Ende 2 mögliche Felder
									newK3.v = newK4;
									newK4.ns.add(newK3);
								}
								//Ende 3 mögliche Felder
								newK4.v = newK5;
								newK5.ns.add(newK4);
							}
							//Ende 4 mögliche Felder
							newK5.v = newK6;
							newK6.ns.add(newK5);
						}
						//Ende 5 mögliche Felder
						newK6.v = newK7;
						newK7.ns.add(newK6);
					}
					//Ende 6 mögliche Felder
					newK7.v = newK8;
					newK8.ns.add(newK7);
				}
				//Ende 7 mögliche Felder
				newK8.v = newK9;
				newK9.ns.add(newK8);
			}
			//Ende 8 mögliche Felder
			newK9.v = root;
			root.ns.add(newK9);
		}
		//Ende 9 mögliche Felder
		Date end = new Date();
		long zeit = end.getTime() - start.getTime();
		System.out.println("Der Baum wurde in " + zeit + " Millisekunden erstellt");
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
		
		return k;
	}

}
