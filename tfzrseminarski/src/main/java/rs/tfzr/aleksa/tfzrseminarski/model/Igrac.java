package rs.tfzr.aleksa.tfzrseminarski.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "igrac")
public class Igrac implements Serializable {

    @Id
    @Column(name = "igrac_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int igrac_id;

    @Column(name = "igrac_ime")
    private String igrac_ime;

    @Column(name = "igrac_prezime")
    private String igrac_prezime;

    @Column(name = "igrac_broj")
    private int igrac_broj;

    @Column(name = "igrac_tim")
    private String igrac_tim;

    @Column(name = "igrac_godiste")
    private int igrac_godiste;

    @Autowired
    public Igrac(int igrac_id, String igrac_ime, String igrac_prezime, int igrac_broj, String igrac_tim, int igrac_godiste) {
        this.igrac_id = igrac_id;
        this.igrac_ime = igrac_ime;
        this.igrac_prezime = igrac_prezime;
        this.igrac_broj = igrac_broj;
        this.igrac_tim = igrac_tim;
        this.igrac_godiste = igrac_godiste;
    }

    public Igrac() { }

    public int getIgrac_id() {
        return igrac_id;
    }

    public void setIgrac_id(int igrac_id) {
        this.igrac_id = igrac_id;
    }

    public String getIgrac_ime() {
        return igrac_ime;
    }

    public void setIgrac_ime(String igrac_ime) {
        this.igrac_ime = igrac_ime;
    }

    public String getIgrac_prezime() {
        return igrac_prezime;
    }

    public void setIgrac_prezime(String igrac_prezime) {
        this.igrac_prezime = igrac_prezime;
    }

    public int getIgrac_broj() {
        return igrac_broj;
    }

    public void setIgrac_broj(int igrac_broj) {
        this.igrac_broj = igrac_broj;
    }

    public String getIgrac_tim() {
        return igrac_tim;
    }

    public void setIgrac_tim(String igrac_tim) {
        this.igrac_tim = igrac_tim;
    }

    public int getIgrac_godiste() {
        return igrac_godiste;
    }

    public void setIgrac_godiste(int igrac_godiste) {
        this.igrac_godiste = igrac_godiste;
    }
}
