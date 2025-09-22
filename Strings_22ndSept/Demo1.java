/*
there are two types of memory which are useful in this concept 
these are 
1) heap 
2) SCP --> string constant pool 

* if there is any constant in a statement then it's going to be stored in the SCP
* if the same contant is used again in the program then the SCP is not going to allocate new memory to the contant again it will be like a reference 
* in the heap we are storing objects which are different so the address will be different 
 */

class A
{
    public static void main(String args[]){
        String s1 = new String("charan");
        String s2 = new String("charan");
        String s3 = "charan";
        String s4 = "charan";
        System.out.println(s1==s2); // false  --> this compares the address
        System.out.println(s3==s4); // true --> this compares the address

        System.out.println(s1.equals(s2)) // true --> this compares the content
        
    }
}