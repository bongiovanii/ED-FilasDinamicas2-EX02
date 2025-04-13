package controller;

import br.edu.fatec.bongiovani.Fila;
import model.Cliente;

public class OperacaoController {

	public OperacaoController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void caixa(Fila<Cliente> fClientes) {
		while (!fClientes.isEmpty()) {
			try {
				Cliente cliente = fClientes.remove();
				float total = cliente.getValorPecas() * cliente.getQuantidadePecas();

				System.out.println("Nome: " + cliente.getNome() + "\nTotal da compra: " + total);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
