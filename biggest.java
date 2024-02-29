package gaya.base;

public class biggest {


        public static void main(String[] args)
        {
            int[] num = {1,3,5,7,8};
            System.out.println(maxval(num,0,4));

        }

        static int maxval(int[] num,int start, int end)
        {
            int maxvalue = num[start];
            for (int i = start; i <=end; i++)
            {
                if (num[i]>maxvalue)
                {
                    maxvalue=num[i];
                }



            }
            return maxvalue;
        }
    }











