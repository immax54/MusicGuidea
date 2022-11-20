package com.example.youtubeplayerview;

import static com.example.youtubeplayerview.Profile.sharedPreferences;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;


public class App extends Application {

    static App _instance;

    Context context;
    SharedPreferences sharedPref;
    SharedPreferences.Editor sharedPrefEditor;

    public static App instance(Context context) {
        if (_instance == null) {
            _instance = new App();
            _instance.configSessionUtils(context);
        }
        return _instance;
    }
    public static App instance() {
        return _instance;
    }
    //Состояние приложения в новом экземпляре
    public void configSessionUtils(Context context) {
        this.context = context;
        sharedPref = context.getSharedPreferences("AppPreferences", Activity.MODE_PRIVATE);
        sharedPrefEditor = sharedPref.edit();
    }
    //Запись контекста приложения
    public void storeValueInt(String key, Integer value) {
        sharedPrefEditor.putInt(key, value);
        sharedPrefEditor.commit();
    }
 //Запись числа по id из поля ввода по кнопке
    public void storeValueString(String key, String value) {
        sharedPrefEditor.putString(key, value);
        sharedPrefEditor.commit();
    }
    //Запись строки по id из поля ввода по кнопке
    public Integer fetchValueString(String key) {
        return sharedPref.getInt(key, 0);
    }
//Получение числа по id
    public String fetchValueStringStr(String key) {
        return sharedPref.getString(key, null);
    }
}
//Получение строки по id