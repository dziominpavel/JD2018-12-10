package by.it.dziomin.jd01_09.jd01_09_withoutNewInstance;

public abstract class Var implements Operation {


    public abstract String toString();

    public boolean isScalar(){
        return false;
    }
    public boolean isVector(){
        return false;
    }
    public boolean isMatrix(){
        return false;
    }


    @Override
    public Var add(Var other) {
        System.out.println("Сложение " + this + " с " + other + " невозможно!");
        return null;
    }

    @Override
    public Var sub(Var other) {
        System.out.println("Вычитание " + this + " с " + other + " невозможно!");
        return null;
    }

    @Override
    public Var mul(Var other) {
        System.out.println("Умножение " + this + " с " + other + " невозможно!");
        return null;
    }

    @Override
    public Var div(Var other) {
        System.out.println("Деление " + this + " с " + other + " невозможно!");
        return null;
    }

    static Var createVar(String operand) {
        operand = operand.trim();
        if (operand.matches(Patterns.SCALAR))
            return new Scalar(operand);
        if (operand.matches(Patterns.VECTOR))
            return new Vector(operand);
        if (operand.matches(Patterns.MATRIX))
            return new Matrix(operand);

        return null;
    }
}
