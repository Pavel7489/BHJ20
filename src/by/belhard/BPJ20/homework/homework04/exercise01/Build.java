package by.belhard.BPJ20.homework.homework04.exercise01;

public class Build {
public static final String DEFAULT_ADRES="Minsk, Gusovskogo 63";
   private  String adres;
    private    int floats;

    private   int buildYear;

    private  String material;

    private   Lift lift;
    public Build(String adres, int floats, int buildYear, String material, Lift lift){
        this.adres=adres;
        this.floats=floats;
        this.buildYear=buildYear;
        this.material=material;
        this.lift=lift;
    }
public Build(String adres){
        this(adres, 5, 2005, "brick", Lift.YES);
}
public void consistOf(){
    System.out.println("building on"+adres+"consist of"+ floats);
}

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getFloats() {
        return floats;
    }

    public void setFloats(int floats) {
        this.floats = floats;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Lift getLift() {
        return lift;
    }

    public void setLift(Lift lift) {
        this.lift = lift;
    }
}
