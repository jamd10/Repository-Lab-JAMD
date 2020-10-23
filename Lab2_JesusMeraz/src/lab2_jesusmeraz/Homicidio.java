package lab2_jesusmeraz;

public class Homicidio {

    private String lugar;
    private String desc;
    private String tipo;
    private String detec;
    private String estado;

    public Homicidio() {

    }

    public Homicidio(String lugar, String desc, String tipo, String detec, String estado) {
        this.lugar = lugar;
        this.desc = desc;
        this.tipo = tipo;
        this.detec = detec;
        this.estado = estado;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getLugar() {
        return lugar;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setDetec(String detec) {
        this.detec = detec;
    }

    public String getDetec() {
        return detec;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Lugar: " + lugar + ", descripcion:" + desc + ", Tipo:" + tipo + ", Detective a cargo:" + detec + ", Estado:" + estado;
    }
}
