package tnsjavaprojectday3;

public class oddeven {
	public void oddandeven(int x) {
		
		if(x%2==0) {
			System.out.println("even");
		}else if(x%2!=0){
			System.out.println("odd");
		}
	}
	
	public void prime(int num) {
	       for (int n = 2; n <= 10; n++) {
	            int count = 0;

	            for (int i = 1; i <= n; i++) {
	                if (n % i == 0)
	                    count++;
	            }

	            if (count == 2)
	                System.out.println(n);
	        }
	}
	
	public void primeornot(int n) {
		
	  int count = 0;

      for (int j = 1; j <= n; j++) {
          if (n % j == 0)
              count++;
      }

      if (count == 2)
          System.out.println("Prime number");
      else
          System.out.println("Not a prime number");
  }
	
	public void armstrong(int n) {
		
        int original = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum = sum + (digit * digit * digit);
            n = n / 10;
        }

        if (sum == original)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    
	}
	
	public void palindrome(int n) {
		   int original = n;
	        int reverse = 0;

	        while (n > 0) {
	            int digit = n % 10;
	            reverse = reverse * 10 + digit;
	            n = n / 10;
	        }
	        
            System.out.println("reverse of num "+ "= " + reverse);


	        if (reverse == original)
	            System.out.println("Palindrome");
	        else
	            System.out.println("Not a palindrome");  
	       
	    }
	
	
	public void reverse(String str) {
		
	
	       String reverse = "";

	        for (int i = str.length() - 1; i >= 0; i--) {
	            reverse = reverse + str.charAt(i);
	        }

	        System.out.println("Reverse: " + reverse);
	    }
	
	public void fibonacci(int n) {
		 int a = 0;
	        int b = 1;

	        for (int i = 1; i <= n; i++) {
	            System.out.println(a + " ");

	            int c = a + b;
	            a = b;
	            b = c;
	        }
	}
	public void factorial(int n) {
		 int fact = 1;

	        for (int i = 1; i <= n; i++) {
	            fact = fact * i;
	        }

	        System.out.println("Factorial = " + fact);
	    }
	
	public void largestofthree() {
		
		int a = 12;
        int b = 45;
        int c = 8;
	
        if (a >= b && a >= c)
            System.out.println(a + " is largest");
        else if (b >= a && b >= c)
            System.out.println(b + " is largest");
        else
            System.out.println(c + " is largest");
	
	}
	
	public void sumofnum(int n) {
		
		 int sum = 0;

	        for (int i = 1; i <= n; i++) {
	            sum = sum + i;
	        }

	        System.out.println("Sum = " + sum);
	}
	
	public void primesum() {
		
		  int count = 0;
	        int sum = 0;
	        int n = 2;

	        while (count < 10) {
	            int factors = 0;

	            for (int i = 1; i <= n; i++) {
	                if (n % i == 0)
	                    factors++;
	            }

	            if (factors == 2) {
	                sum = sum + n;
	                count++;
	            }

	            n++;
	        }

	        System.out.println("Sum of first 10 prime numbers = " + sum);
			System.out.println(" ");

	}
	
	public void pypattern() {
		
        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
		System.out.println(" ");

	}
	
	public void sqpattern() {
		
		for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= 4; j++) {

                if (i == 1 || i == 4 || j == 1 || j == 4)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.println();
        }
	}
}

