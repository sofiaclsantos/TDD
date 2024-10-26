public class Calculadora {

    private double v1, v2;

    public double getV2() {
        return v2;
    }

    public void setV2(double v2) {
        this.v2 = v2;
    }

    public double getV1() {
        return v1;
    }

    public void setV1(double v1) {
        this.v1 = v1;
    }

    public double soma() {
        return this.v1 + this.v2;
    }

    public double diferenca() {
        return this.v1 - this.v2;
    }

    public double divisao() {
        if (this.v2 == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida");
        }
        return this.v1 / this.v2;
    }

    public double produto() {
        return this.v1 * this.v2;
    }




}
