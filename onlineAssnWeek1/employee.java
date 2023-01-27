package onlineAssnWeek1;

public class employee {
    int id;
    String dept;

    public employee(int idd, String dep) {
        id = idd;
        dept = dep;
    }

    public static void main(String[] args) {
        employee vro = new employee(34,"boomer");
        System.out.println(vro.dept);
    }
}
