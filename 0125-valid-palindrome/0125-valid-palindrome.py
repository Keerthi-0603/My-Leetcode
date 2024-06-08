class Solution:
    def isPalindrome(self, s: str) -> bool:
        t=s.lower()
        f="".join(c for c in t if c.isalnum())
        if not f:
            return True
        l=0
        r=len(f)-1
        while l<r:
            if f[l]!=f[r]:
                return False
            l+=1
            r-=1
        return True