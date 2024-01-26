package mini.proje;

import java.util.ArrayList;

public abstract class Value {

    private Object value;
    private int distance = Integer.MAX_VALUE;
    private String output;
    ArrayList<String> temp = new ArrayList<>();

    public abstract Object addition(Object value);

    public abstract Object multiply(Object value);

    public abstract Object subtract(Object value);

    public abstract Object getter();

    public abstract int distance(Object value1, Object value2);

    public void run(Value[] values, Value target) {
        ArrayList<Value> controlArray = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            if (values[i].getClass() == target.getClass()) {
                if (values[i].getter() != null) {
                    controlArray.add(values[i]);
                }
            }
        }
        Value[] newValues = controlArray.toArray(new Value[0]);
        if (target.getter() != null) {
            arrayCreator(newValues, target);
        }

        System.out.println("Distance: " + distance);
        System.out.println("Target: " + target.getter());
        System.out.println("Closest: " + value);
        System.out.println(output + " = " + value);
        System.out.println("-------------------------------------\n");
}

    public void arrayCreator(Value[] values, Value target) {
        for (int i = 1; i <= values.length; i++) {
            Value[] subset = new Value[i];
            boolean[] used = new boolean[values.length];
            if (permutations(values, subset, used, 0, target)) {
                break;
            }
        }
    }

    public boolean permutations(Value[] arr, Value[] subset, boolean[] used, int index, Value desiredOutput) {
        if (index == subset.length) {
            temp.clear();
            return solver(subset, desiredOutput, true);
        }
        for (int i = 0; i < arr.length; i++) {
            if (!used[i]) {
                subset[index] = arr[i];
                used[i] = true;
                permutations(arr, subset, used, index + 1, desiredOutput);
                used[i] = false;

            }
        }
        return false;
    }

    //solver
    public boolean solver(Value[] values, Value desiredOutput, Boolean flag) {
        if (values.length == 1) {
            if (temp.isEmpty()) {
                temp.add("(" + values[0].toString() + ")");
            }
            if (distance(values[0], desiredOutput) < distance) {
                distance = distance(values[0], desiredOutput);
                value = values[0];
                output = String.join("", temp);
            }
            if (distance == 0) {
                return true;
            }
            return false;
        }
        Operator[] operators = {new Addition(), new Subtraction(), new Multiplication()};
        for (Operator operator : operators) {
            if (flag) {
                temp.add(("(".repeat(values.length - 1)) + values[0].toString());
                flag = false;
            }
            Value result = (Value) operator.calculate(values[0], values[1]);
            if (result != null) {
                Value[] newvalues1 = new Value[values.length - 1];
                newvalues1[0] = result;
                if (values.length >= 2) {
                    for (int i = 2; i < values.length; i++) {
                        newvalues1[i - 1] = values[i];
                    }
                    temp.add(operator.toString() + values[1].toString() + ")");
                    solver(newvalues1, desiredOutput, false);
                    if (distance == 0) {
                        return true;
                    } else {
                        temp.remove(temp.size() - 1);
                    }
                }
            }
        }
        return false;
    }
}
