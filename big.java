package gaya.base;

public class big
{
    public static void main(String[] args)
    {
        long[] num = {2222, 4444, 8888888, 0};
        System.out.println(maxval(num));

    }

    static long maxval(long[] num)
    {
        long maxvalue = num[0];
        for (int i = 0; i < num.length; i++)
        {
            if (maxvalue < num[i])
            {
                maxvalue=num[i];
            }



        }
        return maxvalue;
    }
}









