# https://leetcode.com/problems/happy-number/description/

def isHappy(n: int) -> bool:
    values = {}
    if n <= 0: return False
    number = sumDigits(n)
    while True:
        if number in values.keys(): break
        if number == 1: return True
        values[number] = number
        number = sumDigits(number)
    return False


def sumDigits(no):
    sum = 0
    list = [int(d) for d in str(no)]
    for i in range(len(list)):
        sum  += list[i]**2
    return sum
