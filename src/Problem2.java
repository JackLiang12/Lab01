public class Problem2 {
    public static boolean palindrome(int x){
        if(x < 0){
            return false;
        }
        int temp = x;
        int compare = 0;
        while(x!=0){
            compare *= 10;
            compare +=x%10;
            x/=10;
        }
        return compare == temp;
    }

}
