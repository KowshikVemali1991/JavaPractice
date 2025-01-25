public class Palendrome1000 {
    public static void main(String[] args) {
       for(int i=10; i<=1000; i++){
           int nmbr=i, sum=0;
           while (nmbr > 0) {
               int rem = nmbr % 10;
               sum = sum * 10 + (rem);
               nmbr = nmbr / 10;
           }
           if(i==sum){
               System.out.println("Number is Palendrome = " +i);
           }
        }
    }
}

