package com.rakshaa;
//ClassNotFoundException.........
class Test {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}

