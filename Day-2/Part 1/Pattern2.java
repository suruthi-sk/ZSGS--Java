/* Pattern 2

RRRR
R  R
RRRR
R R
R  R

*/

public class Pattern2{
    public static void main(String[] args){
        int n = 5; 

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++){ 
                if (i == 0 || i == n / 2){ 
                    System.out.print("R");
                }else if (j == 0){ 
                    System.out.print("R");
                }else if ((i < n / 2) && (j == n - 2)){
                    System.out.print("R");
                }else if ((i > n / 2) && (j == i - (n / 2))){
                    System.out.print("R");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
