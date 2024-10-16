package Encapsulamento;

public class ObjetoCasa {

	public static void main(String[] args) {

		Casa casa1 = new Casa (12345678l, "Casa do Jota", 1500.00, "Amarelo");
		DescricaoCasa descricaoCasa1 = new DescricaoCasa (12345678l, "Casa do Jota", "50 m²");
		Cliente cliente1 = new Cliente (01, "Francisco", "99145-5687", "561.646.608-58", "99999999-9");
		EnderecoCasa enderecoCasa1 = new EnderecoCasa (123l, "Rua", 387, "Em frente a um condomínio", "Shangri-lá", "Itapetininga", "18208-560", "São Paulo");


		System.out.println(casa1.getId());
		System.out.println(casa1.getNome());
		System.out.println(casa1.getValorAluguel());
		System.out.println(casa1.getCor());

		System.out.println("----------------");

		System.out.println(descricaoCasa1.getId());
		System.out.println(descricaoCasa1.getNome());
		System.out.println(descricaoCasa1.getDescricao());

		System.out.println("----------------");

		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getRg());

		System.out.println("----------------");

		System.out.println(enderecoCasa1.getId());
		System.out.println(enderecoCasa1.getLogradouro());
		System.out.println(enderecoCasa1.getNumero());
		System.out.println(enderecoCasa1.getComplemento());
		System.out.println(enderecoCasa1.getBairro());
		System.out.println(enderecoCasa1.getCidade());
		System.out.println(enderecoCasa1.getCep());
		System.out.println(enderecoCasa1.getUf());



	}
}
