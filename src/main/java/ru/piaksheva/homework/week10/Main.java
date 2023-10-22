package ru.piaksheva.homework.week10;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("cvrebgr", "erkfpsnheklf");
//        account.checkLogin("cvr");
//        account.checkLogin("cvrhjdkhdshucbhueubhuhudnhcss");
//        account.checkLogin(null);
//        account.checkPassword("sjljs", "sjljs");
//        account.checkPassword("dsdkshfkhsduhsekhdbuhisdk", "dsdkshfkhsduhsekhdbuhisdk");
//        account.checkPassword(null, null);
//        account.checkPassword("erkfpsnheklf", "erkfpsnheklfdf");
        account.putUser("jsbcjsbc", "sjkdjkdfijkfn");
        account.putUser("hdfkdhfc", "hdfkjcbsdk");
        account.putUser("nckcnks", "jcjkudllc");
        account.checkLoginAndPassword(null, "sjkdjkdfijkfn");
        account.checkLoginAndPassword("dfcvfbb", "dfvddffmjjhf");
        account.checkLoginAndPassword("jsbcjsbc", "sjkdjkdfijkfn");
    }
}
