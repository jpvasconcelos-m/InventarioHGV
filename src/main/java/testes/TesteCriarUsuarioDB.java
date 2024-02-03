package testes;

import infra.DAO;
import model.HashSenhas;
import model.Usuario;

import java.util.Scanner;

public class TesteCriarUsuarioDB {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        HashSenhas hs = new HashSenhas();
        Scanner sc = new Scanner(System.in);
        DAO<Object> dao = new DAO<>();


        usuario.setLogin("login");
        usuario.setNome("Pedro Alvares de Cabral");
        usuario.setHashSenha(hs.hashPassword(sc.nextLine() + usuario.getSalt())); //Digitar a senha.

        System.out.println(usuario.getHashSenha());

        dao.atomicInclude(usuario);



    }

}
