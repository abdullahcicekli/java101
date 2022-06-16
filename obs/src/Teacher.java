public class Teacher {
    String name;
    String phone;
    String branch;

    Teacher( String name,String phone, String branch){
        this.name = name;
        this.phone = phone;
        this.branch = branch;
    }
    void print(){
        System.out.println("Adı \t\t:"+ this.name);
        System.out.println("Telefon \t:"+ this.phone);
        System.out.println("Bölüm \t\t:"+ this.branch);
    }
}
