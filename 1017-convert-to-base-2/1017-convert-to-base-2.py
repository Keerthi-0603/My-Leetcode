class Solution:
    def baseNeg2(self, n: int) -> str:
        s=[]
        r=[]
        if n==0:
            return '0'
        while n!=0:
            if n%-2<0:
                t=n%-2
                s.append(t+2)
                n=n//-2+1

            else:
                s.append(n%-2)
                n=n//-2
        while s:
            r.append(s.pop())
        st=[str(x) for x in r]
        return ''.join(st)