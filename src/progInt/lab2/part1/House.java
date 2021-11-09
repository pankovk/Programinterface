package progInt.lab2.part1;

public class House extends Build {
    Type type;
    private int flatCount;
    private String date;

    public House(String material, int floorCount, String developer, String city, Type type, int flatCount, String date) {
        super(material, floorCount, developer, city);
        this.type = type;
        this.flatCount = flatCount;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public String toString() {
        return super.toString() + ", код: "
                + type.getId() + ", наименование: "
                + type.getName() + ", количество квартир: "
                + flatCount + ", дата заселения: "
                + date;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getFlatCount() {
        return flatCount;
    }

    public void setFlatCount(int flatCount) {
        this.flatCount = flatCount;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
