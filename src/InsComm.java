import java.util.*;


public class InsComm implements Comments{
    private String _comm;
    private ArrayList<InsComm> arr;
    private String id;
    Scanner sc= new Scanner(System.in);

    public void viewComm(ArrayList<InsComm> Arr, String ID){
        this.arr=Arr;
        this.id=ID;
        boolean ans = arr.isEmpty();
        if (ans) {
            System.out.println("No Comments is been added");
        } else {
            Iterator<InsComm> it= arr.iterator();
            while(it.hasNext()) {
                InsComm in= it.next();
                System.out.print(in.get_comm());
                System.out.println(" -"+ id);
            }

        }


    }



    public void addComments(){
        System.out.print("Enter comments: ");
        String comm= sc.next();
        this._comm=comm;

    }

    public String get_comm() {
        return _comm;
    }

    public void set_comm(String _comm) {
        this._comm = _comm;
    }

}
