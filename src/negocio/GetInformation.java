package negocio;

import java.util.Scanner;
import dados.RepositorioUsuario;;

// A classe basicamente tem os m�todos que pegam as informa��es para jogar nos controladores de consultas e pacientes.
//poderia ser simplesmente um m�todo dentro da classe Recepcionista, mas achei melhor assim.
// Se acharem uma solu��o melhor, prfvr, avisem.
// Ass. Darllan Gomes

public class GetInformation {

	public GetInformation() {
		
	}
	public void workPacientes() {
		System.out.println("Digite o nome do Paciente: ");
		Scanner n= new Scanner(System.in);
		Usuario paciente= new Usuario();
		paciente.setNome(n.nextLine());
		
		System.out.println("Digite o cpf do paciente: ");
		paciente.setCpf(n.nextLine());
		
		System.out.println("crie uma senha: ");
		String senha= n.nextLine();
		paciente.setSenhaHash(senha.hashCode());
		
		ControladorUsuario b= new ControladorUsuario();
		b.cadastrar(paciente);
	}
	public void workConsultas(Paciente p) {
		Consulta c = new Consulta();
		Scanner r = new Scanner(System.in);
		Paciente paciente= new Paciente();
		Medico m = new Medico();
		ControladorUsuario medico= new ControladorUsuario();
		System.out.println("Digite a especialidade do m�dico: ");
		c.setEspecialidade(r.nextLine());
		System.out.println("escreva  o nome do m�dico: ");
		String a = new String();
		a= r.nextLine();
		
		//ent�os, temos um problema aqui, precisamos verificar se o m�dico existe na hora de marcar a consulta, o m�todo de procura s� procura cpf
		//n�o consegui fazer override, s� se eu criasse uma subclasse e fizesse o override do m�todo procurar.
		//medico.procurar
		
				
	}
}
