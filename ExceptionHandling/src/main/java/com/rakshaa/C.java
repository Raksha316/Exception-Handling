package com.rakshaa;
//ClassNotFoundException.........
public class C {
    public static void main(String[] args) {
        try {
            Class.forName("com.rakshaa.Driver");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}

