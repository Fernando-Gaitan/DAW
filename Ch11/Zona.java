package Ch11;
import java.util.Scanner;
public class Zona {
    private int entradasPorVender;
    public Zona(int n){
        entradasPorVender = n;
    }
    public int getEntradasPorVender() {
        return entradasPorVender;
    }
    public void vender(int n) {
        if (this.entradasPorVender == 0) {
            System.out.println("Lo siento, las entradas para esa zona están agotadas.");
        } else if (this.entradasPorVender < n) {
            System.out.println("Sólo me quedan " + this.entradasPorVender + " entradas para esa zona.");
        }
        if (this.entradasPorVender >= n) {
            entradasPorVender -= n;
            System.out.println("Aquí tiene sus " + n + " entradas, gracias.");
        }
    }
    public static void main(String[] args) {
        Zona principal = new Zona(1000), compraVenta = new Zona(200), vip = new Zona(25);
        Scanner in = new Scanner(System.in);
        boolean bien = false;
        int x = -1, cant = -1;
        String error;
        while (true) {
            System.out.print("1. Mostrar número de entradas libres\n2. Comprar entradas\n3. Salir\n");
            while (!bien) {
                if (in.hasNextInt()){
                    x = in.nextInt();
                    if (x == 1 || x == 2 || x == 3) {
                        bien = true;
                    } else {
                        System.err.printf("%d no es un número válido, prueba de nuevo: ", x);
                    }
                } else {
                    error = in.next();
                    System.err.printf("%s no es un número, prueba de nuevo: ", error);
                }
            }
            bien = false;
            if (x == 1) {
                System.out.printf("%d entradas principal, %d entradas de compra-venta, %d entradas VIP.\n", principal.entradasPorVender, compraVenta.entradasPorVender, vip.entradasPorVender);
            } else if (x == 2) {
                System.out.println("¿Qué entradas quieres comprar?:\n1. Principal\n2. Compra-venta\n3. VIP\n4. Salir\n");
                while (!bien) {
                    if (in.hasNextInt()){
                        x = in.nextInt();
                        if (x == 1 || x == 2 || x == 3 || x == 4) {
                            bien = true;
                        } else {
                            System.err.printf("%d no es un número válido, prueba de nuevo: ", x);
                        }
                    } else {
                        error = in.next();
                        System.err.printf("%s no es un número, prueba de nuevo: ", error);
                    }
                }
                bien = false;
                System.out.println("¿Cuántas quieres comprar? ");
                while (!bien) {
                    if (in.hasNextInt()){
                        cant = in.nextInt();
                        if (cant > 0) {
                            bien = true;
                        } else {
                            System.err.printf("%d no es un número válido, prueba de nuevo: ", cant);
                        }
                    } else {
                        error = in.next();
                        System.err.printf("%s no es un número, prueba de nuevo: ", error);
                    }
                }
                bien = false;
                if (x == 1) {
                    principal.vender(cant);
                } else if (x ==  2) {
                    compraVenta.vender(cant);
                } else if (x ==  3) {
                    vip.vender(cant);
                } else {
                    in.close();
                    return;
                }
            } else {
                in.close();
                return;
            }
        }
    }
}
        