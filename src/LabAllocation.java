import java.util.Scanner;

public class LabAllocation {

    public static String Allocation(int lab1,int lab2,int lab3,int no_of_students)
    {
        int remSeatsL1 = lab1 - no_of_students;
        int remSeatsL2 = lab2 - no_of_students;
        int remSeatsL3 = lab3 - no_of_students;

        System.out.println(remSeatsL1);
        System.out.println(remSeatsL2);
        System.out.println(remSeatsL3);

        if(remSeatsL1 < 0)
            remSeatsL1 = Integer.MAX_VALUE;
        if(remSeatsL2 < 0)
            remSeatsL2 = Integer.MAX_VALUE;
        if(remSeatsL3 < 0)
            remSeatsL3 = Integer.MAX_VALUE;

        String res = null;

        if (remSeatsL1 < remSeatsL2 && remSeatsL1 < remSeatsL3)
            res = "L1";
        if (remSeatsL2 < remSeatsL1 && remSeatsL2 < remSeatsL3)
            res = "L2";
        if (remSeatsL3 < remSeatsL1 && remSeatsL3 < remSeatsL2)
            res = "L3";
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter L1 Capacity: ");
        int lab1 = scanner.nextInt();
        System.out.print("Enter L2 Capacity: ");
        int lab2 = scanner.nextInt();
        System.out.print("Enter L3 Capacity: ");
        int lab3 = scanner.nextInt();
        System.out.print("Enter no of Students : ");
        int no_of_students = scanner.nextInt();

        String res = Allocation(lab1,lab2,lab3,no_of_students);
        System.out.println("The Lab Allocated is : "+ res);
    }
}