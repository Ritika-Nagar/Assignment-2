public class Display {
    private String id;
    private String iD;

    public void display(String id1){
        this.id= id1;
        System.out.println("----------------");
        System.out.print("Welcome ");
        System.out.println(id);
        System.out.println("{INSTRUCTOR MENU}");

    }

    public void display1(String Id){//pending...
        this.iD= Id;
        System.out.println("----------------");
        System.out.print("Welcome ");
        System.out.println(iD);
        System.out.println("{STUDENT MENU}");

    }

}
