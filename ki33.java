import java.util.*;


public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
   int n=in.nextInt();
   int[][] arr=new int[n][n];
   for(int i=0;i<n;i++){
     for(int j=0;j<n;j++){
       arr[i][j]=in.nextInt();
     }
   }
   int c=0;
    for(int i=0;i<n;i++){
     for(int j=0;j<n;j++){
       int kk=0;
       if(i-1<0||arr[i-1][j]==0){
         kk++;
       }
       if(j-1<0||arr[i][j-1]==0){
         kk++;
       }
       if(j+1==n||arr[i][j+1]==0){
         kk++;
       }
       if(i+1==n||arr[i+1][j]==0){
         kk++;
       }
      if(kk==4&&arr[i][j]==1){
          c++;
      }

     }}

    System.out.print(c);
     
  }
  
}
