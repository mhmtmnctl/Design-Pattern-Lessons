package StructuralDP.Composite;

import java.util.List;
import java.util.stream.Collectors;

public class RegionalDirectorate extends Department{
    List<Department> childDepartments;

    //childDepartmanları parametre olarak alan conts.
    public RegionalDirectorate(List<Department> childDepartments) {
        this.childDepartments = childDepartments;
    }

    @Override
    String getName() {
        return childDepartments.stream().map(Department::getName).collect(Collectors.joining(", "));
    }

    @Override
    List<String> getEmployees() {
        return childDepartments.stream().flatMap(d->d.getEmployees().stream()).collect(Collectors.toList());
        // Flatmap : Stream i başka bir stream e çevirmek için kullanılır
       // Bir giren değere karşılık birden fazla değer olabilir

    }
}