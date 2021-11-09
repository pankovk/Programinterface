package progInt.lab6;

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

    public String getDeveloper() {
        return developer;
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
}
