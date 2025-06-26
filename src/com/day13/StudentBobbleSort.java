package com.day13;
public class StudentBobbleSort {
	public static void main(String[] args) {
		Student student1 = new Student("Anand1", 5);
		Student student2 = new Student("Anand2", 3);
		Student student3 = new Student("Anand3", 1);
		Student student4 = new Student("Anand4", 2);
		Student student5 = new Student("Anand5", 4);
		
		Student [] students1 = {student1, student2, student3, student4, student5};
		
		for (int i = 0; i < students1.length - 1; i++) {
            for (int j = 0; j < students1.length - 1 - i; j++) {
                if (students1[j].getRank() > students1[j + 1].getRank()) {
                    Student temp = students1[j];
                    students1[j] = students1[j + 1];
                    students1[j + 1] = temp;
                }
            }
        }
        System.out.println("Students sorted based on rank:");
        for (Student s : students1) {
            System.out.println(s);
        }
        
        System.out.println("---------------------------");
        Student [] students2 = {student1, student2, student3, student4, student5};
        
        for (int i = 0; i < students2.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < students2.length; j++) {
                if (students2[j].getRank() < students2[minIndex].getRank()) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Student temp = students2[i];
                students1[i] = students2[minIndex];
                students2[minIndex] = temp;
            }
        }

        System.out.println("Students sorted by rank - Selection Sort:");
        for (Student s : students2) {
            System.out.println(s);
        }
        
        System.out.println("------------------------------");
        
        Student [] students3 = {student1, student2, student3, student4, student5};
        for (int i = 1; i < students3.length; i++) {
            Student key = students3[i];
            int j;
            for (j = i - 1; j >= 0 && students3[j].getRank() > key.getRank(); j--) {
            	students3[j + 1] = students3[j];
            }

            students3[j + 1] = key;
        }

        // Output
        System.out.println("Students sorted by rank Insertion Sort ");
        for (Student s : students3) {
            System.out.println(s);
        }
	}
}
