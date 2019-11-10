package Wojaro;

import java.time.LocalDate;

enum Plec{
    M,K
}
public class Kulturysta implements Measurable {
    private String Imie;
    private String Nazwisko;
    private Plec plec;
    private int masa;
    private int wzrost;
    private LocalDate dataUrodzenia;

    public Kulturysta(String imie, String nazwisko, Plec plec, int masa, int wzrost, LocalDate dataUrodzenia) {
        Imie = imie;
        Nazwisko = nazwisko;
        this.plec = plec;
        this.masa = masa;
        this.wzrost = wzrost;
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getImie() {
        return Imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public Plec getPlec() {
        return plec;
    }

    public int getMasa() {
        return masa;
    }

    public int getWzrost() {
        return wzrost;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setImie(String imie) {
        Imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        Nazwisko = nazwisko;
    }

    public void setPlec(Plec plec) {
        this.plec = plec;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }

    public void setWzrost(int wzrost) {
        this.wzrost = wzrost;
    }

    public void setDataUrodzenia(LocalDate dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    @Override
    public String toString() {
        return "Kulturysta{" +
                "Imie='" + Imie + '\'' +
                ", Nazwisko='" + Nazwisko + '\'' +
                ", plec=" + plec +
                ", masa=" + masa +
                ", wzrost=" + wzrost +
                ", dataUrodzenia=" + dataUrodzenia +
                '}';
    }

    public int wiek(){

        return LocalDate.now().getYear()-dataUrodzenia.getYear();
    }

    @Override
    public double getMeasure() {
        double ppm;
        if(getPlec()==Plec.K){
            ppm=655.1+(9.563*masa)+(1.85*wzrost)-(4.676*wiek());
        }
        else
            ppm=66.5+(13.75*masa)+(5.003*wzrost)-(6.775*wiek());
        return ppm;
    }
}
