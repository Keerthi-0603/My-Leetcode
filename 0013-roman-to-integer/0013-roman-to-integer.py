class Solution:
    def romanToInt(self, s: str) -> int:
        r=0
        s = s.replace("IV", "IIII").replace("IX", "VIIII")
        s = s.replace("XL", "XXXX").replace("XC", "LXXXX")
        s = s.replace("CD", "CCCC").replace("CM", "DCCCC")
        for x in s:
            if x=='I':
                r+=1
            elif x=='V':
                r+=5
            elif x=='X':
                r+=10
            elif x=='L':
                r+=50
            elif x=='C':
                r+=100
            elif x=='D':
                r+=500
            elif x=='M':
                r+=1000
            else:
                continue
        return r