package modell;

import java.io.Serializable;
import java.util.ArrayList;

public class Knoten implements Serializable {
	
	public Knoten v;
	public ArrayList<Knoten> ns;
	public short tiefe;
	public int siege;
	public int niederlagen;
	public int unentschieden;
	public int unklar;
	
	public Knoten() {
		ns = new ArrayList<Knoten>();
	}
	
	public void neuerSieg() {
		
	}
	
	public void neueNiederlage() {
		
	}
	
	public void neuesUnentschieden() {
		
	}
}
