package StructuralDP.Composite;

import java.util.Arrays;

public class Composite {

    public static void main(String[] args) {
        Composite composite = new Composite();
        composite.CompositeDemo();

    }

    public void CompositeDemo(){
        Department financeDepartment = new Finance();
        Department salesDepartment = new Sales();
        Department regionalDepartment =
                new RegionalDirectorate(
                        Arrays.asList(financeDepartment,salesDepartment));

        System.out.println(regionalDepartment.getName());
        System.out.println("****************");
        System.out.println(regionalDepartment.getEmployees());
    }

}