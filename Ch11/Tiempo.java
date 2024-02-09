package Ch11;

public class Tiempo {
    private int totalSec = 0;
    public Tiempo(int h, int m, int s) {
        this.totalSec = h*3600 + m*60 + s;
    }
    public int suma(int h, int m, int s) {
        return this.totalSec + h*3600 + m*60 + s;
    }
    public int suma(Tiempo that) {
        return this.totalSec + that.totalSec;
    }
    public int resta(int h, int m, int s) {
        return this.totalSec - h*3600 + m*60 + s;
    }
    public int resta(Tiempo that) {
        return this.totalSec - that.totalSec;
    }
    public String toString() {
        int h = this.totalSec/3600;
        int m = (this.totalSec - h * 3600) / 60;
        int s = this.totalSec - (h*3600+m*60);
        return String.format("%d horas, %d minutos y %d segundos", h, m, s);
    }
    public static void main(String[] args) {
        Tiempo hey = new Tiempo(3, 15, 40);
        System.out.println(hey);
    }
}
