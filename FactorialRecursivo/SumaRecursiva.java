public class SumaRecursiva {
public static int sumaRecursiva(int num) {
        System.out.println("En SumaRecursiva, con num = " + num);
        if(num == 0){
            System.out.println("En SumaRecursiva en el caso base, num " +  num);
            return 0;
        } else {
            System.out.println("Invocando SumaRecursiva con num = " + (num-1));
            System.out.println();
            return num + sumaRecursiva(num - 1);
        }
    }
    
    public static void main(String[] args){
        int numero = 6;
        int suma;
    
        System.out.println("Suma Recursiva hasta el numero " + numero);
        suma = sumaRecursiva(numero);
        System.out.println("La suma es " + numero + " es: " + suma);
    }
}
