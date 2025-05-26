import java.util.Arrays;
public class Practice{
    public static void main(String[]args) {
        int[] uuz = {1 , 3 , 12 , -12 , 0 , 23 , -19 , 12, 2 , 3};
        for(int i = 0; i < uuz.length-1; i++) {
            for(int j = 0; j< uuz.length-1-i; j++) {
                if(uuz[j] > uuz[j+1]) {
                    int term = uuz[j+1];
                    uuz[j+1] = uuz[j];
                    uuz[j] = term; 
                }
            }
        }
        System.out.println(Arrays.toString(uuz));
    }
}
