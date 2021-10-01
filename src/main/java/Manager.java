public class Manager {

    private int lastFilmInOutput;
    private Film[] films = new Film[0];

    public Manager() {
        lastFilmInOutput = 10;
    }

    public Manager(int lastFilm) {
        this.lastFilmInOutput = lastFilm;
    }

    public void addFilm(Film film) {
        int length = films.length + 1;
        Film[] tmp = new Film[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public Film[] getAll() {
        int resultLength;
        if (films.length < lastFilmInOutput) {
            resultLength = films.length;
        } else {
            resultLength = lastFilmInOutput;
        }
        Film[] result = new Film[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }

}
