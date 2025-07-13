# -Server-Impact-Analysis-Problem-solution

NPCI coding test solution for  Server Impact Analysis Problem
Server Impact Analysis
Problem Description:
You are given a list of servers, where each server has an associated integer priority. A server upgrade process allows servers to "impact" (terminate) weaker servers under specific rules.

A server A can impact another server B if:

1.|priority\[A] - priority\[B]| ≤ k

2. priority\[A] > priority\[B]

A server can only impact servers that have not already been impacted

A server that is impacted cannot impact others

Your goal is to find the maximum number of servers that can be impacted across the network by applying these rules optimally.



Test Cases Example:
Input:

priority = \[2, 8, 3, 5]

k = 6

Output:

3



Explanation:

Server with priority 8 can impact servers with priorities 5, 3, and 2 (all within the range and lower).

Total impacted = 3

📦 Constraints
1 ≤ priority.length ≤ 2 × 10⁵

0 ≤ priority\[i] ≤ 10⁹

0 ≤ k ≤ 10⁹

