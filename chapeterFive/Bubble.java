package chapeterFive;

public class Bubble {
    public static void main(String []args){
        int[] numbs = {99, 765, -28, 0, 4, 49, 234, 7};
        int a, b, t, size;

        size = 8;

        System.out.println("Exibindo o array antes de ordenar");
        for (int i = 0; i < size; i ++){
            System.out.println(numbs[i]);
        }

        for (a = 1; a < size; a++){
            for (b = size - 1; b >= a; b --){
                if (numbs[b-1] > numbs[b]){
                    t = numbs[b-1];
                    numbs[b-1] = numbs[b];
                    numbs[b] = t;
                }
            }
        }
        System.out.println("Exibindo o array ordenado");
        for (int i = 0; i < size; i++) {
            System.out.println(numbs[i]);

        }
    }
}
