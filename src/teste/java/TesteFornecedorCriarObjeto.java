import model.Fornecedor;

import java.util.stream.Collectors;

public class TesteFornecedorCriarObjeto {
    public static void main(String[] args) {
        Fornecedor.adicionarFornecedor(new Fornecedor("Rgraph", "email@email.com", 99832821));
        Fornecedor.fornecedores.stream().forEach(f -> {
            System.out.println(
                    "Nome: " + f.getNome() + " Email: " + f.getEmail() + " Telefone: " + f.getTelefone());
        });
        System.out.println(Fornecedor.fornecedores.add(new Fornecedor("Rgraph", "email@email.com", 99832821)));

        Fornecedor.fornecedores.stream().collect(Collectors.toList()).forEach(System.out::println);


    }


}
