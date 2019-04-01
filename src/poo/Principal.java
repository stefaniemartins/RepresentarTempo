package poo;

import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)
    {
        Tempo tempo = new Tempo();

        int hora_t1, minuto_t1, segundo_t1;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite as horas do tempo 1: ");
        hora_t1 = teclado.nextInt();
        tempo.setHoras(hora_t1);

        System.out.println("Digite os minutos do tempo 1: ");
        minuto_t1 = teclado.nextInt();
        tempo.setMinutos(minuto_t1);

        System.out.println("Digite os segundos do tempo 1: ");
        segundo_t1 = teclado.nextInt();
        tempo.setSegundos(segundo_t1);

        System.out.println(tempo.toString());

        System.out.println("\nTempo 1 informado em segundos: " + tempo.getHorario_segundos());

        System.out.println("\nDiferença entre os tempos: " + tempo.getDiferençaEntreTempos(1,10,10) + " segundos.");
    }
}
