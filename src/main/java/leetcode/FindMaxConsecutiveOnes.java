package leetcode;

public class FindMaxConsecutiveOnes {

    public static void main(String[] args) {

        int array[] = new int[] {1,1,0,1,1,1};
        System.out.println("Expected answer is 3");
        System.out.println("Actual answer is ");
        System.out.println(findMaxConsecutiveOnes(array));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        
        int maxConsec = 0;
        int currentConsec = 0;
        int prevNum = 0;
        int currentNum = 0;
        
        prevNum = nums[0];
        if(prevNum == 1){
            
            currentConsec++;
        }
        //[1,1,0,1,1,1]
        
        for(int i = 1; i < nums.length; i++){
            
             currentNum = nums[i];
            
            if(prevNum == 1 && currentNum == 1){
                currentConsec++;
                
                maxConsec = Math.max(currentConsec, maxConsec);
                //if(currentConsec > maxConsec){
                  //  maxConsec = currentConsec;
                //}
            }
            else if(prevNum == 0 && currentNum == 0){
                ;
            }
            else if(prevNum == 0 && currentNum == 1){
                currentConsec++;
            }
            else if(prevNum ==1 && currentNum == 0){
                maxConsec = Math.max(currentConsec, maxConsec);
                currentConsec = 0;
            }
            
            
            prevNum = currentNum;
            
            
            
        }
        
        return maxConsec;
        
    }
}