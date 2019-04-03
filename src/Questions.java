public class Questions{
    public static void main(String[] args){
        //Test flip
        int heads = 0;
        int tails = 0;
        for(int i = 0; i < 10000; i++){
            if(flip().equals("heads")) heads++;
            if(flip().equals("tails")) tails++;
        }
        System.out.println("heads: " + heads + ", tails: " + tails);

        //Test arePermutations
        int[] nums1 = {1, 3, 4, 2};
        int[] nums2 = {3, 1, 2, 4};
        int[] nums3 = {6, 1, 2, 4};
        System.out.println("arePermutations(true) : " + arePermutations(nums1, nums2));
        System.out.println("arePermutations(false) : " + arePermutations(nums1, nums3));
    }

    //Return heads or tails, heads occurs twice as often as tails
    public static String flip(){
        double random = Math.random() * 3;
        if(random < 1.0) return "tails";
        else return "heads";
    }

    public static boolean arePermutations(int[] nums1, int[] nums2){
        boolean[] found = new boolean[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]) found[i] = true;
            }
        }
        for(int i = 0; i < found.length; i++){
            if(found[i] == false) return false;
        }
        return true;
    }
}