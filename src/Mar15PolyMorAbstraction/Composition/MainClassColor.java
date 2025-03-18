package Mar15PolyMorAbstraction.Composition;

import java.lang.reflect.Type;

public class MainClassColor {
    public static void main(String[] args) {
        TypeComposition typeComposition = new TypeComposition("Red", "Red + Yellow", "Red +Yellow +Black", "Grey");
        Color color = new Color("Primary Color", typeComposition,"$299.9");
        System.out.println(color);

        // to search particular color
        System.out.println(color.getType().getPrimary());
    }
}
