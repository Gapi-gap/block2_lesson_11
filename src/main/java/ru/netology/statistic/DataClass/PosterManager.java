package ru.netology.statistic.DataClass;

public class PosterManager {
    private String[] posters = new String[0];
    private int printLastposter;

    private int radioStation;

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
        int qtyPosters = 0;
        for (int i = posters.length - 1; i > -1; i--) {
            if (qtyPosters == printLastposter) {
                break;
            }
            System.out.println(posters[i] + " ");
            qtyPosters++;
        }
    }


    public int getPrintLastposter() {
        return printLastposter;
    }


}