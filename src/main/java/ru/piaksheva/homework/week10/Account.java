package ru.piaksheva.homework.week10;

import java.util.HashMap;

public class Account {
    String login;
    String password;
    HashMap<String, String> user = new HashMap<>();

    public Account(String login) {
        this.login = login;
    }

    public Account(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void checkLogin(String login) {
        try {
            if (login == null || login.length() < 5 || login.length() > 20) {
                System.out.println("Введен недопустимый логин");
                throw new WrongLoginException();
            }
            this.login = login;
        } catch (WrongLoginException e) {
            System.out.println("Исключение " + e);
        }
    }

    public void checkPassword(String password, String confirmPassword) {
        try {
            if (password == null || password.length() < 8 || password.length() > 20 || password != confirmPassword) {
                System.out.println("Введен недопустимый пароль");
                throw new WrongPasswordException();
            }
            this.password = password;
        } catch (WrongPasswordException e) {
            System.out.println("Исключение " + e);
        }
    }

    public void putUser(String login, String password) {
        user.put(login,password);
    }
    public void checkLoginAndPassword(String login, String password) {
        try {
            if (!user.containsKey(login) || !password.equals(user.get(login))) {
                System.out.println("Недопустимая пара логин и пароль");
                throw new WrongLoginOrPasswordException();
            }
            System.out.println("Вы успешно вошли в аккаунт!");;
        } catch (WrongLoginOrPasswordException e) {
            System.out.println("Исключение " + e);
        }
    }
}