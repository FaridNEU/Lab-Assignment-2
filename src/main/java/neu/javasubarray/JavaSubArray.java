package neu.javasubarray;
import java.util.Scanner;
/**
 *
 * @author Farid
 */
public class JavaSubArray {

    public static void main(String[] args) {
        int counter = 0;
        int n;
        Scanner myObj = new Scanner(System.in);
        n = myObj.nextInt();
        int[] array = new int[n];
        for (int i=0; i<n; i++){
            array[i] = myObj.nextInt();
        }
        for (int subArrayLength=1; subArrayLength<=n; subArrayLength++){
            for (int j=0; j<=n-subArrayLength; j++){
                int sum = 0;
                for (int l=j; l<j+subArrayLength; l++)
                    sum += array[l];
                if(sum < 0) counter += 1;
            }
        }
        System.out.println(counter);
        myObj.close();
    }
}
