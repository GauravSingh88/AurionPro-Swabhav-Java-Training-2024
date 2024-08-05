package com.aurionpro.day06;

public class DuplicateCounter {
	
	public static void findDuplicates(int[] array) {
        int n = array.length;
        boolean[] visited = new boolean[n]; 
        int duplicateCount = 0;

        System.out.println("Duplicate elements:");

        for (int i = 0; i < n; i++) {
            if (!visited[i]) { 
                int count = 1; 
                for (int j = i + 1; j < n; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        visited[j] = true; 
                    }
                }
                if (count > 1) { 
                    System.out.println("Element: " + array[i] + ", Count: " + count);
                    duplicateCount++;
                }
            }
        }

        System.out.println("Total number of duplicate elements: " + duplicateCount);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 4, 5, 5, 5, 6}; 
        findDuplicates(array);
        
        
    }

    
}

