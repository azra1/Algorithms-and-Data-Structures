//Hackerearth problem
/*Ankit has a set of numbers and has recently studied set theory. He has created a power set of this set and is writing a program to compute sum of all elements of all the subsets in power set. 
Power set of a set S is defined as set of all possible subsets of S.

Set S consist of all the number from 1 to N.

You need to calculate this sum for a given n.

Example:
Given N=3,
S={1,2,3}
P(S) = {{1}, {2}, {3}, {1,2}, {1,3}, {2,3}, {1,2,3}}
answer = (1)+(2)+(3)+(1+2)+(1+3)+(2+3)+(1+2+3)
= 24*/
//Solution
import java.util.*;
class PowerSet {
    public static void main(String args[] ) throws Exception {
        int N;
        long sum=0;
        long n;
        Scanner sc= new Scanner(System.in);
        N=sc.nextInt();
        n=(long)Math.pow(2,N-1);
        sum=(N*(N+1))/2;
        sum=sum*n;
        System.out.println(sum);
  }
}
