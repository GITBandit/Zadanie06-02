public class Main {

    public static void main(String[] args) {

        MultiArray array = new MultiArray(4,3);

        array.randomize();



        System.out.println("Najwyższa wartość to: " + array.findMax());
        System.out.println("Najniższa wartość to: " + array.findMin());

//        array.pritLength();

        array.print();
    }
}
