package ru.mirea.practice.s0000001;

class Processor {
    int key;
    String name;
    double frequency;
    int cacheSize;
    double busFrequency;
    int specint;
    int specfp;

    public Processor(int key, String name, double frequency, int cacheSize, double busFrequency, int specint, int specfp) {
        this.key = key;
        this.name = name;
        this.frequency = frequency;
        this.cacheSize = cacheSize;
        this.busFrequency = busFrequency;
        this.specint = specint;
        this.specfp = specfp;
    }
}
