package exercicioSemana3_EnzoMb;

public class Main {
	
	public static void main(String[] agrs) {
		Colaboradores c1, c2, c3;
		Departamentos d1, d2, d3;
		
		d1 = new Departamentos("Havan", 20, 10);
		d2 = new Departamentos("Americanas", 5, 20);
		d3 = new Departamentos("Pernambucanas", 4, 15);
		
		c1 = new Colaboradores("5646", "Joao", 30, d3);
		c2 = new Colaboradores("7273", "Pedro", 30, d1);
		c3 = new Colaboradores("2932", "Gabriel", 32, d3);
		
		System.out.println(c3.getDepart());
		c3.setDepart(d2);
		System.out.println(c3.getDepart());
		System.out.println(c1.getNome());
		c1.setNome("Gustavo");
		System.out.println(c1.getNome());
		
		c1.compararIdades(c3);
		
		c1.compararIdades(c2);
		
		c1.verificarColab(c3);
		
		c2.setNome("Gabriel");
		c2.setDepart(d3);
		d3.setNome("Americanas");
		d3.setRamal(5);
		
		c2.verificarColab(c3);
	}
}
