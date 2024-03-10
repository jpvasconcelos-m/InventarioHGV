package model;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class HashSenhas {

    //Classe do spring security para geração de salts e hashs.
    private static BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public String generateSalt(){
        return BCrypt.gensalt();
    }

    public String hashPassword(String passwordPlusSalt){
        return passwordEncoder.encode(passwordPlusSalt);
    }

    public boolean checkPassword(String senhaInput, String senhaArmazenada) {
        return passwordEncoder.matches(senhaInput, senhaArmazenada);
    }

}
