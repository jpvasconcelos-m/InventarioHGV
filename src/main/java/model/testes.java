package model;

import java.util.Scanner;

public class testes {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Equipamento eqp1 = new Equipamento();
       System.out.println("digite o HOSTNAME: ");

       String teste = entrada.nextLine();
        String eqp1Setor = String.valueOf(eqp1.getSetor(teste));

        System.out.println(eqp1.getSetor());


        entrada.close();
    }
}

