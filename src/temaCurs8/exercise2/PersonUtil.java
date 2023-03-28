package temaCurs8.exercise2;

import java.sql.SQLOutput;

public class PersonUtil {
    public PersonUtil(Person person){
        this.person=person;
    }
    public String getFullName(){
        String fullName1=person.getFirstName()+""+person.getLastName();
        String fullName2=String.format("% %", person.getFirstName(), person.getLastName());
        String fullName3=new StringBuilder().append(person.getFirstName()).append(" ").append(person.getLastName()).toString();
        return fullName1;

    }

    public int getAge(){
        LocalDate birthDate=person.getBirthDate();
        LocalDate now=LocalDate.now();
        return now.getYear()-birthDate.getYear();
    }

    public static void main(String[] args){
        Employee employee=new Employee();
        employee.setBirthDate(LocalDate.of(year 2003, month 5,dayOfMonth10));

        PersonUtil personUtil=new PersonUtil(employee);

        System.out.println(personUtil.getAge());

    }
}
