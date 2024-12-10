package com.nanthan.inheritance.Hierarchical;

class first {
    String firstName;
    String lastName;

    public first(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

class second extends first {
    int age;

    public second(String firstName, String lastName,int age) {
        super(firstName, lastName);
        this.age = age;
    }
}

class three extends first {
    int account_number;
    public three(String firstName, String lastName,int account_number) {
        super(firstName,lastName);
        this.account_number = account_number;
    }
}
//hello chrcking
public class main {
    public static void main(String[] args) {
        three get = new three("nanthan","shetty",454545);
        System.out.println(get.firstName+" "+"acc number : "+get.account_number);
    }
}