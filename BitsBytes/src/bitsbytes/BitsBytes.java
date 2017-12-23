package bitsbytes;
import java.util.BitSet;
import java.util.Scanner;



public class BitsBytes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str = Integer.toBinaryString(n);
        BitSet bs = new BitSet();
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)=='1')
                bs.set(i);
        }
       System.out.println("bitset of elements"+ bs);
        byte by[]=bs.toByteArray();
        bs= fromByteArray(by);
  System.out.println("The value of bitset = "+"\r\n"+bs);
        
    }
        
    public static BitSet fromByteArray(byte[] bytes) {
    BitSet bits = new BitSet();
    for (int i = 0; i < bytes.length * 8; i++) {
      if ((bytes[bytes.length - i / 8 - 1] & (1 << (i % 8))) > 0) {
        bits.set(i);
      }
    }
    return bits;
  }
}
        
        
     

