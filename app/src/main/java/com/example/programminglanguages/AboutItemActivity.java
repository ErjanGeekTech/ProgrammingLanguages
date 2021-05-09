package com.example.programminglanguages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AboutItemActivity extends AppCompatActivity {

    private String language;
    private TextView txtHeader, txtDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_item);
        txtHeader = findViewById(R.id.header_txt);
        txtDescription = findViewById(R.id.description_txt);
        language = getIntent().getStringExtra("language");
        setData();
    }

    private void setData() {
        switch (language) {
            case "Java":
                txtHeader.setText("Java");
                txtDescription.setText("Java is used for virtually all types of web applications and is the universal standard for the development and distribution of embedded and mobile applications, web content, and enterprise software. There are more than 9 million Java application developers worldwide that enable you to efficiently develop, deploy and use superior applications and services.");
                break;
            case "C++":
                txtHeader.setText("C++");
                txtDescription.setText("C++ - is a general-purpose compiled strongly typed programming language. Supports different programming paradigms: procedural, generalized, functional; most attention is paid to the support of object-oriented programming.");
                break;
            case "C#":
                txtHeader.setText("C#");
                txtDescription.setText("C# is an object and component oriented programming language. C# provides language constructs to directly support this concept of work. This makes C# suitable for creating and using software components.");
                break;
            case "Javascript":
                txtHeader.setText("Javascript");
                txtDescription.setText("JavaScript is a language that allows you to apply complex things to a web page - every time a web page has more than just static rendering - displaying periodically updated content, or interactive maps, or animating 2D / 3D graphics, or scrolling video in the player, etc. - you can be sure that most likely it was not without JavaScript. This is the third layer of the layered cake of standard web technologies, two of which (HTML and CSS) we covered in detail in other parts of the tutorial.");
                break;
            case "Python":
                txtHeader.setText("Python");
                txtDescription.setText("Python is an actively developing scripting language that is used to solve a large volume of the most diverse problems and tasks. Python is useful in creating computer and mobile applications, it is used in working with a large amount of information, in the development of websites and other various projects, it is used in machine learning. This programming language is used by large well-known corporations such as Spotify and Amazon (for example, to analyze data and create a recommendation algorithm), YouTube, Instagram and even Walt Disney. Thus, Python has found its place in various fields - with its help you can solve many problems of varying complexity.");
                break;
            case "Kotlin":
                txtHeader.setText("Kotlin");
                txtDescription.setText("Kotlin is a statically typed programming language from JetBrains. Kotlin can be used to build mobile and web applications.Kotlin runs on top of a Java Virtual Machine (JVM) and compiles to bytecode when compiled. That is, as in the case of Java, we can run a Kotlin application wherever the JVM is installed. Although it is also possible to compile the code to JavaScript and run in a browser. And besides, it is possible to compile Kotlin code into native binaries that will work without any virtual machine. Thus, the range of platforms for which you can create applications in Kotlin is extremely wide - Windows, Linux, Mac OS, iOS, Android.");
                break;
        }
    }
}