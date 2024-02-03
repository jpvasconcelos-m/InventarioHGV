package controller;

import infra.DAO;
import model.HashSenhas;
import model.Usuario;
import view.TelaLogin;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class AutenticadorLogin {

   static DAO<Usuario> usuarioDAO = new DAO<>(Usuario.class);



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        autenticar(sc.nextLine(),sc.nextLine());



    }


    public static void autenticar(String login, String senhaDigitada){

        Usuario usuario = verificarLoginDB(login);
        if(verificarHashSenha(usuario,senhaDigitada) == true){
            System.out.println("Login com sucesso!");
        }
        else{
            System.out.println("Falha login!");
        }


    }

    public static Usuario verificarLoginDB(String login){
        String queryName = "usuarios.findByLogin";
           List<Usuario> usuariosEncontrados =  usuarioDAO.query(queryName,"login",login);

           if(usuariosEncontrados.get(0) != null){
               System.out.println(usuariosEncontrados.get(0));
               return usuariosEncontrados.get(0);
           }
           else
               return null;


    }

    static boolean verificarHashSenha(Usuario usuario,String senhaDigitada){

        HashSenhas hs = new HashSenhas();
        return hs.checkPassword(senhaDigitada+ usuario.getSalt(), usuario.getHashSenha());


    }




}
