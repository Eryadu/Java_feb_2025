package mar15PolyMorAbstraction.Composition.Color;

public class Color {
    private String name;
    private TypeComposition type; // primary (red, yellow, blue), secondary (created by mixing two primary colors),
                         // tertiary (created by mixing a primary and secondary color), and neutrals (white, black, gray).
    private String cost;

    public Color(String name, TypeComposition type, String cost) {
        this.name = name;
        this.type = type;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeComposition getType() {
        return type;
    }

    public void setType(TypeComposition type) {
        this.type = type;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Color{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", cost='" + cost + '\'' +
                '}';
    }
}
