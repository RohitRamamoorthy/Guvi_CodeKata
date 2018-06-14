import java.util.*;
class duplicate
{
    void find(int[] arr1, int size)
    {
        int t = 0, count=0;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0 ; i<size; i++)
        {
            for(int j = i+1 ; j<size; j++)
            {
                if(arr1[i]>arr1[j])
                {
                t       = arr1[i];
                arr1[i] = arr1[j];
                arr1[j] = t;
                }
            }
        }
        
        for(int i = 0 ; i<size ; i++)
        {
            for(int j = i+1 ; j<size; j++)
            {
                if(arr1[i] == arr1[j])
                {
                    al.add(arr1[i]);
                    count++;
                }
            }
        }
        if(count == 0)
        {
            System.out.println("unique");
        }
        else
        {
            for(int i = 0 ; i<al.size() ; i++)
                {
                    System.out.println(al.get(i));
                }
        }
    }
}

public class findDuplicate
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i]=sc.nextInt();
        }
    
        duplicate obj = new duplicate();
        obj.find(arr,n);
    }
}
