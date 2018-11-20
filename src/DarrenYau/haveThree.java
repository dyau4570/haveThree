package DarrenYau;

public class haveThree {
    public static boolean haveThreeThree(int[] nums){
        int count = 0;
        boolean three = false;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 3) {
                three = false;
            }
            if (nums[i] == 3 && three == true) {
                return false;
            }
            if (nums[i] == 3 && three == false) {
                three = true;
                count++;
            }
        }
        if (count == 3) {
            return true;
        } else {
            return false;
        }
    }
}