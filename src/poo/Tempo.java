package poo;

public class Tempo
{
    private int horas;
    private int minutos;
    private int segundos;


    public Tempo()
    {
        horas = 00;
        minutos = 00;
        segundos = 00;
    }

    public Tempo(int horas)
    {
        this.horas = horas;
    }

    public Tempo(int horas, int minutos)
    {
        this.horas = horas;
        this.minutos = minutos;
    }

    public Tempo(int horas, int minutos, int segundos)
    {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
}