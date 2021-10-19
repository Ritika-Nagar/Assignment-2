import java.util.Scanner;
import java.util.ArrayList;
class Slides implements Lecture {
    ArrayList<String>Slideslis= new ArrayList<String>();
    private String _topic;
    private int _num;
    private String _slides;
    private int id;
    Slides(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    Scanner sc=new Scanner(System.in);

    public void addLecture() {

        ArrayList<Lecture> slideList = new ArrayList<Lecture>();
        System.out.print("Enter topic of slides: ");
        String s = sc.next();

        System.out.print("Enter number of slides: ");
        int n = sc.nextInt();

        for (int ip = 1; ip <= n; ip++) {
            System.out.print("Content of slide " + ip + ": ");
            String slides = sc.next();
            Slideslis.add(slides);

        }
        this._topic = s;
        this._num = n;



    }

    public String get_topic() {
        return _topic;
    }

    public int get_num() {
        return _num;
    }

    public void set_num(int _num) {
        this._num = _num;
    }

    public void set_topic(String _topic) {
        this._topic = _topic;
    }



    public void viewLecture() {
        System.out.println("Title: "+ _topic);
        System.out.println("Number of Slides: "+_num);


    }
    public ArrayList<String> get_slides() {
        return Slideslis;
    }

    public void set_slides() {
        this._slides = _slides;
    }
}

