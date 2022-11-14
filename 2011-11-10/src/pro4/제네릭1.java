package pro4;

class EmployeeInfos{
    public int rank;
    EmployeeInfos(int rank){ this.rank = rank; }
}
class Person<T, S>{
    public T info;
    public S id;
    Person(T info, S id){ 
        this.info = info; 
        this.id = id;
    }
}
public class 제네릭1 {
    public static void main(String[] args) {
    	Integer id= new Integer(30);
        Person<EmployeeInfos, Integer> p1 = new Person<EmployeeInfos, Integer>(new EmployeeInfos(1), id);
        System.out.println(id);
        System.out.println(p1.id.intValue());
        System.out.println();
        EmployeeInfo e = new EmployeeInfo(2);
        Integer i=new Integer(20);
        Person p2= new Person(e,i);
        System.out.println(i);
    }
}