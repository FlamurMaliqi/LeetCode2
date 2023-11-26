class Solution(object):
    def letterCombinations(self, digits):
        if not digits:
            return []

        # Mapping of digits to letters
        digit_mapping = {
            '2': 'abc',
            '3': 'def',
            '4': 'ghi',
            '5': 'jkl',
            '6': 'mno',
            '7': 'pqrs',
            '8': 'tuv',
            '9': 'wxyz'
        }

        result = []

        def backtrack(index, path):
            if index == len(digits):
                result.append("".join(path))
                return

            current_digit = digits[index]
            for letter in digit_mapping[current_digit]:
                path.append(letter)
                backtrack(index + 1, path)
                path.pop()

        backtrack(0, [])
        
        return result
