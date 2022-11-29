public class whileLoop {

    public static void main(String[] args) {
        int init = 1;
        while(init <= 20){
            if (init % 2 != 0){
                System.out.println("Odd number -> " + init);
            }
            else if (init % 2 == 0){
                System.out.println("Even number -> " + init);
            }
            init ++;
        }
    }
}
