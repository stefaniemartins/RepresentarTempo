package poo;

public class Tempo
{
    private int horas;
    private int minutos;
    private int segundos;
    private String horario;


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

    public boolean setHoras(int horas)
    {
        if ((horas < 0) || (horas > 23))
        {
            horas = 0;
            return false;
        }

        else
        {
            this.horas = horas;
            return true;
        }
    }

    public boolean setMinutos(int minutos)
    {
        if ((minutos < 0) || (minutos > 59))
        {
            minutos = 0;
            return false;
        }

        else
        {
            this.minutos = minutos;
            return true;
        }
    }

    public boolean setSegundos(int segundos)
    {
        if ((segundos < 0) || (segundos > 59))
        {
            segundos = 0;
            return false;
        }

        else
        {
            this.segundos = segundos;
            return true;
        }
    }

    public int getHoras()
    {
            return horas;
    }

    public int getMinutos()
    {
        return minutos;
    }

    public int getSegundos()
    {
        return segundos;
    }

    @Override
    public String toString()
    {
        if (minutos < 10)
        {
            if (segundos < 10)
            {
                horario = ":0" + minutos + ":0" + segundos;
            }

            else
            {
                horario = ":0" + minutos + ":" + segundos;
            }
        }

        else
        {
            if (segundos < 10)
            {
                horario = ":0" + minutos + ":0" + segundos;
            }

            else
            {
                horario = ":" + minutos + ":" + segundos;
            }
        }

        if (horas < 10)
        {
            horario = "0" + horas + horario;
        }

        if (horas >= 10)
        {
            horario = horas + horario;
        }

        return horario;
    }
}