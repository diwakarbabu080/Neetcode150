public class Solution {
    // Function to reverse bits of a given 32-bit unsigned integer
    public int reverseBits(int n) {
        
        int result = 0; // Initialize result to store the reversed bits
        
        // Loop through all 32 bits of the input number
        for(int i = 0; i < 32; i++) {
            // Extract the last bit (rightmost bit) of 'n'
            int lastDigit = n & 1;

            // Shift 'result' left to make space for the new bit
            result = (result << 1) | lastDigit;

            // Right shift 'n' to process the next bit in the next iteration
            n >>= 1;
        }

        // Return the final reversed bit representation as an integer
        return result;
    }
}
