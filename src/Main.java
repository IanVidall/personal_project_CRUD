import java.util.Scanner;

public class Main  extends Cliente{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Cliente cliente = new Cliente();

		
		do {
			cliente.menuText();
			
			int opc = sc.nextInt();
			switch (opc) {
			case 1:
				
				sc.nextLine();
				System.out.print("Nome : ");
				String name = sc.nextLine();
				System.out.print("Cpf : ");
				String cpf = sc.nextLine();
				cliente.cadastrarCliente(name, cpf);
				System.out.println("TOTAL DE CLIENTES: "+cliente.listClientes.size());
				break;
				
			case 2:
				System.out.println("Qual Cliente deseja Excluir ? : ");
				
				
			case 4:
				
				System.out.println(cliente.listClientes.toString());
				
				
			}
				
			
			
		} while (true);
	}
}