import java.util.*;
class todo
{
public String largestNumber(int[] nums) 
    {
        String[] arr = new String[nums.length];
        for(int i=0; i<nums.length; i++)
            {
                arr[i]=String.valueOf(nums[i]);
            }
 
        Arrays.sort(arr, new Comparator<String>()
                                    {
                                        public int compare(String a, String b)
                                            {
                                                return (b+a).compareTo(a+b);
                                            }
                                    }
                    );
 
        StringBuilder sb = new StringBuilder();
        for(String s: arr)
        {
            sb.append(s);
        }   
 
        while(sb.charAt(0)=='0'&&sb.length()>1)
            {
            sb.deleteCharAt(0);
            }
        return sb.toString();
    }
}
    
public class myProgram{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            a[i]=sc.nextInt();
        }
    
        todo obj = new todo();
        System.out.println(obj.largestNumber(a));
    }
}
