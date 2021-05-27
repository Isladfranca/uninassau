package aplicativo;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		
		ArrayList<Pessoa> pessoa = new ArrayList<Pessoa>();
		
			Estudante estudante01 = new Estudante("Felipe", "Jaboatão dos Guararapes");
			estudante01.addCursoNota("Matemática", 9);
			estudante01.addCursoNota("Informatica", 8);
			
			Estudante estudante02 = new Estudante("Rafaela", "Recife");
			estudante02.addCursoNota("ingles", 7);
			estudante02.addCursoNota("Informática", 9);
			
			pessoa.add(estudante01);
			pessoa.add(estudante02);
			

			Professor  professor1 = new Professor("Maria", "Recife");
			professor1.addCurso("matemática");
			professor1.addCurso("ingles");
			
			Professor professor2 = new Professor("Jose", "São Paulo");
			professor2.addCurso("informática");
			professor2.addCurso("Português");
			
			pessoa.add(professor1);
			pessoa.add(professor2);
			
	
			for(int i = 0; i<pessoa.size(); i++) {
				String str = pessoa.get(i).toString();
				System.out.println(str);
			}
			
			String teste = pessoasData(pessoa);
			System.out.println(teste);
	}
	
	private static String pessoasData(ArrayList<Pessoa> pessoas) {
		
		Professor professor = new Professor(null, null);
		Estudante estudante = new Estudante(null, null);
		String lista = "";
		
			
			for(int i = 0; i< pessoas.size(); i++) {
					
				 if(professor.getClass() == pessoas.get(i).getClass()) {
					 Professor prof = (Professor) pessoas.get(i);
					 
					 for(int y = 0; y < prof.getCursos().size(); y++) {
						lista += "\nCurso: "+ prof.getCursos().get(y)+"\n";
						lista += "Professor: " + prof.getNome()+"\n";
						lista += "Alunos: ";
								
							for(int z = 0; z < pessoas.size(); z++) {
								
								if(estudante.getClass() == pessoas.get(z).getClass()) {
									Estudante student = (Estudante) pessoas.get(z);
									
									for(int x = 0; x < student.getCursos().size(); x++) {
										
										if(student.getCursos().get(x).equals(prof.getCursos().get(y))) {
											lista += student.getNome()+"\n";
										}
									}
								}
							}
							lista +="-------\n";
					 }
				 }
			}
			
			return lista;
	}

}
