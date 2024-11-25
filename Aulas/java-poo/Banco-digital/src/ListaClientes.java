
import java.util.ArrayList;

import java.util.List;

public class ListaClientes {

    private List<Cliente> clienteList;

	public ListaClientes(){
		this.clienteList = new ArrayList<>();
	}

	public void adicionarClientes(String nome){
		clienteList.add(new Cliente(nome));
	}

    public List<Cliente> getClientes() {
		return clienteList;
        
        
    }
}
