public class PersonTest {
    private String name;
    private int age;

    //생성자
    public PersonTest(String name, int age){
        this.name = name;
        this.age = age;
    }
    //게터와 세터
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return  age;
    }
}
