public class Palendrome1000WithWhile {
    public static void main(String[] args) {
        int i=10;
       while(i<=1000){
           int nmbr=i, sum=0;
           while (nmbr > 0) {
               int rem = nmbr % 10;
               sum = sum * 10 + (rem);
               nmbr = nmbr / 10;
           }
           if(i==sum){
               System.out.println("Number is Palendrome = " +i);
           }
           i++;
        }
    }
}

