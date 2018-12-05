package Entity;

import java.util.Date;

public class Ticket {
    private Date date;
    private String name;
    private String sername;
    private String nickname;
    private int numberPlace;
    private int nubmerWagon;
    private FlyghtStation start;
    private FlyghtStation end;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSername() {
        return sername;
    }

    public void setSername(String sername) {
        this.sername = sername;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getNumberPlace() {
        return numberPlace;
    }

    public void setNumberPlace(int numberPlace) {
        this.numberPlace = numberPlace;
    }

    public int getNubmerWagon() {
        return nubmerWagon;
    }

    public void setNubmerWagon(int nubmerWagon) {
        this.nubmerWagon = nubmerWagon;
    }
}
