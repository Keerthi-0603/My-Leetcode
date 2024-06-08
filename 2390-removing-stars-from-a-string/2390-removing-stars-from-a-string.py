class Solution:
    def removeStars(self, s: str) -> str:
        stack=[]
        for i in s:
            if i.isalpha():
                stack.append(i)
            elif i=='*':
                stack.pop()
            else:
                return ''
        st=[str(x) for x in stack]
        return ''.join(st)