public class factorial {
    public static void main(String[] args){
        int n,fact,i;
        n=8;
        fact=1;
        for(i=n;i>=1;i--){
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+"= "+fact);


        //sum of digits in a number
        int num, dig, sum = 0;
        num = 2331;
        while(num > 0)
        {
            dig = num % 10;
            sum = sum + dig;
            num = num / 10;
        }
        System.out.println("Sum of Digits: "+sum);

        //prime number
        int p = 31;
        int count = 0;
        if (p <= 1) {
            System.out.println("The number is not prime");
            return;
        }

        for (int j = 1; j <= p / 2; j++) {
            if (p % j == 0) {
                count++;
            }
        }
        if (count > 1) {
            System.out.println("The number is not prime");
        }
        else {
            System.out.println("The number is prime");
        }
    //reverse of a number
        int a,res=0;
        int m = 153;
        while(m!=0)
        {
            a=m%10;
            res=(res*10)+a;
            m=m/10;
        }
        System.out.println("reverse of a number is "+res);

    }
}
