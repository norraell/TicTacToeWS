package modell;

public class Spielfeld {
	/**
	 * [0][0][0]
	 * [0][0][0]
	 * [0][0][0]
	 * 
	 * -1 steht für Spieler 1, 1 steht für Spieler 2
	 */
	private int[] feld;
	
	/**
	 * 3er Päckchen, die für einen Sieg vom gleichen Spieler belegt sein müssen
	 */
	private int[][] siegmöglichkeiten = {{0,1,2},{3,4,5},{6,7,8},{0,4,8},{2,4,6}};
	
	public Spielfeld() {
		feld = new int[9];
		for (int i = 0; i<feld.length; i++) {
			feld[i] = 0;
		}
	}
	
	/**
	 * Versucht den Wert im Spielfeld an der übergebenen Position auf den Wert zu setzten.
	 * @param position
	 * @param wert
	 * @return true, falls bis jetzt nicht benutzt an Position(0) und wert -1 oder 1
	 */
	public boolean setzeFeld(int position, int wert) {
		if (wert == -1 || wert == 1) {
			if (position < 9 && position >= 0) {
				if (feld[position] == 0) {
					feld[position] = wert;
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * Liefert den Sieger. Falls es noch keinen Sieger gibt eine 0.
	 * Spieler 1: -1
	 * Spieler 2: 1
	 * @return den oben spezifizierten Fall
	 */
	public int liefereSieger() {
		int sieger = 0;
		for (int[] array : siegmöglichkeiten) {
			sieger = feld[array[0]] + feld[array[1]] + feld[array[2]];
			if (sieger == 3 || sieger == -3) {
				break;
			}
		}
		return sieger;
	}
}
