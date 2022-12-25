package com.example1;
import java.util.*;

public class JavaArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println(i);
        }
        int len = arr.length;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //find the minimum element in the array and also fin the maximum element in the array
        int[] arr1 = new int[5];
        arr1[0] = 10;
        arr1[1] = 15;
        arr1[2] = 19;
        arr1[3] = 76;
        arr1[4] = 90;
        int min = arr1[0];
        int max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (min > arr1[i]) {
                min = arr1[i];
            }
            if (max < arr1[i]) {
                max = arr1[i];
            }
        }
        System.out.println();
        System.out.println("The minimum element is " + min);
        System.out.println("The minimum element is " + max);
        int[][] arr2 = {{1, 3, 8}, {5, 6, 5}, {7, 8, 3}};
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        //addition of two matrices
//       int [][] matrice1={{1,3,4},{3,4,5}};
//        int [][] matrice2={{1,3,4},{3,4,5}};
//        int [][] matrice3=new int[2][3];
//        for(int i=0; i<matrice1.length; i++){
//            for(int j=0; j<matrice2[i].length; j++){
//             matrice3[i][j]=matrice1[i][j] + matrice2[i][j];
//            }
//        }
//        for(int i[]: matrice3){
//            for(int j: i){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
        //multiplication of two matrices
//       Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the number of rows of the first array: ");
// int FirstRows=sc.nextInt();
// System.out.print("Enter the number of columns of the first array: ");
// int FirstCols=sc.nextInt();
// int [][] array1=new int[FirstRows][FirstCols];
// System.out.print("Enter the number of rows of the second array: ");
// int SecondRows=sc.nextInt();
// System.out.print("Enter the number of cols of the second array: ");
// int SecondCols=sc.nextInt();
// int [][] array2=new int[SecondRows][SecondCols];
// int [][] array3=new int[FirstRows][SecondCols];
// System.out.println("Enter the elements of the first array: ");
// int inc=1;
//  for(int i=0; i<FirstRows; i++){
//    for(int j=0; j<FirstCols; j++)
//      {
//        System.out.println("Enter the array " + inc + " element : ");
//        array1[i][j]=sc.nextInt();
//        inc++;
//      }
//    }
// inc=1;
// System.out.println("Enter the element of the second array : ");
//  for(int i=0; i<SecondRows; i++){
//    for(int j=0; j<SecondCols; j++)
//      {
//        System.out.println("Enter the array " + inc + " element : ");
//        array2[i][j]=sc.nextInt();
//        inc++;
//      }
//    }
// for(int i=0; i<FirstRows; i++){
//    for(int j=0; j<SecondCols; j++)
//      {
//       for(int k=0; k<FirstCols; k++){
//         array3[i][j]+=array1[i][k] * array2[k][j];
//        }
//      }
//   }
// System.out.println("The multiplication of the two matrix is ");
//  for(int [] i: array3){
//    System.out.print("[");
//    for(int j: i){
//      System.out.print( j + " ");
//    }System.out.println("]");
//  }
        //sorting of the arrays
        Integer[] s1 = {4, 7, 8, 2, 11};
        Arrays.sort(s1, Collections.reverseOrder());
        for (int i : s1) {
            System.out.print(i + " ");
        }
        System.out.println();
        //arraycopy funtion()
//        char[] copy1 = {'d', 'e', 'c', 'a', 'f', 'f', 'i', 'n', 'f', 'v'};
//        char[] copy2 = new char[6];
//        System.arraycopy(copy1, 2, copy2, 0, 6);
//        System.out.println(String.valueOf(copy2));
        //copying all element of a array to another array
//        int[] copyi = {1,3,4,5,6,7,8};
//        int[] copys = new int[6];
//        System.arraycopy(copyi,0, copys, 0, 6);
//        for(int i: copys){
//            System.out.print(i + " ");
//        }
        //find the frequency of each element in a array {1,2,1,3,4,5,6,7}
        int count=1;
        int [] f={1,2,1,3,4,5,3,6,7};
        int [] fr=new int[f.length];
        int v=-1;
        for(int i=0; i<f.length; i++){
            count=1;
            for(int j=i+1; j<f.length; j++){
                if(f[i]==f[j]){
                    count++;
                    fr[j]=v;
                }
            }
            if(fr[i]!=v){
                fr[i]=count;
            }
        }
       for(int i=0; i<fr.length ;i++){
           if(fr[i]!=-1){
               System.out.println(f[i] + " " + fr[i]);
           }
       }
       //rotate the array on the top left
        int [] a5={1,2,3,4,5};
        double l=Math.ceilDiv(a5.length, 2);
        int j;
        for(int i=0; i<l; i++) {
            int temp=a5[0];
            for (j = 0; j < a5.length - 1; j++) {
                a5[j]=a5[j+1];
            }
            a5[j]=temp;
        }
        System.out.print("All the element rotate on the left side ");
        for(int i=0; i<a5.length; i++){
            System.out.print(a5[i] + " ");
        }
        System.out.println();
       //print the dublicate element of the array
       int [] r5={1,2,3,4,2,7,8,8,3};
       boolean check=false;
       int visited=-1;
       for(int i=0; i<r5.length; i++)
       {
          for(int j1=i+1; j1<r5.length; j1++){
              if(r5[i]==r5[j1]) {
                  System.out.println(r5[j1]);
              }
            }
         }
       //print the element of the array in reverse
        int [] w={1,2,3,4,5};
       for(int i=w.length-1; i>=0; i--){
           System.out.print(w[i] + " ");
         }
        System.out.println();
        //print the element of the array at even position
        for(int i=1; i<w.length; i=i+2){
                System.out.print(w[i] + " ");
            }
        System.out.println();
        //print the element of the array present at odd position
        for(int i=0; i<w.length; i+=2){
            System.out.print(w[i] + " ");
         }
        System.out.println();
        //print the largest element and the smallest element in the array
        int [] a= {1,3,4,5,10,2};
        int lar=a[0];
        int small=a[0];
        for(int i=0; i<a.length; i++){
            if(lar<a[i]){
                lar=a[i];
            }
            else if(small>a[i]){
                small=a[i];
            }
         }
        System.out.println(lar);
        System.out.println(small);
        //print the number of element present in the array
        System.out.println(a.length);
        //program sum of all items present in the array
        int sum=0;
        for(int i=0; i<a.length; i++){
            sum+=a[i];
         }
        System.out.println(sum);
        //right rotate the element of the array
        int [] rs={1,2,3,4,5};
//      System.out.println(rs[rs.length-1]);
        for(int i=0; i<l; i++) {
            int temp=rs[rs.length-1];
            for (j = rs.length-1; j >0; j--) {
                rs[j]=rs[j-1];
            }
            rs[j]=temp;
        }
        System.out.println("After the array shift in the right");
        for(int ele: rs){
            System.out.print(ele + " ");
          }
        System.out.println();
        //sort the element of the array in ascending order
        int [] as={4,5,1,3,2};
        int temp=0;
        System.out.print("Before sorting of the array is ");
        for(int i: as){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i=0; i<as.length; i++) {
            for (int j2 = 0; j2 < as.length - 1; j2++) {
                if (as[j2] > as[j2 + 1]) {
                    temp = as[j2];
                    as[j2] = as[j2 + 1];
                    as[j2 + 1] = temp;
                }
            }
        }
        System.out.print("After sorting of the array in ascending order ");
        for(int ele: as){
            System.out.print(ele + " ");
        }
        System.out.println();
        Integer [] des={2,1,3,5,4,7,10,9};
        //sort the array in descending order
        System.out.println("Before sort the array in descending order ");
        for(int val: des){
            System.out.print(val + " ");
        }
        System.out.println();
        System.out.print("After sorting the array in descending order ");
        Arrays.sort(des,Collections.reverseOrder());
        for (int myval: des){
            System.out.print(myval + " ");
        }
        System.out.println();
        //find the third largest number and second largest number in a array
        int [] third= {44,66,99,77,33,22,55};
        Arrays.sort(third);
        for(int i: third){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Third largest number is "+ third[third.length-3]);
        System.out.println("Second largest number is "+ third[third.length-2]);
        //Remove dublicate elements in a array
        int [] D1={10,70,30,90,20,20,30,40,70,50};
        int jn=0;
        Arrays.sort(D1);
        for(int i=0; i<D1.length-1; i++){
                if(D1[i]!=D1[i+1]){
                   D1[jn++]=D1[i];
                }
            }
        D1[jn++]=D1[D1.length-1];
        System.out.print("After removing the dublicate element from the array ");
        for(int i=0; i<jn; i++){
              System.out.print(D1[i] + " ");
            }
        //print even and odd number from the array
        int [] marr={10,20,33,56,78,90};
        for(int i=0; i<marr.length; i++){
            if(marr[i]%2==0){
                System.out.println("Even number " + marr[i]);
            }
            else if(marr[i]%2==1){
                System.out.println("odd number " + marr[i]);
            }
        }
        //transpose of a matrix
        int [][] matrix={{1,2}, {3,4}, {5,6}};
        int l1=matrix.length;
        System.out.println(l1);
        for(int i=0; i<l1-1; i++){
            for(int k=0; k<matrix[i].length; k++){
                matrix[i][k]=matrix[k][i];
            }
        }
        for(int i []: matrix){
            for(int m: i){
                System.out.print(m + " ");
            }
            System.out.println();
        }
        boolean Check=true;
        int [][] identity={{1,0,0},
                           {0,1,0},
                           {0,0,1}};
        for(int i=0; i<identity.length; i++){
            for(int k=0; k<identity[i].length; k++){
                if(i==k && identity[i][k]!=1){
                    Check=false;
                    break;
                }
                else if(i!=k && identity[i][k]!=0){
                    Check=false;
                    break;
                }
            }
        }
        if(Check){
            System.out.println("This is a identity matrix");
        }else{
            System.out.println("This is not a identity matrix");
        }
        //check whether the matrix is sparse matrix or not
        int [][] sparse={{4,9,0}, {0,5,0}, {0,0,7}};
        int rows=sparse.length;
        int cols=sparse[0].length;
        int size=rows * cols;
        int Z1=Math.ceilDiv(size, 2);
        System.out.println(Z1);
        int Count1=0;
        for(int i=0; i<rows; i++){
            for(int k=0; k<cols; k++){
                if(sparse[i][k]==0){
                    Count1++;
                }
            }
        }
        if(Count1>Z1){
            System.out.println("This is a sparse matrix");
        }else{
            System.out.println("This is not a sparse matrix");
        }
        /*check whether the two matrix equal or not two matrix are equal whether the number of rwos and columns are equal
        and corresponding elements are equal
         */
        int [][] equal1={{1,2,3},
                         {4,5,6},
                         {7,8,9}};
        int [][] equal2={{1,2,3},
                         {4,5,6},
                         {7,8,9}};
        int rows1=equal1.length;
        int cols1=equal1[0].length;
        int rows2=equal2.length;
        int cols2=equal2[0].length;
        System.out.println(cols2);
        int Check2=1;
        if(rows1==rows2 && cols1==cols2){
            for(int i=0; i<rows1; i++){
                for(int k=0; k<cols; k++){
                    if(equal1[i][k]!=equal2[i][k]){
                        Check2=0;
                        break;
                    }
                }
            }
            if(Check2==1){
                System.out.println("This is a equal matrix");
            }
            else{
                System.out.println("This is not a equal mqtrix");
            }
        }
        else{
            System.out.println("This is not a equal mqtrix");
        }
        //lower triangular matrix
        int [][] lower={{1,0,0},
                        {8,6,0},
                        {4,5,6}};
        int row3=lower.length;
        int col3=lower[0].length;
        for(int i=0; i<row3; i++){
            for(int k=0; k<col3; k++){
                if(k>i) {
                    System.out.print("0 ");
                }
                else{
                    System.out.print(lower[i][k] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //upper triangular matrix
        int [][] upper={{1,2,3},
                        {0,6,4},
                        {0,0,6}};
        int row4=upper.length;
        int col4=upper[0].length;
        for(int i=0; i<row4; i++){
            for(int k=0; k<col4; k++){
                if(i>k) {
                    System.out.print("0 ");
                }
                else{
                    System.out.print(upper[i][k] + " ");
                }
            }
            System.out.println();
        }
        //find the frequncy of the even and odd number in the array
        int [] marr1={10,20,33,56,78,90};
        int freq=0;
        int even=0, odd=0;
        for(int i=0; i<marr.length; i++){
            if(marr[i]%2==0){
                freq++;
                even+=freq;
            }
            else if(marr[i]%2==1){
                freq++;
                odd+=freq;
            }
            freq=0;
        }
        System.out.println("Even number frequncy is " + even);
        System.out.println("Odd number frequncy is " + odd);
    }
}