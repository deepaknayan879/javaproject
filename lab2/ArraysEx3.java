class ArraysEx3{
static int getSorted(int a[])
{
 int i, k, t;
 for (i = 0; i < a.length / 2; i++) {
 t = a[i];
 a[i] = a[a.length - i - 1];
 a[a.length - i - 1] = t;
 }
 System.out.println("Reversed array is: \n");
 for (k = 0; k < a.length; k++) {
 System.out.println(a[k]);
 }
return k; }
  
 public static void main(String[] args)
 {
 int[] arr = { 10, 20, 30, 40, 50 };
 getSorted(arr);
 }
}