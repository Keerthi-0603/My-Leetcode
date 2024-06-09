class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        f,s=0,0
        r=[]
        while f < len(word1) and s<len(word2):
            r.append(word1[f])
            r.append(word2[s])
            f+=1
            s+=1
        r.append(word1[f:])
        r.append(word2[s:])
        return "".join(r)