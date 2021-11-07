class Main {
  static long multiply(long x,long y)
  {
   int k=0;long res=0;
   while(x!=0)
   {
     if((x&1)!=0)
     {
       y=y<<k;
       res=sum(res,y);
     }
     k+=1;
     x=x>>1;
   }
   return res;
  }
  static long sum(long res,long y)
  {
    while(y!=0)
    {
      long carry=res&y;
      res=res^y;
      y=carry<<1;
    }
    return res;
  }
  public static void main(String[] args) {
    long x=0b1101;
    long y=0b1001;
    System.out.println(multiply(x, y));
  }
}