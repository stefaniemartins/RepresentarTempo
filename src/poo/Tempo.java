package poo;

/**
 * Classe para representar o tempo.
 *
 * @author Stefanie Martins.
 */
public class Tempo
{
    private int horas;
    private int minutos;
    private int segundos;
    private String horario;
    private long horario_segundos;

    /**
     * Construtor que não recebe parâmetro.
     */
    public Tempo()
    {
        horas = 0; //Só guarda 0 porque como é int ele ignora os zeros a esquerda. Na hora de imprimir em String deve ser impresso 00.
        minutos = 0;
        segundos = 0;
    }


    /**
     * Construtor que recebe as horas como parâmentro.
     * @param horas recebe as horas informadas.
     */
    public Tempo(int horas)
    {
        setHoras(horas);
    }

    /**
     * Construtor que recebe as horas e os minutos como parâmentro.
     * @param horas recebe as horas informadas.
     * @param minutos recebe os minutos informados.
     */
    public Tempo(int horas, int minutos)
    {
        setHoras(horas);
        setMinutos(minutos);
    }

    /**
     * Construtor que recebe as horas, os minutos e os segundos como parâmentro.
     * @param horas recebe as horas informadas.
     * @param minutos recebe os minutos informados.
     * @param segundos recebe os segundos informados.
     */
    public Tempo(int horas, int minutos, int segundos)
    {
        setHoras(horas);
        setMinutos(minutos);
        setSegundos(segundos);
    }

    /**
     * O método altera as horas.
     * @param horas recebe as horas informadas.
     * @return true caso tenha conseguido alterar o atributo horas, retorna false caso não tenha consegudio alterar o atributo horas.
     */
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

    /**
     * O método altera os minutos.
     * @param minutos recebe os minutos informados.
     * @return true caso tenha conseguido alterar o atributo minutos, retorna false caso não tenha consegudio alterar o atributo minutos.
     */
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

    /**
     * O método altera os segundos.
     * @param segundos recebe os segundos informados.
     * @return true caso tenha conseguido alterar o atributo segundos, retorna false caso não tenha consegudio alterar o atributo segundos.
     */
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

    /**
     * O método obtém as horas.
     * @return o atributo horas.
     */
    public int getHoras()
    {
            return horas;
    }

    /**
     * O método obtém os minutos.
     * @return o atributo minutos.
     */
    public int getMinutos()
    {
        return minutos;
    }

    /**
     * O método obtém os segundos.
     * @return o atributo segundos.
     */
    public int getSegundos()
    {
        return segundos;
    }

    /**
     * O método concatena os atributos horas, minutos e segundos para um padrão. Caso um dos atributos seja menor que 10,
     * será acrescentado um 0 a frente do atributo apra manter o padrão.
     * @return uma String com o formato de horário hh:mm:ss.
     */
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

    /**
     * O método converte os atributos horas e minutos para segundos. Após isso, ele soma os três atributos: horas, minutos e segundos.
     * @return o atributo horario_segundos (o horário convertido totalmente em segundos),
     */
    public long getHorario_segundos()
    {
        horario_segundos = segundos;
        horario_segundos = horario_segundos + (minutos * 60);
        horario_segundos = horario_segundos + (horas * 3600);

        return horario_segundos;
    }
}