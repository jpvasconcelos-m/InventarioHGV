package testes;

import model.HashSenhas;

public class TesteHashSenhas {
   static HashSenhas hs = new HashSenhas();

    public static void main(String[] args) {
      String salt =   hs.generateSalt();
      String senha=  "senha1234";

      String senhaComSalt = senha + salt;
        System.out.println("Senha com salt: " + senhaComSalt);
      String senhaComHashESalt = hs.hashPassword(senhaComSalt);
        System.out.println("Senha com hash e salt:" + senhaComHashESalt);

        System.out.println("Teste efetuado com sucesso!");
    }
}
