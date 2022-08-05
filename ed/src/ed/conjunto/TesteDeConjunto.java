package ed.conjunto;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class TesteDeConjunto {

	public static void main(String[] args) {

		Conjunto conjunto = new Conjunto();
		
		conjunto.adiciona("Mauricio");
		System.out.println(conjunto);
		
		conjunto.adiciona("Mauricio");
		System.out.println(conjunto);
		
		conjunto.adiciona("Marcelo");
		conjunto.adiciona("Guilherme");
		conjunto.adiciona("Ana");
		conjunto.adiciona("Bruno");
		System.out.println(conjunto);
		
		conjunto.remove("Mauricio");
		System.out.println(conjunto);
		
		Set<String> conjuntoDoJava = new HashSet<String>();
		
		conjuntoDoJava.add("Mauricio");
		conjuntoDoJava.add("Paulo");
		
		System.out.println(conjuntoDoJava);
		
		String x = "Guilherme";
		x.hashCode();
		
		System.out.println("Guilherme".hashCode());
		System.out.println("Guilherme".hashCode());
		System.out.println(x.hashCode());
	}

}
