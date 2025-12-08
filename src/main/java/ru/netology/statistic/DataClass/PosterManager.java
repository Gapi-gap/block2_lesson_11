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

    public void findAll() {
        for (String poster : posters) {
            System.out.println(poster + " ");
        }
    }

    public void findLast() {
        if (printLastposter > posters.length) {
            printLastposter = posters.length;
        }
        for (int i = printLastposter; i < posters.length; i++) {
            System.out.println(posters[i] + " ");
        }
    }

    public int getPrintLastposter() {
        return printLastposter;
    }
}