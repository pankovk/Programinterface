package progInt.lab2.part1;

public class Build {
    private String material;
    private int floorCount;
    private String developer;
    private String city;

    public Build(String material, int floorCount, String developer, String city) {
        this.material = material;
        this.floorCount = floorCount;
        this.developer = developer;
        this.city = city;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getFloorCount() {
        return floorCount;
    }

    public void setFloorCount(int floorCount) {
        this.floorCount = floorCount;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDeveloper() {
        return developer;
    }

    @Override
    public String toString() {
        return "Материал постройки: "
                + material + ", количество этажей: "
                + floorCount + ", застройщик: "
                + developer + ", город: "
                + city;
    }
}
