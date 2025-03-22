package mar15PolyMorAbstraction.Composition.Color;

public class TypeComposition {
    private String Primary;
    private String Secondary;
    private String Tertiary;
    private String Neutral;

    public TypeComposition(String primary, String secondary, String tertiary, String neutral) {
        Primary = primary;
        Secondary = secondary;
        Tertiary = tertiary;
        Neutral = neutral;
    }

    public String getPrimary() {
        return Primary;
    }

    public void setPrimary(String primary) {
        Primary = primary;
    }

    public String getSecondary() {
        return Secondary;
    }

    public void setSecondary(String secondary) {
        Secondary = secondary;
    }

    public String getTertiary() {
        return Tertiary;
    }

    public void setTertiary(String tertiary) {
        Tertiary = tertiary;
    }

    public String getNeutral() {
        return Neutral;
    }

    public void setNeutral(String neutral) {
        Neutral = neutral;
    }

    @Override
    public String toString() {
        return "TypeComposition{" +
                "Primary='" + Primary + '\'' +
                ", Secondary='" + Secondary + '\'' +
                ", Tertiary='" + Tertiary + '\'' +
                ", Neutral='" + Neutral + '\'' +
                '}';
    }
}
