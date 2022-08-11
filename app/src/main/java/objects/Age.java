package objects;

public class Age {
    private int age;
    public Age(int age)
    {
    this.age = age;
    }
    public void setAge(int age)
    {
//        System.out.println("Age X : "+this.age );
        if(age>this.age)
        {
            this.age=age;
        }
    }
    public int getAge()
    {
        return age;
    }

    public static void main(String[] args) {
    Age age = new Age(13);
        age.setAge(2);
        age.setAge(45);
        age.setAge(-1);
        System.out.println("Age is: "+age.getAge());
    }
}
