import java.util.ArrayList;

public class Cliente {
	private int id;
	private String nome;
	private String cpf;
	private static int proximoId = 1;

	ArrayList<Cliente> listClientes = new ArrayList<Cliente>();

	public Cliente() {

	}

	public void cadastrarCliente(String nome, String cpf) {
		Cliente novoCliente = new Cliente(nome, cpf);
		listClientes.add(novoCliente);
	}

	public void excluirCliente() {
		listClientes.remove(id);
	}

	public Cliente(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.id = proximoId;
		proximoId++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void menuText() {
		System.out.println("************************************************");
		System.out.println("***           Registro de Cliente            ***");
		System.out.println("************************************************");
		System.out.println(" 1 - Cadastrar Cliente");
		System.out.println(" 2 - Excluir Cliente");
		System.out.println(" 3 - Ir Para Filmes");
		System.out.println(" 4 - Mostrar Todos os Clientes");
		System.out.println(" 5 - Sair.");

	}

	public Cliente toString() {
		return listClientes.get(id)  ;
	}

}
