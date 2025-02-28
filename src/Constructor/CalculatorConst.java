package Constructor;

public class CalculatorConst {
    float x,y;

    CalculatorConst(float x, float y)
    {
        this.x = x;
        this.y = y;
    }
    public float sum ()
    {
        float addition  = x + y;
        return addition;
    }
    public float sub ()
    {
        float subtraction  = x - y;
        return subtraction;
    }
    public float mul ()
    {
        float multiplication  = x * y;
        return multiplication;
    }
    public float div ()
    {
       float division  = x / y;
        return division;
    }
    public float mod ()
    {
        float modulus = x % y;
        return modulus;
    }
}
