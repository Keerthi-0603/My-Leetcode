class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        max=0
        for i in accounts:
            sum=0
            for k in i:
                sum=sum+k
            if max<sum:
                max=sum
        return max