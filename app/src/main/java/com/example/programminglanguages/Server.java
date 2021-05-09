package com.example.programminglanguages;

import java.util.ArrayList;
import java.util.List;

public class Server {
   public static List<LanguagesModel> listt = new ArrayList<>();

    public static List<LanguagesModel>getData(){
        listt.add(new LanguagesModel("Java",R.drawable.java));
        listt.add(new LanguagesModel("C++" , R.drawable.cpp));
        listt.add(new LanguagesModel("C#" , R.drawable.chh));
        listt.add(new LanguagesModel("Javascript" , R.drawable.javascript));
        listt.add(new LanguagesModel("Python" , R.drawable.python));
        listt.add(new LanguagesModel("Kotlin" , R.drawable.kotlin));
        return listt;

    }
}
