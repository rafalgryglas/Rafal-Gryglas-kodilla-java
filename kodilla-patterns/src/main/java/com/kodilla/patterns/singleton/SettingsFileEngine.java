package com.kodilla.patterns.singleton;

public final class SettingsFileEngine {
    private static SettingsFileEngine settingsFileEngineInstance = null;
    private String fileName = "";

    private SettingsFileEngine() {
    }
//    public static SettingsFileEngine getInstance() {
//        if (settingsFileEngineInstance == null) {
//            settingsFileEngineInstance = new SettingsFileEngine()
//        }
//        return settingsFileEngineInstance;
//    }
//    w przypadku aplikacji wielowatkowej
    public static SettingsFileEngine getInstance() {
        if (settingsFileEngineInstance == null) {
            synchronized (SettingsFileEngine.class) {   //dwukrotne sprawdzenie, drugie w bloku synchronized - nie utworzy
                if(settingsFileEngineInstance == null) {      //równoczesnie osobnych obiektow Singletona przez rownolegle dzialajace watki
                    settingsFileEngineInstance = new SettingsFileEngine();
                }
            }
        }
        return settingsFileEngineInstance;
    }

    public String getFileName() {
        return fileName;
    }

    public void open(final String fileName) {
        this.fileName = fileName;
        System.out.println("Opening the settings file");
    }

    public void close() {
        this.fileName = "";
        System.out.println("Closing the settings file");
    }

    public boolean loadSettings() {
        System.out.println("Loading settings from file");
        return true;
    }

    public boolean saveSettings() {
        System.out.println("Saving settings to file");
        return true;
    }
}
