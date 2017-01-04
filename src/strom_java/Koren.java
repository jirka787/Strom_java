/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strom_java;

/**
 *
 * @author Jiří Ráb
 */
public class Koren {

    private int hodnota;
    private Koren pravy;
    private Koren levy;

    public Koren(int vstup) {
        this.hodnota = vstup;
    }

    public void vlozCislo(int vstup) {
        if (vstup > this.hodnota) {
            vlozitDoPrava(vstup);
        } else if (vstup < this.hodnota) {
            vlozitDoLeva(vstup);
        } else {
            return;
        }
    }

    public void vlozitDoPrava(int vstup) {
        if (this.pravy != null) {
            this.pravy.vlozCislo(vstup);
        } else {
            this.pravy = new Koren(vstup);
        }
    }

    public void vlozitDoLeva(int vstup) {
        if (this.levy != null) {
            this.levy.vlozCislo(vstup);
        } else {
            this.levy = new Koren(vstup);

        }
    }

    public void vytisk(){
        if(this.levy!=null){
            this.levy.vytisk();
        }
        System.out.println(this.hodnota + "");
        if(this.pravy!=null){
            this.pravy.vytisk();
        }
    }
    
    
}
