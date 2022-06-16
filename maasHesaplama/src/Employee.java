class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double extra;
    double tax;

    double bonus;





    Employee(String name,double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void tax(){
        if (this.salary <= 1000.0){
            this.tax = 0;
        } else if (this.salary > 1000.0){
            this.tax = salary*0.03;
        }
    }

    void bonus(){
        if(this.workHours > 40){
            this.bonus = (this.workHours-40)*30;
        }
    }

    void raiseSalary(){
        int year = 2021;
        if (2021 - this.hireYear <= 10){
            this.extra = salary*0.05;
        }else if(2021- this.hireYear > 10 && 2021- this.hireYear <= 19){
            this.extra = salary*0.10;
        }else if(2021- this.hireYear > 19){
            this.extra = salary*0.15;
        }else {
            this.extra = 0;
        }
    }
    void printEmployee(){
        System.out.println("İsim :"+this.name);
        System.out.println("Maaş : "+this.salary);
        System.out.println("Çalışma Saati : "+this.workHours);
        System.out.println("Başlangıç Yılı : "+this.hireYear);
        System.out.println("Vergi : "+this.tax);
        System.out.println("Bonus : "+this.bonus);
        System.out.println("Maaş Artışı : "+this.extra);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+ (this.salary+this.bonus-this.tax));
        System.out.println("Zamlı Maaş : "+(this.extra+this.salary));
    }

}
