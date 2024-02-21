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


    public static boolean autenticar(String login, String senhaDigitada){


        //Verifica primeiro se há um usuário com esse nome:
        Usuario usuario = verificarLoginDB(login);

       //Para então verificar a senha:
        try {
            if (verificarHashSenha(usuario, senhaDigitada) == true) {
                System.out.println("Login com sucesso!");
                return true;
            } else {
                System.out.println("Falha login!");
                return false;
            }
        }catch (NullPointerException e){
            System.out.println("Falha Login!");
            return false;

        }


    }


    //Verifica se há um usuario com esse login no DB.

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

    //Método para verificar se o hash da senha digitada + salt do banco do usuario que está tentando entrar corresponde a um hash na base de dados.
    static boolean verificarHashSenha(Usuario usuario,String senhaDigitada){

        HashSenhas hs = new HashSenhas();
        return hs.checkPassword(senhaDigitada+ usuario.getSalt(), usuario.getHashSenha());


    }




}
