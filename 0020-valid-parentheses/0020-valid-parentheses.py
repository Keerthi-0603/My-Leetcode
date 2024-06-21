class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]
        if s=='':
            return False
        else:
            for i in s:
                if i in'{[(':
                    stack.append(i)
                elif i in ']})':
                    if not stack:
                        return False
                    elif ((stack[-1]=='[' and i==']') or (stack[-1]=='{' and i=='}') or (stack[-1]=='(' and i==')')):
                        stack.pop()
                    else:
                        return False
                else:
                    return False
        if not stack:
            return True
        