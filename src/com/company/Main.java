package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String[]> dictionary = new HashMap<>();
        dictionary.put("Города", new String[]{"Бишкек", "Ош", "Нарын", "Талас" });
        dictionary.put("Улицы", new String[]{"Советская", "Чуй", "Манаса", "Лермонтова" });
        dictionary.put("Погода", new String[]{"дождливая", "пасмурная", "холодная", "жаркая" });
        dictionary.put("Дом", new String[]{"квартира", "участок", "аппартаменты", "" });

        for (Map.Entry<String, String[]> one: dictionary.entrySet(){
            System.out.println(" keys:" +one.getKey()+"Values:"+ Arrays.toString(one.getValue()));

        }
        HashMap<String, String[]> dictionaryD = new HashMap<>();
        dictionaryD.putAll(dictionary);
        Set<String>keysInMap = dictionary.keySet();
        Iterator<String>iterator = keysInMap.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            for (int k = 0; k <value.size() ; k++) {
                newArray[k] = values.get(k);
            }
            dictionaryD.put(each.one, newArray);

        }
        for (Map.Entry<String, String[]>print : dictionaryD.entrySet(){
            System.out.println(print.getKey()+" "+ Arrays.toString(print.getValue));
        }



    }
}

