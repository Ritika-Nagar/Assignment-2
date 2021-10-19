import java.util.Scanner;
import java.util.ArrayList;

class Video implements Lecture {
    Scanner sc= new Scanner(System.in);
    private String _title;
    private String _file;
    Video (){}
    /*Video(String s, String f){
        this._title=s;
        this._file=f;
    }*/

    public String get_title() {
        return _title;
    }

    public String get_file() {
        return _file;
    }

    public void set_file(String _file) {
        this._file = _file;
    }

    public void set_title(String _title) {
        this._title = _title;
    }

    public void/*ArrayList<Lecture>*/ addLecture(){
        ArrayList<Lecture> videoList= new ArrayList<Lecture>();
        System.out.print("Enter topic of video: ");
        String d = sc.next();

        System.out.print("Enter filename of video: ");
        String filename = sc.next();
        String s2 = ".mp4";
        if (!filename.contains(s2)) {
            System.out.println("Not a valid submission");
            System.out.println("Enter Again");
            System.out.println("Enter filename of video: ");
            filename = sc.next();
        }
        this._title=d;
        this._file=filename;

        //videoList.add(new Video(d,filename));
    //return videoList;
    }
    public void viewLecture() {
        System.out.println("Title of Video: "+_title);
        System.out.println("Video File"+ _file);
    }
}

