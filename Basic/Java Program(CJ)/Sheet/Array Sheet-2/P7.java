// 7. Merge Two Sorted Arrays :

// Merge two sorted arrays into one sorted array. The arrays are sorted in ascending order.

// Input: arr1 = [1, 4, 7], arr2 = [2, 5, 8]
// Output: [1, 2, 4, 5, 7, 8]
public class P7
{
    public static void main(String[] args) 
    {
        int[] arr1 = {1, 4, 7};
        int[] arr2 = {2, 5, 8};
        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] result = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        // Use for loop to iterate through total size
        for (int x = 0; x < n1 + n2; x++) 
        {
            if (i < n1 && (j >= n2 || arr1[i] <= arr2[j])) 
            {
                result[k] = arr1[i];
                i++;
            } 
            else 
            {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Print the result
        System.out.print("Merged array: ");
        for (int a = 0; a < result.length; a++) 
        {
            System.out.print(result[a] + " ");
        }
    }
}
//🔹 Step 1:
// i = 0, j = 0

// Check:
// i < n1 → 0 < 3 ✅
// j >= n2 → 0 >= 3 ❌
// arr1[i] <= arr2[j] → 1 <= 2 ✅
// ✅ Condition is true

// ➡️ Pick arr1[i] = 1 → put in result[k]

// 🔹 Step 2:
// i = 1, j = 0

// Check:
// i < 3 ✅
// j >= 3 ❌
// arr1[i] <= arr2[j] → 4 <= 2 ❌
// ❌ Condition is false

// ➡️ Pick arr2[j] = 2 → put in result[k]

// 🔹 Step 3:
// i = 1, j = 1

// Check:
// i < 3 ✅
// j >= 3 ❌
// arr1[i] <= arr2[j] → 4 <= 5 ✅
// ✅ Condition is true

// ➡️ Pick arr1[i] = 4

// 🔹 Step 4:
// i = 2, j = 1

// 7 <= 5 ❌ → pick arr2[j] = 5

// 🔹 Step 5:
// i = 2, j = 2

// 7 <= 8 ✅ → pick arr1[i] = 7

// 🔹 Step 6:
// i = 3, j = 2

// i < 3 ❌ → arr1 finished
// ➡️ Must pick from arr2 (because of j < 3)