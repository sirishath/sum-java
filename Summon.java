public class Summon {
    public int sum3(int[] nums){
        int sums = 0;
        for (int i = 0; i <= nums.length - 1;  i++) {
            sums += nums[i];

        }
        return sums;

    }

    public  static void   main(String[] args){
            Summon summon = new Summon();
            int[] list = {1,2,3};
            int values = summon.sum3(list);
            System.out.print(values);

    }
}
