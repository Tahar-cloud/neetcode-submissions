class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        bool decision = false;
        int variable = 0;
        for(int j = 0; j < nums.size();j++){
            variable = nums[j];
        for(int i = j+1; i < nums.size(); i++){
            if(variable == nums[i]) 
            decision = true;
        }
        }
        return decision;

    }
};