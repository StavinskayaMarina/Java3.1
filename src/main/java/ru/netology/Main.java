package ru.netology;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Олег";
        post.patronymic = "Ильич";
        post.surname = "Петров";
        post.phone = "+7-900-345-00-90";
        post.passport = "1212 № 123456";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 16;
        post.birthday.month = 2;
        post.birthday.year = 1990;

    }
}