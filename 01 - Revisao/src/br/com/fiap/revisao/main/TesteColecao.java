package br.com.fiap.revisao.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.fiap.revisao.bean.Computador;


public class TesteColecao {

	public static void main(String[] args) {
		
		List<Computador> computadores = new ArrayList<Computador>();
		
		for(int i = 0; i < 10; i++) {
			
			Computador c = new Computador("i" + i, i*100);
			computadores.add(c);
		}
		for(Computador churros : computadores) {
				System.out.println(churros.getNome() + " " + churros.getPreco());
	}
		// Criando mapa<Chave, Valor>
		Map<String, Computador> mapa = new HashMap<String, Computador>();
		
		//Adicionar dois tipo computadores
		mapa.put("Dell", new Computador("Dell i9", 1000));
		mapa.put("Dell", new Computador("Dell i2", 1000));
		mapa.put("hp", new Computador("hp i7", 1500));	
		
		//printar na tela com base na chave
		Computador c = mapa.get("Dell");

		System.out.println(c.getNome() + " " + c.getPreco());
		}

}
