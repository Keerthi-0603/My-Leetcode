class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        ans = []
        for i in range(n):
            ans.append(nums[i]) #x1
            ans.append(nums[i+n]) #x2
        return ans