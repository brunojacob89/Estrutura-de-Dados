package ed;

public class Aluno {
	
	private String nome;
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public boolean equals(Object obj) {
		//posso usar tanto no equals um if  ou no for de alunos usar o totalDeAlunos
//		if(obj == null) {
//			return false;
//		}
		Aluno outro = (Aluno) obj;
		return outro.getNome().equals(this.nome);
	}
	
	@Override
	public String toString() {
		return nome;
	}

}
