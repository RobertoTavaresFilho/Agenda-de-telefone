package aula36.labs;

import java.util.Scanner;

public class exer02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Digite o nome do curso .");
		String nome =scan.nextLine();
		System.out.println("Entre com horário do curso .");
		String horario = scan.nextLine();
		System.out.println("Entre com nome do prefessor .");
		String nomeProf = scan.nextLine();
		System.out.println("Entre com  o departamento do prefessor .");
		String depProf = scan.nextLine();
		System.out.println("Entre com email do professor .");
		String emailProf = scan.nextLine();
		
		
		Curso curso = new Curso();
		curso.setNome(nome);
		curso.setHorario(horario);
			
		
		Professor professor = new Professor();
		professor.setDepartamento(depProf);
		professor.setNome(nomeProf);
		professor.setEmail(emailProf);
		
		System.out.println("--------Alunos--------");	
		Aluno[] alunos= new Aluno[5];
		
		for(int i =0 ;i <5;i++) {
			
			System.out.println("Digite o nome do aluno:"+(i+1));
			String nomeAluno = scan.nextLine();

			System.out.println("Digite a matricula do aluno:");
			String matAluno = scan.nextLine();
			
			double[] notas = new double[4];
			
			for(int j=0 ;j <4;j++) {
				System.out.println("Entre  com a nota :"+(j+1));
				notas[j]= scan.nextDouble();
			}
			
			Aluno aluno = new Aluno();
			aluno.setNome(nomeAluno);
			aluno.setMatricula(matAluno);
			aluno.setNotas(notas);
			alunos[i] = aluno;
			
			
		}
		curso.setAlunos(alunos);
		
		System.out.println(curso.obterInfo());
	}

}
