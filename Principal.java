package br.unipe.mplIII.pwc.ui;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.unipe.mplIII.pwc.modelo.Item;

public class Principal {

	public static void main(String[] args) {
		
		Item i1 = new Item(001, "mesa", 239.90);
		Item i2 = new Item(002, "cadeira", 107.83);
		Item i3 = new Item(003, "talheres", 33.25);
		
		List<Item> itens = new ArrayList();
		
		itens.add(i2);
		itens.add(i1);
		itens.add(i3);
		
		System.out.println(itens);
		
		Collections.sort(itens);
		System.out.println(itens);
		
		Collections.reverse(itens);
		System.out.println(itens);
		
	}

}
