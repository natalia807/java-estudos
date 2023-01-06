package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	final String nome;//final: não pode mudar o endereço de memória
	final List<Curso> cursos = new ArrayList<>();
	
	Aluno(String nome) {
		this.nome = nome;
	}

	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);//relacionamento bidirecional
	}
	
	Curso obterCursoPorNome(String nome) {//procurando um curso a partir de um nome
		
		for(Curso curso: this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		
		return null;
	}
	
	public String toString() {
		return nome;
	}
	
}
