package com.example.config;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

/**
 * FAULTY "Singleton": public constructor, getInstance() returns a NEW instance
 * each time,
 * not thread-safe, reload allowed anytime, mutable global state,
 * reflection+serialization-friendly.
 */
public class AppSettings implements Serializable {
    private final Properties props = new Properties();

    // Private static volatile instance for thread safety
    private static volatile AppSettings instance;

    private AppSettings() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to get the singleton instance");
        }
    } // should not be public for true singleton

    public static AppSettings getInstance() {
        if (instance == null) {
            synchronized (AppSettings.class) {
                if (instance == null) {
                    instance = new AppSettings();
                }
            }
        }
        return instance;
    }

    private Object readResolve() throws ObjectStreamException {
        return getInstance(); // "Give me the existing singleton, don't create new"
    }

    public void loadFromFile(Path file) {
        try (InputStream in = Files.newInputStream(file)) {
            props.load(in);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public String get(String key) {
        return props.getProperty(key);
    }
}
