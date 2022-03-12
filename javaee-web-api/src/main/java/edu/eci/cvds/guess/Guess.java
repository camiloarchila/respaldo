package edu.eci.cvds.guess;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;


@ManagedBean(name = "guessBean")
@ApplicationScoped

public class Guess {

    private int numaadivinar;

    public Guess(){
    }

    public void guess(int intento){
        if (getnumdeintentos() == 1 && intento == numaadivinar){
            setgetpremioacumulado(10000);
        }
    }

    public void restart(){
        setgetpremioacumulado(0);
        setnumactualaadivinar(0);
        setnumdeintentos(0);
        setstatus("no a ganado");
    }

    public int getnumactualaadivinar(){
        return 0;
    }

    public void setnumactualaadivinar(int numero){
    }

    public int getnumdeintentos(){
        return 0;
    }

    public void setnumdeintentos(int numero){
    }

    public int getpremioacumulado(){
        return 0;
    }

    public void setgetpremioacumulado(int numero){
    }

    public String getstatus(){
        return "";
    }

    public void setstatus(String status){
    }


}
