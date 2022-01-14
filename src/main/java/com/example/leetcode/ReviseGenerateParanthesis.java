package com.example.leetcode;

import java.util.ArrayList;
import java.util.List;

//Use double synchronous recursion for the open and closed parenthesis open < max, close < open

public class ReviseGenerateParanthesis {
    public List<String> generateParenthesis(int n) {
        // Declare empty list of string to return answer
        List<String> ans = new ArrayList();
        // Pass empty ans to backtrack fun along with a string builder and set open and close to initial 0
        backtrack(ans, new StringBuilder(), 0, 0, n);
        // return updated ans list
        return ans;
    }

    public void backtrack(List<String> ans, StringBuilder cur, int open, int close, int max) {
        // Base case stop when stringbuilder has reached max * 2 (2 as there are two paranthesis)
        if (cur.length() == max * 2) {
            // add string builder to array list
            ans.add(cur.toString());
            return;
        }
        // if open is less than max, append an open e.g. 3 will result in (((
        if (open < max) {
            cur.append("(");
            // go up by 1 and recall function
            backtrack(ans, cur, open + 1, close, max);
            // clears the string builder as the stack returns
            cur.deleteCharAt(cur.length() - 1);
        }
        // close will not be triggered untill the open ifs recursion is completed
        if (close < open) {
            cur.append(")");
            backtrack(ans, cur, open, close + 1, max);
            cur.deleteCharAt(cur.length() - 1);
        }
    }
}

