
package mini.proje;

import static mini.proje.months.*;

enum months{
    January,February,March,April,May,June,July,August,September,October,November,December
}

public class MonthValue extends Value {
    private months mainvalue;
    private final Object [] month= {December,January,February,March,April,May,June,July,August,September,October,November};
    
    public MonthValue(Object mainvalue){
        try{
        this.mainvalue=(months) mainvalue;
        }catch(Exception a){
            this.mainvalue=null;
        }
    }
    public Object getter() {
        return mainvalue;
    }
    private int monthToInteger(Object a){
         for (int i = 0; i < month.length; i++) {
            if(month[i]==a)
                return i;
        }
        return 0;
    }
    
    private Object integerToMonth(int a){
        for (int i = 0; i < month.length; i++) {
            if(i==a)
                return month[i];
        }
        return null;
   }
    
    
    @Override
    public Object addition(Object value) {
        if (value instanceof MonthValue) {
            int operand = monthToInteger(((MonthValue) value).mainvalue);
            return new MonthValue(integerToMonth((monthToInteger(mainvalue) + operand)%12));
        }
        return null;
    }

    @Override
    public Object multiply(Object value) {
        if (value instanceof MonthValue) {
            int operand = monthToInteger(((MonthValue) value).mainvalue);
            return new MonthValue(integerToMonth((monthToInteger(mainvalue) * operand)%12));
        }
        return null;
    }

    @Override
    public Object subtract(Object value) {
        if (value instanceof MonthValue) {
            int operand = monthToInteger(((MonthValue) value).mainvalue);
            int result=monthToInteger(mainvalue) - operand;
            if(result>=-11&&result<=0)result+=12;
            return new MonthValue(integerToMonth((result)%12));
        }
        return null;
    }
    @Override
    public String toString() {
        return String.valueOf(mainvalue);
    }
    
    @Override
    public int distance(Object value1, Object value2) {
        int num1 = monthToInteger(((MonthValue) value1).getter());
        int num2 = monthToInteger(((MonthValue) value2).getter());
        return Math.abs(num1 - num2);
    }
    
}
