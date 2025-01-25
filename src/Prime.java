public class Prime {
    public static void main(String[] args) {
        int n=5, count=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                count = count+1;// count++;//count+=1;

            }
        }
        if(count == 0){
            System.out.println(n +" is prime number");
        } else{
            System.out.println(n +" is not a prime number");
        }
    }
}
