# https://leetcode.com/problems/roman-to-integer/
def roman_to_int(s: str) -> int:
    dict = {"I": 1, "V": 5, "X": 10, "L": 50, "C": 100, "D": 500, "M": 1000, "IV": 4, "IX": 9, 'XL': 40, 'XC': 90,
            'CD': 400, 'CM': 900}
    number: int = 0
    i: int = 0
    while i < len(s):
        if i + 1 < len(s) and s[i:i + 2] in dict:
            number += dict[s[i:i + 2]]
            i += 2
        else:
            # print(i)
            number += dict[s[i]]
            i += 1
    return number

