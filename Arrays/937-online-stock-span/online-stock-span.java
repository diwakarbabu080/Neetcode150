import java.util.Stack;

class StockSpanner {
    Stack<int[]> stack; // Store (price, span)
    
    public StockSpanner() {
        this.stack = new Stack<>();
    }
    
    public int next(int price) {
        int span = 1; // Default span is 1
        
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1]; // Add the span of lower prices
        }
        
        stack.push(new int[]{price, span}); // Push current price with calculated span
        return span;
    }
}

/**
 * Example Usage:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
