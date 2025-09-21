# 📘 Java Arrays, Sorting, and Searching

## 1. Arrays in Java

### What is an Array?

* An **array** is a container that stores multiple values of the **same data type**.
* Arrays are **fixed-size** and accessed using **indices starting from 0**.

### Syntax:

```java
public class Main
{
    public static void main(String[] args) 
    {
        int[] numbers = new int[5];   // Declaration with size
        numbers[0] = 10;              // Assign value
        int first = numbers[0];       // Access value
    }
}
```

### Initialization:

```java
public  class Main
{
    public static void main(String[] args) 
    {
        int[] arr1 = {1, 2, 3, 4, 5};          // Inline initialization
        int[] arr2 = new int[]{10, 20, 30};    // Using 'new' keyword
    }
}
```

### Traversing an Array:

```java
public class Main
{
    public static void main(String[] args) 
    {
        int[] arr1 = {1, 2, 3, 4, 5};
        // Using for loop
        for (int i = 0; i < arr1.length; i++) 
        {
            System.out.println(arr1[i]);
        }

        // Using enhanced for loop
        for (int num : arr1) 
        {
            System.out.println(num);
        }
    }
}
```

### Common Operations:

* **Access elements** → `arr[index]`
* **Update elements** → `arr[index] = newValue`
* **Sum / Average** → iterate and accumulate values
* **Copy arrays** → `Arrays.copyOf(arr, newLength)`
* **Compare arrays** → `Arrays.equals(arr1, arr2)`

### Built-in Methods (`java.util.Arrays`):

```java
import java.util.Arrays;

public class Main
{
    public static void main(String[] args) 
    {
        int[] arr = {5, 2, 8, 1, 3};

        // Sort array
        Arrays.sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));

        // Search for an element
        int index = Arrays.binarySearch(arr, 3);
        System.out.println("Index of 3: " + index);

        // Fill array with a value
        Arrays.fill(arr, 0);
        System.out.println("Filled: " + Arrays.toString(arr));
    }
}
```

---

## 2. Multi-Dimensional Arrays

### What is a Multi-Dimensional Array?

* An array of arrays (like a matrix).
* Commonly used for **2D data** like tables or grids.

### Declaration and Initialization:

```java
// 2D array
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

### Traversing 2D Arrays:

```java

public class Main
{
    public static void main(String[] args) 
    {
        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix[i].length; j++) 
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

### Jagged Arrays

* **Rows can have different lengths**.

```java
public class Main
{
    public static void main(String[] args) 
    {
        int[][] jagged = new int[3][];
        jagged[0] = new int[]{1, 2};
        jagged[1] = new int[]{3, 4, 5};
        jagged[2] = new int[]{6};
    }
}
```

### Traversing Jagged Arrays:

```java
public class Main
{
    public static void main(String[] args) 
    {
        for (int i = 0; i < jagged.length; i++) 
        {
            for (int j = 0; j < jagged[i].length; j++) 
            {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

---

## 3. Sorting Algorithms

Sorting arranges data in a specific order (ascending/descending).

### 3.1 Bubble Sort

* Compare adjacent elements and swap if needed.

```java
public class Main
{
    public static void main(String[] args) 
    {
        for (int i = 0; i < arr.length - 1; i++) 
        {
            for (int j = 0; j < arr.length - i - 1; j++) 
            {
                if (arr[j] > arr[j + 1]) 
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
```

### 3.2 Selection Sort

* Find the minimum element and place it in the correct position.

```java
public class Main
{
    public static void main(String[] args) 
    {
        for (int i = 0; i < arr.length - 1; i++) 
        {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[j] < arr[minIndex]) minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
```

### 3.3 Insertion Sort

* Insert each element into its correct position in the sorted part.

```java
public class Main
{
    public static void main(String[] args) 
    {
        for (int i = 1; i < arr.length; i++) 
        {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) 
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
```

---

## 4. Searching Algorithms

### 4.1 Linear Search

* Check **each element sequentially**.
* Works on **unsorted arrays**.

```java
public class Main
{
    public static void main(String[] args) 
    {
        int linearSearch(int[] arr, int key) 
        {
            for (int i = 0; i < arr.length; i++) 
            {
                if (arr[i] == key) return i;
            }
            return -1; // Not found
        }
    }
}
```

### 4.2 Binary Search

* Works on **sorted arrays** only.
* Divide and conquer method.

```java
public class Main
{
    public static void main(String[] args) 
    {
        int binarySearch(int[] arr, int key) 
        {
            int low = 0, high = arr.length - 1;
            while (low <= high) 
            {
                int mid = (low + high) / 2;
                if (arr[mid] == key) return mid;
                else if (arr[mid] < key) low = mid + 1;
                else high = mid - 1;
            }
            return -1; // Not found
        }
    }
}
```

### Example:

```java
public class Main {
    public static void main(String[] args) 
    {
        int[] arr = {2, 4, 6, 8, 10};
        int key = 6;
        int index = binarySearch(arr, key);
        System.out.println("Index of " + key + " = " + index);
    }

    static int binarySearch(int[] arr, int key) 
    {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) return mid;
            else if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1; // Not found
    }
}
```



