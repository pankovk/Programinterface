package progInt.lab6;

public class House extends Build {
    private int id;
    private String name;
    private int flatCount;
    private String date;

    public House(String material, int floorCount, String developer, String city, int id, String name, int flatCount, String date) {
        super(material, floorCount, developer, city);
        this.id = id;
        this.name = name;
        this.flatCount = flatCount;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFlatCount() {
        return flatCount;
    }

    public void setFlatCount(int flatCount) {
        this.flatCount = flatCount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
