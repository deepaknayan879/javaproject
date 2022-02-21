class arraysEx4{
   public static int modifyArray(int a[])
    {
        int n=a.length;
        if (n == 0 || n == 1) {
            return n;
     }
     int[] temp = new int[n];
      int j = 0;
      for (int i = 0; i < n - 1; i++) {
      if (a[i] != a[i + 1]) {
      temp[j++] = a[i];
            }
        }
  
        temp[j++] = a[n - 1];
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }
  
        return j;
    }
    public static void main(String[] args)
    {
        int a[] = { 1,1,2,2,2 };
        int n = a.length;
  
        n = modifyArray(a);
        for (int i =n-1; i>=0; i--)
            System.out.print(a[i] + " ");
    }
}