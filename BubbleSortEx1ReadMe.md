# Bubble Sort

  Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.

* Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.

* Best Case Time Complexity: O(n). Best case occurs when array is already sorted.

* Auxiliary Space: O(1)

* Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are already sorted.

Sorting In Place: Yes

let say input elements were 5 1 4 2 8 

where n is the number of elements which is 5.

```
loop ( while n -1 )


Step 1   ===> i < n -1
         i =0, j=0, j < n - i -1     1 5 4 2 8  swap if elem(j) > elem (j+1)
         i =0, j=1, j < n - i -1     1 4 5 2 8  swap if elem(j) > elem (j+1)
         i =0, j=2, j < n - i -1     1 4 2 5 8  swap if elem(j) > elem (j+1)
         i =0, j=3, j < n - i -1     1 4 2 5 8  swap if elem(j) > elem (j+1)

Step 2   ===> i < n -1
         i =1, j=0, j < n - i -1     1 4 2 5 8  swap if elem(j) > elem (j+1)
         i =1, j=1, j < n - i -1     1 2 4 5 8  swap if elem(j) > elem (j+1)
         i =1, j=2, j < n - i -1     1 2 4 5 8  swap if elem(j) > elem (j+1)

Step 3   ===> i < n -1
         i =2, j=0, j < n - i -1     1 2 4 5 8  swap if elem(j) > elem (j+1)
         i =2, j=1, j < n - i -1     1 2 4 5 8  swap if elem(j) > elem (j+1)

Step 4   ===> i < n -1
         i =3, j=0, j < n - i -1     1 2 4 5 8  swap if elem(j) > elem (j+1)

```
         
        
             


