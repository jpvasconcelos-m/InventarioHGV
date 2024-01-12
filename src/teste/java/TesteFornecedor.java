import model.Fornecedor;

 import java.io.ObjectStreamException;
import java.util.HashSet;
import java.util.stream.Collectors;

public class TesteFornecedor {
    public static void main(String[] args) {
        Fornecedor.fornecedores.add(new Fornecedor("Rgraph", "email@email.com", 99832821));
        Fornecedor.fornecedores.stream().forEach(f -> {
            System.out.println(
                    "Nome: " + f.getNome() + " Email: " + f.getEmail() + " Telefone: " + f.getTelefone());
        });

    }


}
