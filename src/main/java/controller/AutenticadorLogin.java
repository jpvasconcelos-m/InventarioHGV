package controller;

import infra.DAO;
import model.HashSenhas;
import model.Usuario;
import java.util.List;
import java.util.Scanner;

public class AutenticadorLogin {

   static DAO<Usuario> usuarioDAO = new DAO<>(Usuario.class);



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        autenticar(sc.nextLine(),sc.nextLine());



    }


    public static void autenticar(String login, String senhaDigitada){

        Usuario usuario = verificarLoginDB(login);
        try {
            if (verificarHashSenha(usuario, senhaDigitada) == true) {
                System.out.println("Login com sucesso!");
            } else {
                System.out.println("Falha login!");
            }
        }catch (NullPointerException e){

        }


    }

    public static Usuario verificarLoginDB(String login){
        String queryName = "usuarios.findByLogin";
           List<Usuario> usuariosEncontrados =  usuarioDAO.query(queryName,"login",login);

        try {
            if (usuariosEncontrados.get(0) != null) {
                System.out.println(usuariosEncontrados.get(0));
                return usuariosEncontrados.get(0);
            } else
                return null;
        }catch (IndexOutOfBoundsException e){
            System.out.println("Não há login correspondente no banco de dados!");

        }
        return null;


    }

    static boolean verificarHashSenha(Usuario usuario,String senhaDigitada){

        HashSenhas hs = new HashSenhas();
        return hs.checkPassword(senhaDigitada+ usuario.getSalt(), usuario.getHashSenha());


    }




}
