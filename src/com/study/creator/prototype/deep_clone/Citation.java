package com.study.creator.prototype.deep_clone;

import java.io.Serializable;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class Citation implements Cloneable, Serializable {
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public Citation clone() {
        try {
            Citation clone = (Citation) super.clone();
            Student stu = student.clone();
            clone.setStudent(stu);
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
    public void show(){
        System.out.println(student.getName()+"成绩优秀");
    }
}
