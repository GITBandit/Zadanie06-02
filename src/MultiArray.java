import java.util.Random;

public class MultiArray {

    private int[][] tablica;

    public MultiArray(int n, int m) {
        tablica = new int[n][m];

        Random random = new Random();

        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                tablica[n-1][m-1] = random.nextInt();
            }
        }
    }


    public void setTablica(int[][] tablica) {
        this.tablica = tablica;
    }

    void randomize(){

        Random random = new Random();

        for (int i = 0; i<tablica.length; i++){
            for (int j = 0; j<tablica[i].length; j++){
                tablica[i][j] = random.nextInt();
            }
        }

    }

    void pritLength(){
        for(int i = 0; i<tablica.length; i++) {
            System.out.println(tablica.length + " " + tablica[i].length);
        }
    }


    int findMax() {
        int x = Integer.MIN_VALUE;

        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {

                if (tablica[i][j] > x) {
                    x = tablica[i][j];
                }
            }

        }
        return x;
    }

    int findMin(){
        int x = Integer.MAX_VALUE;

        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {

                if (tablica[i][j] < x) {
                    x = tablica[i][j];
                }
            }

        }
        return x;
    }

    void print(){
        for (int i = 0; i<tablica.length; i++){
            System.out.println();
            for (int tab : tablica[i]){
                System.out.print(tab + " ");
            }
        }

    }

}
