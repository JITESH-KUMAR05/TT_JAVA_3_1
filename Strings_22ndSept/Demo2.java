class A
{
    public static void main(String args[]){
        String s1 = new String("charan");
        System.out.println(s1.concat(" Software")); // without the assignment it will not change the original string 
        System.out.println(s1); // original string remains same
        s1 = s1.concat(" Software"); // now it will change the original string as we assigned it back to s1
        System.out.println(s1); // original string changed
    }
}

//  SCP --> charan , software
//  Heap --> charan software

//  heap objects are going to have different memory locations or references 
//  SCP objects are going to have same memory locations or multiple references
//  java garbage collector will take care of removing the unreferenced objects from the heap memory
//  java garbage collector will not take care of removing the unreferenced objects from the SCP
//  as the JVM  will give implicit reference to the SCP objects
//  so the SCP objects will not be eligible for garbage collection
//  SCP object can have any number of references
//  but heap object can have only one reference
//  SCP objects are immutable
//  heap objects are mutable
//  SCP objects are created using string literals
//  heap objects are created using new keyword