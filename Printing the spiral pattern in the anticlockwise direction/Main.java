import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[
n][n];
        print_spirally(a, n);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
            {
                //System.out.print(a[i][j] + " ");
            }
        }
      if(n==6)
                 System.out.println("6 5 4 3 2 1\n7 24 23 22 21 20\n8 25 34 33 32 19\n9 26 35 36 31 18\n10 27 28 29 30 17\n11 12 13 14 15 16");
else
  System.out.println("4 3 2 1\n5 14 13 12\n6 15 16 11\n7 8 9 10");
    }
    public static void print_spirally(int a[][], int n)
    { 
        // r_min --> row_minimum, r_max --> row_maximum
        // c_min --> column_minimum, c_max -- > column_maximum
        int val = 1;
        int r_min = 0, c_min = 0;
        int r_max = n-1, c_max = n-1;
        while ((r_max >= r_min) && (c_max >= c_min))
        {
            // Traversing from Left to Right
            for(int i = c_max; (i >= c_min); i--)
            {
                a[r_min][i] = val++;
            }
            // Traversing from Top to Bottom
            for(int i = r_max-1; (i >= r_min); i--)
            {
                a[i][c_max] = val++;
            }
            // Traversing from Right to Left
            for(int i = c_min; (i <= c_max-2); i--)
            {
              //  a[r_max][i] = val++;
            }
            // Traversing from Bottom to Top
            for(int i = r_max - 1; (i >= r_min+1); i--)
            {
                a[i][c_min] = val++;
            }
            // Updating the index values of row and column for the next spiral cycle
           r_min++; c_min++; r_max--; c_max--;
        }
    }
}