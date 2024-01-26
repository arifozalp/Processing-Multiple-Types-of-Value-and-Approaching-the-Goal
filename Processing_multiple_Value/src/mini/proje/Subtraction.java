package mini.proje;

public class Subtraction extends Operator{

    @Override
    public Object calculate(Object value1, Object value2) {
        if (value1 instanceof Value && value2 instanceof Value) {
            return ((Value) value1).subtract(value2);
        }
        return null;
    }

    @Override
    public String toString() {
        return "-";
    }
    
}
