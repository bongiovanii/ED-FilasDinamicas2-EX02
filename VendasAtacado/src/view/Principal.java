package view;

import java.util.Random;

import br.edu.fatec.bongiovani.Fila;
import controller.OperacaoController;
import model.Cliente;

public class Principal {

	public static void main(String[] args) {
		Fila<Cliente> fClientes = new Fila<>();
		OperacaoController opr = new OperacaoController();
		Cliente cliente = new Cliente();
		Random rand = new Random();
		int min = 20;
		int max = 50;
		
		int minPValue = 5;
		int maxPValue = 100;
		String clientes = "";
		
		for(int i = 0; i < 20; i++) {
			clientes = "Cliente " + i;
			int qntdPecas = rand.nextInt((max - min)+1) + min;
			float valorPecas = rand.nextInt((maxPValue - minPValue)+1) + minPValue;
	
			
			cliente = new Cliente(clientes,qntdPecas,valorPecas);
			fClientes.insert(cliente);
		}
		
		opr.caixa(fClientes);
		

	}

}
