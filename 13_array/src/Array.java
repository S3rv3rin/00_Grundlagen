public class Array {

    public static int vergleicheArrays(int[] a,int[] b){
        int counter = 0;

        for (int i = 0; i < a.length; i++ ) {
          for ( int ii = 0; ii < b.length; ii++) {
                if(a[i] == b [ii]) counter++;
          }
        }
        return counter;
    }


    public static void main(String[] args) {
        int [] a = {21,9,8,36,5};
        int [] b = {12,80,63,5};
        //Ergebnis = 1
        System.out.println(vergleicheArrays(a,b));

    }
}


