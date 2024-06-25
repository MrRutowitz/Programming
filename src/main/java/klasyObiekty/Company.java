package klasyObiekty;

public class Company {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();


        employee1.name = "Michal";
        employee1.surname = "Rutowicz";
        employee1.year = 1994;
        employee1.timeOfIntern = 2;

        employee2.name = "Oliwia";
        employee2.surname = "Mielczarek";
        employee2.year = 1997;
        employee2.timeOfIntern = 10;

        employee3.name = "Mark";
        employee3.surname = "Rybak";
        employee3.year = 1994;
        employee3.timeOfIntern = 5;

        System.out.println("Imie: " + employee1.name + " " + "Nazwisko: "+ employee1.surname + " "+"Rok urodzenia: " + " " +
                employee1.year+ " " + "Staz pracy: " + employee1.timeOfIntern);
        System.out.println("Imie: " + employee2.name + " " + "Nazwisko: "+ employee2.surname + " " + "Rok urodzenia: " + " " +
                employee2.year+ " " + "Staz pracy: " + employee2.timeOfIntern);
        System.out.println("Imie: " + employee3.name + " " + "Nazwisko: "+ employee3.surname + " " + "Rok urodzenia: " + " " +
                employee3.year+ " " + "Staz pracy: " + employee3.timeOfIntern);

    }
}
