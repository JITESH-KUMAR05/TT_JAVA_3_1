class A{

    public static void main(String[] args) {
        String s1 = new String("you cannot change me");
        String s2 = new String("you cannot change me");
        System.out.println(s1==s2); // false because both are different objects in heap memory
        System.out.println(s1.equals(s2)); // true because both have same content
        String s3 = "you cannot change me";
        System.out.println(s1==s3); // false because s1 is in heap and s3 is in SCP
        String s4 = "you cannot change me";
        System.out.println(s3==s4); // true because both are in SCP and having same memory location
        String s5  = "you cannot " + "change me"; // compiler will optimize this and make it as "you cannot change me" in SCP
        System.out.println(s4==s5); // true because both are in SCP and having same memory location
        String s6 = "you cannot ";
        String s7 = s6 + "change me"; // at runtime it will create a new object in heap memory
        System.out.println(s4==s7); // false because s4 is in SCP and s7 is in heap memory
        final String s8 = "you cannot ";
        String s9 = s8 + "change me"; // compiler will optimize this and make it as "you cannot change me" in SCP
        System.out.println(s4==s9); // true because both are in SCP and having same memory locations
    }
}