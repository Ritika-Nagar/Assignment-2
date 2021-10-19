

import java.util.ArrayList;
import java.util.Scanner;


public class Submit {
    private String _file;
    private String id1;
    Scanner sc =new Scanner(System.in);

    private ArrayList<Assignment> arr;
    private ArrayList<Quiz> arr1;
    Submit(ArrayList<Assignment> Arr, ArrayList<Quiz> Q){
        this.arr= Arr;
        this.arr1= Q;

    }

    public void viewAsses(){
        if(arr.isEmpty()){
            System.out.println(" ");
        }else{
            arr.get(0).viewAsses(); }
        if(arr1.isEmpty()){
            System.out.println(" "); }
        else{
            arr1.get(0).viewAsses();
        }
        if(arr.isEmpty() && arr1.isEmpty()){
            System.out.println("No assessments");
        }

    }

    public void submitAss(String id){
        this.id1=id;
        System.out.println("Pending Assessment");
        if(!arr.isEmpty()){
            System.out.print("ID: 0 ");
            arr.get(0).viewAsses();
        }
        if(!arr1.isEmpty()){
            System.out.print("ID: 1 ");
            arr1.get(0).viewAsses();
        }

        System.out.print("Enter ID of assessment: ");
        int s= sc.nextInt();
        if(s==0){
            System.out.print("Enter filename of assignment: ");
            String file =sc.next();
            String zip= ".zip";
            if(!file.contains(zip)){
                System.out.println("Not a valid file");
                System.out.println("Enter Again");
                System.out.print("Enter filename of assignment: ");
                file= sc.next();
            }
            this._file=file;
            arr.remove(0);
        }
        if(s==1){
            arr1.get(0).viewAsses();
            String _q= sc.next();
            arr1.remove(0);
        }
    }


    public void gradeAsses() {
        System.out.print("Enter ID of assessment to view submissions: ");
        int in=sc.nextInt();
        System.out.println("Choose ID from these ungraded submissions");
        System.out.println("Submission:");
        System.out.println("Submission:"+_file);
        System.out.println("Max Marks: "+ arr.get(0).getMarks());
        System.out.print("Marks Scored: ");
        int marks =sc.nextInt();
    }

    public void closeAssess(){
        System.out.print("Enter id of assignment to close:");
        int s1= sc.nextInt();
            if (s1 == 0 && arr.size() >0) {
                arr.remove(0);
            } else if (s1 == 1 && arr1.size()>0) {
                arr1.remove(1);
            }
        }




}
