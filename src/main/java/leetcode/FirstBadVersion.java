package leetcode;

public class FirstBadVersion {
    
    public int firstBadVersion(int n) {
        int left = 0;
        int right = n;
        int mid = 0;
        int ans = -1;
        
        while(left <= right){
            mid = left + (right-left)/2;
            
            if(isBadVersion(mid)){
                ans = mid;
                
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        
        return ans;
        
    }

    public boolean isBadVersion(int n){
        if(n == 232123){
            return true;
        }
        return false;
    }
}