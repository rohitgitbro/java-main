package array.array;

public class b {
           public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
    
            System.out.println("Before swap:");
            printArray(arr);
    
            // Reverse the array
            int start = 0;
            int end = arr.length - 1;
            while (start < end) {
                // Swap elements without a third variable
                arr[start] = arr[start] + arr[end];
                arr[end] = arr[start] - arr[end];
                arr[start] = arr[start] - arr[end];
    
                start++;
                end--;
            }
    
            System.out.println("After swap:");
            printArray(arr);
        }
    
        private static void printArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    
}


public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 371; // example number
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }

    public static boolean isArmstrong(int num) {
        int temp = num;
        int sum = 0;
        while (temp!= 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, getNumberOfDigits(num));
            temp /= 10;
        }
        return sum == num;
    }

    public static int getNumberOfDigits(int num) {
        int count = 0;
        while (num!= 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121; // example number
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome number");
        } else {
            System.out.println(num + " is not a palindrome number");
        }
    }

    public static boolean isPalindrome(int num) {
        int reversed = 0;
        int original = num;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }
}