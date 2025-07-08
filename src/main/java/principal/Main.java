package principal;


import model.Empregado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Empregado empregado = new Empregado();
    Scanner input = new Scanner(System.in);

    System.out.println("Digite o nome do empregado: ");
    empregado.setNome(input.nextLine());
    System.out.println("Digite o valor do seu salario: ");
    empregado.setSalario(input.nextDouble());

    System.out.println(empregado.toString());


    }
}