public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mehmet", "5559998766", "Tarih");
        Teacher t2 = new Teacher("Ahmet", "0000000", "Fizik");
        Teacher t3 = new Teacher("Kül Yutmaz", "11111", "Kimya");


        // t1.print();
        Course tarih = new Course("Tarih", "101", "TRH", 0 );
        Course fizik = new Course("Fizik", "102", "FZK", 0 );
        Course kimya = new Course("Kimya", "103", "KMY", 0 );
        tarih.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Kemal Sunal", "1453", "4. Sınıf",tarih,fizik,kimya);
        s1.addBulkExamNote(100,50,15);
        s1.printNote();
        s1.isPass();
    }
}
