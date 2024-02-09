package Ch11;

public class Pizza {;
    private String FLAVOR, SIZE;
    private int estado = 0; //0 pedido 1 servido
    private static int pedidas = 0;
    private static int servidas = 0;
    public Pizza (String flavor, String size) {
        this.FLAVOR = flavor;
        this.SIZE = size;
        Pizza.pedidas++;
    }
    public String toString() {
        String como;
        if (estado == 0) {
            como = "pedida";
        } else {
            como = "servida";
        }
        return "pizza " + this.FLAVOR + " " + this.SIZE + ", " + como;
    }
    public void sirve() {
        if (estado == 0) {
            Pizza.servidas++;
            this.estado = 1;
        } else {
            System.out.println("esa pizza ya se ha servido");
        }
    }
    public static int getTotalPedidas() {
        return Pizza.pedidas;
    }
    public static int getTotalServidas() {
        return Pizza.servidas;
    }
    public static void main(String[] args) {
        Pizza p1 = new Pizza("margarita", "mediana");
        Pizza p2 = new Pizza("funghi", "familiar");
        p2.sirve();
        Pizza p3 = new Pizza("cuatro quesos", "mediana");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p2.sirve();
        System.out.println("pedidas: " + Pizza.getTotalPedidas());
        System.out.println("servidas: " + Pizza.getTotalServidas());
    }
}
