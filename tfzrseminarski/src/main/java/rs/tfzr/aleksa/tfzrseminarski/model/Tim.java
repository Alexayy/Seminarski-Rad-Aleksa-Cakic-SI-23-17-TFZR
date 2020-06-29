package rs.tfzr.aleksa.tfzrseminarski.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tim")
public class Tim implements Serializable {

    @Id
    @Column(name = "tim_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int tim_id;

    @Column(name = "tim_ime")
    private String tim_ime;

    @Column(name = "tim_osnovan")
    private int tim_osnovan;

    @Column(name = "tim_trener")
    private String tim_trener;

    @Autowired
    public Tim(int tim_id, String tim_ime, int tim_osnovan, String tim_trener) {
        this.tim_id = tim_id;
        this.tim_ime = tim_ime;
        this.tim_osnovan = tim_osnovan;
        this.tim_trener = tim_trener;
    }

    public Tim() { }

    public int getTim_id() {
        return tim_id;
    }

    public void setTim_id(int tim_id) {
        this.tim_id = tim_id;
    }

    public String getTim_ime() {
        return tim_ime;
    }

    public void setTim_ime(String tim_ime) {
        this.tim_ime = tim_ime;
    }

    public int getTim_osnovan() {
        return tim_osnovan;
    }

    public void setTim_osnovan(int tim_osnovan) {
        this.tim_osnovan = tim_osnovan;
    }

    public String getTim_trener() {
        return tim_trener;
    }

    public void setTim_trener(String tim_trener) {
        this.tim_trener = tim_trener;
    }
}
