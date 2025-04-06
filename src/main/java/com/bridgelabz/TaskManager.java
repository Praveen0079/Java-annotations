package com.bridgelabz;

import java.lang.reflect.Method;

public class TaskManager {

     @TaskInfo(priority = 2,assignedTo = "Nitesh")
    public void myMethod(){
         System.out.println("Completing report task...");
     }

    public static void main(String[] args) throws Exception {
    TaskManager tm=new TaskManager();
            Method method=tm.getClass().getMethod("myMethod");

            TaskInfo annotation=method.getAnnotation(TaskInfo.class);
            System.out.println(method.getName());
            System.out.println(annotation.priority());
            System.out.println(annotation.assignedTo());


    }
}
