package mini.proje;


public class IntegerValue extends Value {
    private int number;
    
    public IntegerValue(Object number){
        try{
        this.number=(Integer) number;
        }catch(Exception a){
            this.number=0;
        }
        
    }
    
    public Object getter() {
        return number;
    }
    
    @Override
    public Object addition(Object value) {
        if (value instanceof IntegerValue) {
            int operand = ((IntegerValue) value).number;
            return new IntegerValue(number + operand);
        }
        return null;
    }

    @Override
    public Object multiply(Object value) {
         if (value instanceof IntegerValue) {
            int operand = ((IntegerValue) value).number;
            return new IntegerValue(number * operand);
        }
        return null;
    }

    @Override
    public Object subtract(Object value) {
        if (value instanceof IntegerValue) {
            int operand = ((IntegerValue) value).number;
            return new IntegerValue(number - operand);
        }
        return null;
    }
    @Override
    public String toString() {
        if(number==Integer.MAX_VALUE)
            return "Pozitive_Infinite";
        else if(number ==Integer.MIN_VALUE)
            return "Negative_Infinite";
        else
        return String.valueOf(number);
    }

    @Override
    public int distance(Object value1, Object value2) {
            int num1 = (int)((IntegerValue) value1).getter();
            int num2 = (int) ((IntegerValue) value2).getter();
            
            if(Math.abs(num1 - num2)==Integer.MIN_VALUE)
                return Integer.MAX_VALUE;
            return Math.abs(num1 - num2);
    }
}