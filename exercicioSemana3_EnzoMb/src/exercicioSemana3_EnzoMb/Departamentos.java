package exercicioSemana3_EnzoMb;

import java.util.Objects;

public class Departamentos {
	
	private String nome;
	private int ramal;
	private int totalColab;
	
	public Departamentos(String nome, int ramal, int quant_colab) {
		this.nome = nome;
		this.ramal = ramal;
	}
	
	public void addColaborador() {
		totalColab++;
	}
	
	public void removeColaborador() {
		totalColab--;
	}
	
	public int getTotalColab() {
		return totalColab;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getRamal() {
		return ramal;
	}
	
	public void setRamal(int ramal) {
		this.ramal = ramal;
	}
	
	public boolean eIgual(Departamentos departamento) {
		if(departamento == null) {
			return false;
		}
		boolean nomesIguais = Objects.equals(departamento.nome, this.nome);
		boolean ramaisIguais = departamento.ramal == this.ramal;
		return nomesIguais && ramaisIguais;
	}
	
	
	
	public String toString() {
		return "Departamento: " + nome + "\nRamal: " + ramal + "\nQuantidade de colaboradores: " + totalColab;
	}
	
}
