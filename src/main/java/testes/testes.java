package testes;

import model.Equipamento;
import model.Fornecedor;
import model.Setor;

import java.util.Scanner;

public class testes {
    public static void main(String[] args) {

        Scanner setores = new Scanner(System.in);
        Scanner fornecedores = new Scanner(System.in);
        Scanner equipamentos = new Scanner(System.in);

        System.out.println("Digite o setor: ");
        Setor s1 = new Setor(setores.nextLine(), setores.nextInt(), setores.nextInt());
        String set1 = s1.toString();

        //System.out.println(s1.toString());

        System.out.println("Digite o Fornecedor: ");
        Fornecedor f1 = new Fornecedor(fornecedores.nextLine(), fornecedores.nextLine(), fornecedores.nextInt());
        String Forn1 = f1.toString();

        System.out.println("Qual o Equipamento Instalado? ");

        Equipamento eqp1 = new Equipamento(s1, equipamentos.nextLine() , equipamentos.nextInt(), equipamentos.nextLine(),
                equipamentos.nextLine(), equipamentos.nextLine(), equipamentos.nextLine(),f1);
        String equip1 = eqp1.toString();

        System.out.println("A nova entrada no inventário é :" + eqp1);

        setores.close();
        fornecedores.close();
        equipamentos.close();
    }
}

