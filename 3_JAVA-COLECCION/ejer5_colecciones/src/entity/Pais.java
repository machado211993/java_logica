package entity;

public class Pais {
    String pais;

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Pais() {
    }

    public Pais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Pais [pais=" + pais + "]";
    }

}
