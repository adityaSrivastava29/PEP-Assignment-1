import java.util.*;

public class Main{
    public static void main(String[] args){
        PriorityQueue<Student> pq = new PriorityQueue<>();
        
        pq.add(new Student("A", 79, 180, 80));
        pq.add(new Student("B", 85, 170, 78));
        pq.add(new Student("C", 76, 176, 79));
        
        while(pq.size() != 0){
            System.out.println("marks ->" + pq.remove().marks);
        }
        
        
        PriorityQueue<Student> pq1 = new PriorityQueue<>(new StudentHtComp());
        
        pq1.add(new Student("A", 79, 180, 80));
        pq1.add(new Student("B", 85, 170, 78));
        pq1.add(new Student("C", 76, 176, 79));
        
        while(pq1.size() != 0){
            System.out.println("ht ->" + pq1.remove().ht);
        }
        
        PriorityQueue<Student> pq2 = new PriorityQueue<>(new StudentWtComp());
        
        pq2.add(new Student("A", 79, 180, 80));
        pq2.add(new Student("B", 85, 170, 78));
        pq2.add(new Student("C", 76, 176, 79));
        
        while(pq2.size() != 0){
            System.out.println("wt ->" + pq2.remove().wt);
        }
    }
    public static class Student implements Comparable<Student>{
        String name;
        int marks;
        int ht;
        int wt;
        
        public Student(String name, int marks, int ht, int wt){
            this.name = name;
            this.marks = marks;
            this.ht = ht;
            this.wt = wt;
        }
        
        public int compareTo(Student o){
            return this.marks - o.marks;
        }
    }
    
    public static class StudentHtComp implements Comparator<Student>{
        public int compare(Student s1, Student s2){
            return s1.ht - s2.ht;
        }
    }
    
    public static class StudentWtComp implements Comparator<Student>{
        public int compare(Student s1, Student s2){
            return s1.wt - s2.wt;
        }
    }
    
   
}