package com.study.creator.prototype.shallow_clone;

/**
 * @author 一只小菜鸡
 * @version 1.0
 */
public class Citation implements Cloneable{
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
