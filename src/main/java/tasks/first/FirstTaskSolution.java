package tasks.first;

import java.util.ArrayDeque;

public class FirstTaskSolution implements FirstTask {
    @Override
    public String breadthFirst(boolean[][] adjacencyMatrix, int startIndex) {
        return null;
    }

    @Override
    public Boolean validateBrackets(String s) {

        ArrayDeque<Character> brackets = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                brackets.offerFirst(s.charAt(i));
            }
            if ((s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')') && brackets.isEmpty()) {
                return false;
            }

            switch (s.charAt(i)) {

                case ')':
                    if (brackets.getFirst() == '(') {
                        brackets.removeFirst();
                    } else {
                        return false;
                    }
                    break;

                case ']':
                    if (brackets.getFirst() == '[') {
                        brackets.removeFirst();
                    } else {
                        return false;
                    }
                    break;

                case '}':
                    if (brackets.getFirst() == '{') {
                        brackets.removeFirst();
                    } else {
                        return false;
                    }
                    break;
            }
        }
        return brackets.isEmpty();
    }

    @Override
    public Long polishCalculation(String s) {
        return null;
    }
}
