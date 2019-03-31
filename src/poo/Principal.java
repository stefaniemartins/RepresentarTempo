package poo;

import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)
    {
        Tempo tempo = new Tempo();

        int hora, minuto, segundo;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite as horas: ");
        hora = teclado.nextInt();
        tempo.setHoras(hora);

        System.out.println("Digite os minutos: ");
        minuto = teclado.nextInt();
        tempo.setMinutos(minuto);

        System.out.println("Digite os segundos: ");
        segundo = teclado.nextInt();
        tempo.setSegundos(segundo);

        System.out.println(tempo.toString());
    }
}
