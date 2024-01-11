import java.util.Arrays;

public class Problem3 {
    public static String longestCommonPrefix(String[] strs){
        StringBuilder str = new StringBuilder("");

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length-1];

        for(int i = 0; i <= strs.length; i++){
            if(first.charAt(i)!=last.charAt(i)){
                return str.toString();
            }else{
                str.append(first.charAt(i));
            }
        }


        return str.toString();
    }
}
