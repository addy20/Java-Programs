class Main {
  static long swap(long x,int i,int j)
  {
    if(((x>>i)&1)!=((x>>j)&1))
    {
     int mask=(1<<i)|(1<<j);
      x=x^mask;
    }
    
    return x;
    
  }
  static long reverse(long x,int wordsize,int mask)
  {
    x=swap((x&mask),1,0)<<(3*wordsize)|swap((x>>wordsize&mask),1,0)<<(2*wordsize)|swap((x>>2*wordsize&mask),1,0)<<(1*wordsize)|swap((x>>3*wordsize&mask),1,0)<<(0*wordsize);
  return x;
  }
  
  public static void main(String[] args) {
    long x=0b10010011;
    int wordsize=2;
    int mask=0b11;
    System.out.println(Long.toBinaryString(reverse(x,wordsize,mask)));
    

  }
}