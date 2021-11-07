class M {
   static long multiply(long x,long y){
    long r=0;
    long k=0;
    while (x!=0){
      if((x&1)!=0){
        r=sum(r,y<<k);
      }
      k++;
      x=x>>1;
      
      
    }
    return r;
  }
   static long sum(long r,long y){
    long carry=0;
    while (y!=0){
      carry=r&y;
      r=r^y;
      y=carry<<1;
    }
    return r;
  }
   
  public static void main(String[] args) {
    long x=0b1101;
    long y=0b1001;
    System.out.println(Long.toBinaryString(multiply(x,y)));
  }
}