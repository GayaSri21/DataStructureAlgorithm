package gaya.base;
public class fir {
        public static void main(String[] args) {
            int[] nums={5,7,7,8,8,10};
            int target=7;
            fir sol=new fir();
            int[] result=sol.searchrange(nums,target);
            System.out.println("fir index " + result[0]);
            System.out.println("sec indexn " + result[1]);
        }
        public int[] searchrange(int[] nums, int target){
            int[] ans = {11,22 };
            ans[0]= find(nums, target, true);
            if(ans[0]!=-1) {
                ans[1] = find(nums, target, false);
            }

            return ans;
        }
        int find(int[] nums,int target,boolean FirststartIndex){
            int ans=-1;
            int start=0;
            int end=nums.length-1;
            while(start<=end) {
                int m = start + (end - start)/2;
                if (target < nums[m]) {
                    end = m - 1;
                } else if (target > nums[m]) {
                    start = m + 1;

                } else {
                    ans = m;

                    if (FirststartIndex) {
                        end = m - 1;
                    } else {
                        start = m + 1;

                    }
                }
            }
            return ans;
        }
    }


