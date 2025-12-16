package ru.netology.statistic.DataClass;

public class PosterManager {
    private String[] posters = new String[0];
    private int printLastposter;


    public PosterManager() {
        this.printLastposter = 5;
    }

    public PosterManager(int lastPoster) {
        this.printLastposter = lastPoster;
    }

    public void addPoster(String newPoster) {
        String[] tmp = new String[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = newPoster;
        posters = tmp;
    }

    public String[] findAll() {
        return posters;
    }

    public String[] findLast() {
        int index = 0;
        String[] lastPosters = new String[printLastposter];
        for (int i = posters.length - 1; i > -1; i--) {
            if (index == printLastposter) {
                break;
            }
            lastPosters[index] = posters[i];
            index++;
        }
        int sdf = 0;
        return lastPosters;
    }


    public int getPrintLastposter() {
        return printLastposter;
    }


}