import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] array={8,6,4,5,2,3};//default array
        for (int i=0;i<array.length;i++){
            for (int j=array.length-1;j>i;j--){ //begin from end for checking
                if (array[j-1]>array[j]){
                    //swap operation
                    int temp;
                    temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;



                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
