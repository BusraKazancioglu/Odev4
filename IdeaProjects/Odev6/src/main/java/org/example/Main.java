package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        String[] kelimeler = {"kalem", "elalem", "kelam", "kelime"};

        System.out.println("Kelime Dizisi: " + Arrays.toString(kelimeler));


        List<String> tekrarlıKelimeListesi = new ArrayList<>();

        for (String kelime : kelimeler) {
            if (tekrarliHarfVarMi(kelime)) {
                tekrarlıKelimeListesi.add(kelime);
            }
        }

        System.out.println("Tekrarlı harf içeren kelimeler: " + tekrarlıKelimeListesi);

        // Eğer 2'den az kelime bulunursa aramayı durdur
        if (tekrarlıKelimeListesi.size() < 2) {
            System.out.println("2'den az tekrarlı kelime bulunduğu için işleme devam edilmiyor.");
            return;
        }


        List<Character> harfListesi = new ArrayList<>();

        for (String kelime : tekrarlıKelimeListesi) {
            List<Character> tekrarlayanHarfler = tekrarlayanHarfleriBul(kelime);
            harfListesi.addAll(tekrarlayanHarfler);
        }

        System.out.println("Oluşturulan harf listesi: " + harfListesi);

        // 4) Harf listesinden rastgele metin üret
        String randomMetin = rastgeleMetinOlustur(harfListesi, 8);
        System.out.println("Rastgele oluşturulan metin: " + randomMetin);
    }


    public static boolean tekrarliHarfVarMi(String kelime) {
        Set<Character> set = new HashSet<>();

        for (char c : kelime.toCharArray()) {
            if (!set.add(c)) {
                return true;
            }
        }
        return false;
    }

    public static List<Character> tekrarlayanHarfleriBul(String kelime) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : kelime.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Character> tekrarEden = new ArrayList<>();
        for (var entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                tekrarEden.add(entry.getKey());
            }
        }
        return tekrarEden;
    }


    public static String rastgeleMetinOlustur(List<Character> harfListesi, int uzunluk) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < uzunluk; i++) {
            char c = harfListesi.get(random.nextInt(harfListesi.size()));
            sb.append(c);
        }
        return sb.toString();
    }
}