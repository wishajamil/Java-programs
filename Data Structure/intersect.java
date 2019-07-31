/////////////////////////////////////////////////////////////////////////////////////////////////////////
//Project description: Given two arrays containing unique elements, write a Java function that computes// 
//                           their intersection. (The result can be in any order)                      //
/////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

public class intersect
{ 

   public static void main (String[] args) 
   { 
      int a[] = {1, 2, 3, 4, 5, 6, 7}; 
      int b[] = {4, 5, 6, 7}; 
   
      int n = a.length; 
      int m = b.length; 
      intersection(a, b, n, m); 
   } 

   static void intersection(int a[], int b[], int n, int m) 
   { 
      int i = 0, j = 0; 
   
      while (i < n && j < m) 
      { 
         if (a[i] > b[j]) 
         { 
            j++; 
         } 
         else
            if (b[j] > a[i]) 
            { 
               i++; 
            } 
            else
            { 
               System.out.print(a[i] + " "); 
               i++; 
               j++; 
            } 
      } 
   } 
} 