package exercicioSemana3_EnzoMb;

public class Colaboradores {
	
	private String CPF, nome;
	private int idade;
	Departamentos depart;
	
	public Colaboradores(String CPF, String nome, int idade, Departamentos depart) { //metodo construtor para que o usuario informe todos os seus dados definidos
		this.CPF = CPF;
		this.nome = nome;
		this.idade = idade;
		if(depart != null) {
			this.depart = depart;
			depart.addColaborador();
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Departamentos getDepart() {
		return depart;
	}

	public void setDepart(Departamentos depart) {
		this.depart = depart;
	}
	
	private String getCPF() {
		return CPF;
	}

	private void setCPF(String cPF) {
		CPF = cPF;
	}

	private int getIdade() {
		return idade;
	}

	private void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setDepartamento(Departamentos depart) {
		if(depart != null && !depart.eIgual(this.depart)) {
			if(this.depart != null) {
				this.depart.removeColaborador();
			}
			this.depart = depart;
			depart.addColaborador();
		}
	}

	public void compararIdades(Colaboradores colab2) {
		if(this.idade == colab2.getIdade()) {
			System.out.println("Os colaboradores possuem a mesma idade!");
		} else if(this.idade > colab2.getIdade()) {
			System.out.println(this.nome + " é mais velho que " + colab2.getNome() + "\n-=Dados=-\nCPF: " + this.CPF + "\nIdade: " + this.idade + "\nDepartamento: " + this.depart.getNome());
		} else {
			System.out.println(colab2.getNome() + " é mais velho que " + this.nome + "\n-=Dados=-\nCPF: " + colab2.getCPF() + "\nIdade: " + colab2.getIdade() + "\nDepartamento: " + colab2.getDepart().getNome());
		}
	}
	
	public void verificarColab(Colaboradores colab2) {
		if(this.nome == colab2.getNome() && this.depart.getNome() == colab2.getDepart().getNome() && this.depart.getRamal() == colab2.getDepart().getRamal()) {
			System.out.println("Os colaboradores possuem o mesmo nome e atuam no mesmo departamento!!");
		} else {
			System.out.println("Os colaboradores não possuem o mesmo nome e não atuam no mesmo departamento!!");
		}
	}
	
	public String toString() {
		return "CPF: "+ CPF + " |Nome: "+ nome + " |Idade: "+ idade + " |Departamento: "+ depart; 
	}
}
