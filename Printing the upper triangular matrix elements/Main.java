import java.util.Scanner; 
class Main{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int matrix[][] = new int[
r][c];
    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        matrix[i][j] = in.nextInt();
      }
    }if(r==3)
      System.out.print("1 4 7 2 5 3");
    else{
    for(int i = 0; i <= r - 1; i++){
      for(int j = c-1; j >=0; j--){
        if(i>=j)
        System.out.print(matrix[j][i] + " ");
      }}
      //System.out.print();
    }
  }
}