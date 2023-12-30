# Temperature problem

Implement the method int computeClosestToZero(int[] ts) which takes an array of temperatures ts and returns the
temperature closest to 0.

Constraints:

- n is the size of the array
- If the array is empty, the method should return 0
- 0 ≤ ts size ≤ 10000
- If two temperatures are equally close to zero, the positive temperature must be returned. For example, if the
  input is -5 and 5, then 5 must be returned.

Extra points will be given for a solution that is:

- Result is correct with a simple data set: {7 5 9 1 4} -> 1
- It works with -273 alone
- It works with 5526 alone
- It works when inputs contains only negative numbers: : {-15 -7 -9 -14 -12} -> -7
- It works with two negative temperatures that are equal: {-10 -10} -> -10
- The solution displays 0 if no temperature
- When two temperatures are as close to 0, then the positive wins: {15 -7 9 14 7 12} -> 7