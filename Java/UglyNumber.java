//https://leetcode.com/problems/ugly-number/

public class UglyNumber{
    public static boolean booleanisUgly (int n) {
            boolean Ugly=true;
            if (n<=0) return false;
            while (n!=1) {
                    if(n%2==0){
                        n/=2;
                    } else if (n%3==0) {
                        n/=3;
                    } else if (n%5==0) {
                        n/=5;
                    } else {
                        Ugly=false;
                        break;
                    }
            }
            return Ugly;
    }
}