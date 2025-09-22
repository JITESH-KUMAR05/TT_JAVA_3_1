/*
there are two types of memory which are useful in this concept 
these are 
1) heap 
2) SCP --> string constant pool 

* if there is any constant in a statement then it's going to be stored in the SCP
* 
 */



class A
{
    public static void main(String args[]){
        String s1 = new String("charan");
        String s2 = new String("charan");
        String s3 = "charan";
    }
}