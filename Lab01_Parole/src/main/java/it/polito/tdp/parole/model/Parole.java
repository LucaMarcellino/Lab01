package it.polito.tdp.parole.model;

import java.util.*;
import java.util.List;

public class Parole {
	

	LinkedList<String> listaParole=new LinkedList<String>();
	

	
	public void addParola(String p) {
		listaParole.add(p);
		Collections.sort(listaParole, new OrdineAlfabetico());
	}
	
	public List<String> getElenco() {
		return listaParole;
	}
	
	public void reset() {
		listaParole.clear();
	}
	
	public void cancellaParola(String s) {
		if(listaParole.contains(s)) {
			listaParole.remove(s);
		}
		
	}

}
