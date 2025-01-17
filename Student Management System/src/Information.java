

public class Information {
    private int id;
    private String name;
    private String course;


    public Information( int id, String name, String course ){
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public int getid(){
        return id;
    }

    public String getname(){
        return name;
    }

    public String getcourse(){
        return course;
    }

    public void displayInformation(){
        System.out.println("ID: " + id + "\nName: " + name + "\nCourse:" + course);
    }

        
    }

