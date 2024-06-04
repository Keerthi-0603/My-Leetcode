class Solution:
    def findWordsContaining(self, words: List[str], x: str) -> List[int]:
        lists=[]
        for idx,i in enumerate(words):
            if x in i:
                lists.append(idx)
        return lists
