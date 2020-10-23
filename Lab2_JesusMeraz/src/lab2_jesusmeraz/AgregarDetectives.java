package lab2_jesusmeraz;

public class AgregarDetectives {

    // atributos
    private String name;
    private int edad;
    private String nacionalidad;
    private int a_laborales;
    private int nivel;

    public AgregarDetectives() {

    }

    public AgregarDetectives(String name, int edad, String nacionalidad, int a_laborales, int nivel) {
        this.name = name;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.a_laborales = a_laborales;
        this.nivel = nivel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setA_laborales(int a_laborales) {
        this.a_laborales = a_laborales;
    }

    public int getA_laborales() {
        return a_laborales;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    //MA
    @Override
    public String toString() {
        return "Nombre: " + name + ", edad:" + edad + ", Nacionalidad:" + nacionalidad + ", Años laborales:" + a_laborales + ", Nivel:" + nivel;
    }
}
