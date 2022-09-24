import java.util.*;

public class TwoSum{



    public static int[] twosum(int[] num, int target){

        // Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        // System.out.println(Arrays.toString(num) + " " + target);

        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < num.length; ++i) {
            if (hashtable.containsKey(target - num[i])) {
                return new int[]{hashtable.get(target - num[i]), i}; // index
            }
            hashtable.put(num[i], i);
        }
        return new int[0];
    }

    public static void main(String []args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        System.out.println(str[0].length());
        String[] b = str[0].substring(1,str[0].length()-1).split(",");
        int[] a = new int[b.length];
        for(int i=0; i<b.length; i++){
            a[i] = Integer.parseInt(b[i]);
        }

        int[] res = twosum(a, Integer.parseInt(str[1]));
        System.out.println(Arrays.toString(res));
        sc.close();
        return;
    }

}