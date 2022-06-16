class Course {
    Teacher teach;
    String name;
    String code;
    String prefix;
    int note;

    Course(String name,String code,String prefix, int note){

        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = note;

    }

    void addTeacher (Teacher teach){
        if(teach.branch.equals(this.name)){
            this.teach = teach;
            //printTeacherInfo();
        }else{
            System.out.println("Öğretmen-Ders Uyuşmuyor.");
        }

    }

    void  printTeacherInfo(){
        this.teach.print();
    }


}
