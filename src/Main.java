import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cliente cliente = new Cliente();
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		
		
		
		System.out.println("************************************************");
		System.out.println("***           Registro de Cliente            ***");
		System.out.println("************************************************");
		System.out.println(" 1 - Cadastrar Cliente");
		System.out.println(" 2 - Excluir Cliente");
		System.out.println(" 3 - Atualizar");
		System.out.println(" 4 - Mostrar Tudo.");
		System.out.println(" 5 - Sair.");
		int opc = sc.nextInt();
		switch (opc) {
		case 1 :
			
			System.out.println("Cadastrar Cliente");
			System.out.print("Nome : ");
			
			sc.nextLine();
			String name = sc.nextLine();
			cliente.setNome(name);
			
			System.out.println("Cpf : ");
			String cpf = sc.nextLine();
			cliente.setCpf(cpf);
		}
			
		
		
		
		sc.close();
	}

}
