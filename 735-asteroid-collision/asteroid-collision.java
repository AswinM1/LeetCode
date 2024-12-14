import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> s = new Stack<>();
       
        for (int i = 0; i < a.length; i++) {
            boolean exploded = false;

            if (a[i] > 0) {
                s.push(a[i]); // Push all positive asteroids directly
            } else {
                while (!s.isEmpty() && s.peek() > 0) { // Check for collision with positive asteroids
                    if (Math.abs(a[i]) == s.peek()) {
                        s.pop(); // Both asteroids explode
                        exploded = true;
                        break;
                    } else if (Math.abs(a[i]) > s.peek()) {
                        s.pop(); // Top asteroid explodes; continue checking further
                    } else {
                        exploded = true; // Current asteroid explodes
                        break;
                    }
                }
                if (!exploded) {
                    s.push(a[i]); // Push the surviving negative asteroid
                }
            }
        }
        
        // Convert stack to array
        int[] result = new int[s.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = s.pop();
        }
        return result;
    }
}
