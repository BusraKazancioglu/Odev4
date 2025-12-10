package org.example;

import java.util.ArrayList;
import java.util.List;

    public class Departman {

        private String departmanAdi;
        private List<Personel> personelListesi;

        public Departman(String departmanAdi) {
            this.departmanAdi = departmanAdi;
            this.personelListesi = new ArrayList<>();
        }

        public void personelEkle(Personel personel) {
            personelListesi.add(personel);
            System.out.println(personel.getAd() + " departmana eklendi.");
        }

        public void personelleriListele() {
            System.out.println("\n--- " + departmanAdi + " Departmanı Personel Listesi ---");
            for (Personel p : personelListesi) {
                System.out.println(p);
            }
        }
    }

