package org.example;

public class Main {
    public static void main(String[] args) {

        Departman yazilimDepartmani = new Departman("Yazılım");

        Personel p1 = new Personel("Büşra", "Kazancıoğlu", "QA Engineer");
        Personel p2 = new Personel("Ayşıl", "Kazancıoğlu", "Stajyer QA");
        Personel p3 = new Personel("Blaa", "Blala", "Senior Test Mentor");

        yazilimDepartmani.personelEkle(p1);
        yazilimDepartmani.personelEkle(p2);
        yazilimDepartmani.personelEkle(p3);

        yazilimDepartmani.personelleriListele();
    }
}