package org.example.recursive;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private int departmentId;
    private String departmentName;
    private int parentDepartmentId;

    // 생성자, getter, setter는 생략

    // 재귀적으로 부서 계층을 출력하는 메서드
    public static void printDepartmentHierarchy(List<Department> departments, int startDepartmentId, String prefix) {
        for (Department department : departments) {
            if (department.getParentDepartmentId() == startDepartmentId) {
                System.out.println(prefix + department.getDepartmentName());
                printDepartmentHierarchy(departments, department.getDepartmentId(), prefix + "  ");
            }
        }
    }

    public static void main(String[] args) {
        // 가상의 부서 데이터 생성
        List<Department> departments = new ArrayList<>();
        departments.add(new Department(1, "IT", 0));
        departments.add(new Department(2, "Development", 1));
        departments.add(new Department(3, "Testing", 1));
        departments.add(new Department(4, "HR", 0));
        departments.add(new Department(5, "Recruitment", 4));
        departments.add(new Department(6, "Training", 4));
        departments.add(new Department(7, "Training2", 1));
        departments.add(new Department(8, "Training3", 6));

        // 시작 부서 ID 지정
        int startDepartmentId = 0;

        // 재귀적으로 부서 계층 출력
        printDepartmentHierarchy(departments, startDepartmentId, "");
    }

    public Department(int departmentId, String departmentName, int parentDepartmentId) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.parentDepartmentId = parentDepartmentId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public int getParentDepartmentId() {
        return parentDepartmentId;
    }
}
