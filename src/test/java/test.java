import java.util.ArrayDeque;
import java.util.Deque;

public class test {

    public double findMaxAverage(int[] nums, int k) {
            double ans = 0;
            double sum = Integer.MIN_VALUE;

        Deque<Integer> d = new ArrayDeque<Integer>();

        for(int i=0;i<k;i++)
        {d.addLast(nums[i]);
            ans = ans+nums[i];
        }
        ans = ans/k;
        if(ans>sum)sum =ans;
        for(int i=k;i<nums.length;i++)
        {

             d.addLast(nums[i]);
         ans =ans*k-d.pollFirst()+d.peekLast();
            ans =ans/k;
            if(ans>sum)sum=ans;
        }
        return sum;
    }


    public static void main(String[] args) {

    }
}
