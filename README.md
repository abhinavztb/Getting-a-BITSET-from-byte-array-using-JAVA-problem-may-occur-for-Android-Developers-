# Getting-a-BITSET-from-byte-array-using-JAVA-problem-may-occur-for-Android-Developers
# For Netbeans 8.0.2 users They can download the project directly into there Netbeans Project Directory and for others -Bitsbytes.java file 
 
 # ****Code****
 import java.util.BitSet;
import java.util.Scanner;



public class BitsBytes {

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
