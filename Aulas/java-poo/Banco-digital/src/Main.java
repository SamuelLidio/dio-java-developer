


public class Main {

    public static void main(String[] args) {
        ListaClientes listaClientes = new ListaClientes();
        listaClientes.adicionarClientes("Venilton");
        listaClientes.adicionarClientes("Samuel");

        for (Cliente cliente : listaClientes.getClientes()) {
            Conta ccConta = new ContaCorrente(cliente);
            Conta poupanca = new ContaPoupanca(cliente);

            ccConta.depositar(100);
            ccConta.transferir(100, poupanca);

            ccConta.imprimirExtrato();
            poupanca.imprimirExtrato();
        }
	}

}