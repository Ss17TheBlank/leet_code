# https://leetcode.com/problems/two-sum/description/
from typing import List


def twoSum(nums: List[int], target: int) -> List[int]:
    current = 0
    while current < len(nums) - 1:
        for i in range(current+1, len(nums)):
            if nums[current] + nums[i] == target:
                return [current,i]
        current += 1


print(twoSum([3,2,4],6))