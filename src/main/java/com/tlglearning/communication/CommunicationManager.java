package com.tlglearning.communication;


import com.tlglearning.app.GameFrame;

public class CommunicationManager {
    private static CommunicationManager instance;
    private GameFrame app;

    private CommunicationManager(){

    }

    public static CommunicationManager getInstance(){
        if (instance == null){
            instance = new CommunicationManager();
        }

        return instance;
    }

    public void addObserver(GameFrame app){
        this.app = app;
    }

    public void communicateToApp(String txt){
        app.appendToGUI(txt);
        app.appendToGUI("\n");

    }


}
