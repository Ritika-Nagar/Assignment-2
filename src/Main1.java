import java.util.*;
import java.text.*;



class Main1 {


    public static void main(String[] args) {

        ArrayList<String> InstructorsList = new ArrayList<String>();
        ArrayList<InsComm> CommList = new ArrayList<InsComm>();
        ArrayList<Slides> SlideList = new ArrayList<Slides>();
        ArrayList<Video> VideoList = new ArrayList<Video>();
        ArrayList<Quiz> QuizList = new ArrayList<Quiz>();
        ArrayList<Assignment> AssignList = new ArrayList<Assignment>();
        ArrayList<Date> DateList= new ArrayList<Date>();
        ArrayList<Date> DateListC= new ArrayList<Date>();


        InsComm _ins = new InsComm();
        SimpleDateFormat sd = new SimpleDateFormat(
                "yyyy.MM.dd G 'at' HH:mm:ss z");


        Scanner sc = new Scanner(System.in);
        int option;
        do{
            System.out.println("Welcome to Backpack");
            System.out.println("1. Enter as instructor\n" +
                    "2. Enter as student\n" +
                    "3. Exit");
            option = sc.nextInt();

                if (option == 1) {
                    InstructorsList.add("I0");
                    InstructorsList.add("I1");
                    System.out.println("Instructors:\n" +
                            "0 - I0\n" +
                            "1 - I1");
                    System.out.print("Choose ID: ");
                    int id = sc.nextInt();
                    System.out.print("Welcome ");
                    System.out.println(InstructorsList.get(id));
                    Slides s= new Slides();
                    s.setId(id);
                    System.out.println("{INSTRUCTOR MENU}");
                    String ID =InstructorsList.get(id);
                    Display _disp= new Display();
                    Submit sub= new Submit(AssignList,QuizList);
                    int inp = sc.nextInt();
                    while(inp!=9){


                        //Add class Material

                        if (inp == 1) {
                            System.out.println("1. Add Lecture Slide\n" +
                                    "2. Add Lecture Video");
                            int in = sc.nextInt();
                            if (in == 1) {
                                Slides le = new Slides();
                                le.addLecture();
                                SlideList.add(le);
                                Date date = new Date();
                                DateList.add(date);

                            } else if (in == 2) {
                                Video le = new Video();
                                le.addLecture();
                                VideoList.add(le);
                                Date date1 = new Date();
                                DateList.add(date1);
                            }
                            _disp.display(ID);



                        }
                        // Add assessments
                        if (inp == 2) {
                            System.out.println("1. Add Assignment\n" +
                                    "2. Add Quiz");
                            int in = sc.nextInt();
                            if (in == 1) {
                                Assignment _assign = new Assignment();
                                _assign.addAsses();
                                AssignList.add(_assign);


                            } else if (in == 2) {
                                Quiz _quiz = new Quiz();
                                _quiz.addAsses();
                                QuizList.add(_quiz);
                            }
                            _disp.display(ID);
                        }

                        // View Lecture Material
                        if(inp==3){
                            Iterator<Slides> itr= SlideList.iterator();
                            while(itr.hasNext()){
                                Slides sl= itr.next();
                                sl.viewLecture();
                            }
                            ArrayList<String> arr= SlideList.get(0).get_slides();
                            Iterator<String> it= arr.iterator();
                            while(it.hasNext()){
                                String st= it.next();
                                System.out.println("Content of slide: "+st);
                            }
                            sd.setTimeZone(TimeZone.getTimeZone("IST"));
                            System.out.println("Date of Upload: "+sd.format(DateList.get(0)));
                            System.out.println("Uploaded by: "+InstructorsList.get(id));

                            // for Video lecture
                            if(VideoList.isEmpty()){
                                System.out.println("No Video available");
                            }else {
                                Iterator<Video> itr1= VideoList.iterator();
                                while(itr1.hasNext()){
                                    Video sl1= itr1.next();
                                    sl1.viewLecture();
                                }
                                System.out.println("Date of Upload: "+sd.format(DateList.get(1)));
                                System.out.println("Uploaded by: "+InstructorsList.get(id)); }
                            _disp.display(ID);
                        }

                        // view Assessment
                        if(inp==4){
                            sub.viewAsses();
                            _disp.display(ID);
                        }

                        // Grade Assessment
                        if(inp==5){
                            System.out.println("List of assessments");
                            sub.viewAsses();
                            System.out.println("-----------");
                            sub.gradeAsses();
                            _disp.display(ID);
                        }

                        // Close Assessment
                        if(inp==6){
                            System.out.println("List of open Assignment");
                            sub.viewAsses();
                            sub.closeAssess();
                            _disp.display(ID);
                        }

                        // View Comments
                        if (inp == 7) {
                            InsComm _comm= new InsComm();
                            _comm.viewComm(CommList,InstructorsList.get(id));
                            sd.setTimeZone(TimeZone.getTimeZone("IST"));
                            System.out.println(sd.format(DateListC.get(0)));
                            _disp.display(ID);
                        }
                        // Add Comments
                        if (inp == 8) {
                            _ins.addComments();
                            CommList.add(_ins);
                            Date date1= new Date();
                            DateListC.add(date1);
                            _disp.display(ID);
                        }
                        inp=sc.nextInt();
                    }
                }


            ArrayList<String> StudentList = new ArrayList<String>();
                if (option == 2) {
                System.out.println("Students:\n" +
                        "0 - S0\n" +
                        "1 - S1\n" +
                        "2 - S2");
                StudentList.add("S0");
                StudentList.add("S1");
                StudentList.add("S3");
                System.out.print("Choose ID: ");
                int id1 = sc.nextInt();
                Display _disp1= new Display();
                String ID1= StudentList.get(id1);

                System.out.print("Welcome ");
                System.out.println(StudentList.get(id1));
                System.out.println("{STUDENT MENU}");

                Scanner scan1= new Scanner (System.in);
                Submit sub1 = new Submit(AssignList, QuizList);
                int inp1 = scan1.nextInt();

                while(scan1.nextInt()!=7) {

                    //View lecture
                    if (inp1 == 1) {
                        if(!SlideList.isEmpty()) {
                            SlideList.get(0).viewLecture();
                            ArrayList<String> arr = SlideList.get(0).get_slides();
                            Iterator<String> it = arr.iterator();
                            while (it.hasNext()) {
                                String s = it.next();
                                System.out.println("Content of slide: " + s);

                            }
                            sd.setTimeZone(TimeZone.getTimeZone("IST"));
                            System.out.println(sd.format(DateList.get(0)));
                            _disp1.display1(ID1);
                        }
                        else{
                            System.out.println("Lecture not uploaded");
                        }
                    }

                    // View Assessments
                    if(inp1==2){
                        sub1.viewAsses();
                        _disp1.display1(ID1);
                    }

                    // Submit Assessment
                    if(inp1==3){
                        sub1.submitAss(InstructorsList.get(id1));
                        _disp1.display1(ID1);
                    }


                    //View Comments
                    if (inp1 == 5) {
                        InsComm _comm= new InsComm();
                        _comm.viewComm(CommList,InstructorsList.get(id1));
                        sd.setTimeZone(TimeZone.getTimeZone("IST"));
                        System.out.println(sd.format(DateListC.get(0)));

                        _disp1.display1(ID1);

                    }
                    // Add Comments
                    if (inp1 == 6) {
                        InsComm _ins1 = new InsComm();
                        _ins1.addComments();
                        CommList.add(_ins1);
                        _disp1.display1(ID1);
                    }

                }
            }
        }while(option!=3);

    }

}




















