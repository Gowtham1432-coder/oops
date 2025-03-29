class student{
    void info(){
        String name;
        double percentage;
    }
    public student(String name,double percentage){
        this.name=name;
        this.percentage=percentage;
    }
}
class UGstudent extends student{
    @Override
    void info(){
        String name;
        double percentage;
        System.out.println(+name" must be checked for eligibility");
    }
    if(percentage<=60)
    {
        System.out.println(+name" is Eligible for UG");
    }
    else{
        System.out.println(+name" is not Eligble for UG");
    }
}
class PGstudent extends student{
    @Override
    void info(){
        String name;
        double percentage;
        System.out,println(+name" must be checked for eligibility");
    }
    if(percentage<=70)
    {
        System.out.println(+name" is Eligible for PG");
    }
    else{
        System.out.println(+name" is not Eligble for PG");
    }
}
public void main(String args[]){
    ug UGstudent=new UGstudent();
    pg PGstudent=new PGstudent();
    ug.student("Bhargavi",80);
    pg.student("Deekshitha",90);
}