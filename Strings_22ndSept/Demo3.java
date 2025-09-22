class A{

    public static void main(String args[]){
        String s1 = new String("spring");
        s1.concat(" summer");
        String s2 = s1.concat(" winter");
        System.out.println(s1);
        System.out.println(s2);

    }
}

//  SCP --> spring , summer , winter
//  Heap --> s1->spring  , s2 -> spring winter