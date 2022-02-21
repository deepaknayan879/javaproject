import java.util.Scanner;
class ArraysEx1{
public static int getSecondSmallest(int[] a){
  int tem;
  for(int i=0;i<a.length;i++){
  for(int j=i+1;j<a.length;j++){
  if(a[i]>a[j]){
  tem=a[i];
  a[i]=a[j];
  a[j]=tem;
  }
  }
  }
  return a[1];
  }
  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int ar[]=new int[n];
  for(int i=0;i<n;i++){
  ar[i]=sc.nextInt();
  }
  System.out.println("Second smallest"+getSecondSmallest(ar));
  }

}