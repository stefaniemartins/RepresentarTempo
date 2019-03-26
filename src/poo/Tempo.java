package poo;

public class Tempo
{
    private int horas;
    private int minutos;
    private int segundos;


    public Tempo()
    {
        horas = 0; //Só guarda 0 porque como é int ele ignora os zeros a esquerda. Na hora de imprimir em String deve ser impresso 00.
        minutos = 0;
        segundos = 0;
    }

    public Tempo(int horas)
    {
        setHoras(horas);
    }

    public Tempo(int horas, int minutos)
    {
        setHoras(horas);
        setMinutos(minutos);
    }

    public Tempo(int horas, int minutos, int segundos)
    {
        setHoras(horas);
        setMinutos(minutos);
        setSegundos(segundos);
    }

    public void setHoras(int horas)
    {
        if ((horas < 0) || (horas > 24))
        {
            horas = 0;
        }

        else
        {
            this.horas = horas;
        }
    }

    public void setMinutos(int minutos)
    {
        if ((minutos < 0) || (minutos > 59))
        {
            minutos = 0;
        }

        else
        {
            this.minutos = minutos;
        }
    }

    public void setSegundos(int segundos)
    {
        if ((segundos < 0) || (segundos > 59))
        {
            segundos = 0;
        }

        else
        {
            this.segundos = segundos;
        }
    }
}