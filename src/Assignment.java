import java.util.Scanner;

class Assignment implements Assessment{
    Scanner sc= new Scanner(System.in);
    private String prob;
    private int marks;

    public void addAsses(){
        System.out.print("Enter problem statement: ");
        String prob= sc.next();
        System.out.print("Enter max marks:  ");
        int marks= sc.nextInt();
        this.prob=prob;
        this.marks=marks;

    }
    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }


    public void viewAsses(){
        System.out.println("Assignment: "+prob+" Max Marks"+marks);
    }
}
