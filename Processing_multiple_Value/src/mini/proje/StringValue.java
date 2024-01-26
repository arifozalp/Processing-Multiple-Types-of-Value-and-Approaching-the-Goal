package mini.proje;

public class StringValue extends Value{
    private String String1;
    
    public StringValue(Object String1){
        try{
        this.String1=(String) String1;
        }catch(Exception a){
            this.String1=null;
        }
    }
    @Override
    public Object getter() {
        return String1;
    }
    
    @Override
    public Object addition(Object value) {
            if (value instanceof StringValue) {
            String operand = ((StringValue) value).String1;
            return new StringValue(String1 + operand);
        }
        return null;
    }

    @Override
    public Object multiply(Object value) {
        if (value instanceof StringValue) {
            String operand = ((StringValue) value).String1;
            StringBuilder result=new StringBuilder("");
            for (int i = 0; i < String1.length(); i++) {
                result.append(String1.charAt(i)+operand);
            }
            return new StringValue(result.toString());
        }
        return null;
    }
    @Override
    public Object subtract(Object value) {
    if (value instanceof StringValue) {
        String operand = ((StringValue) value).String1;

        int index = String1.lastIndexOf(operand);
        if (index != -1) {
            String result = String1.substring(0, index) + String1.substring(index + operand.length());
            return new StringValue(result);
        }
    }
    return null;
}

    @Override
    public int distance(Object value1, Object value2) {
        String str1 = (value1.toString());
        String str2 = (value2.toString());
        int n1 = str1.length();
        int n2 = str2.length();
        int n = Math.max(n1, n2);

        int distance = 0;
        for (int i=0; i<n; i++) {
            char ch1 = (i < n1 ? str1.charAt(i) : ' ');
            char ch2 = (i < n2 ? str2.charAt(i) : ' ');

            distance += Math.abs(ch1 - ch2);
        }
            return distance;
    }
    
    @Override
    public String toString() {
        return String.valueOf(String1);
    }
}