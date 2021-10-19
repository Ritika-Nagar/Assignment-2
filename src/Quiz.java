import java.util.Scanner;

class Quiz implements Assessment{
    Scanner sc= new Scanner(System.in);
    private String ques;
    public void addAsses(){
        System.out.print("Enter quiz question: ");
        String s=sc.next();
        this.ques=s;
    }

    public void viewAsses(){
        System.out.println("Question: "+ques);

    }
}
