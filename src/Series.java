class series {
    private String title; // Назва серіалу
    private int numberOfSeasons; // Кількість сезонів у серіалі
    private int startYear; // Рік початку виходу серіалу
    private String genre; // Жанр серіалу
    private double averageRating; // Середній рейтинг серіалу (наприклад, за IMDb)



    // Конструктор за замовчуванням

    public series() {

    }



    // Конструктор з параметрами

    public series(String title, int numberOfSeasons, int startYear, String genre, double averageRating) {

        this.title = title;

        this.numberOfSeasons = numberOfSeasons;

        this.startYear = startYear;

        this.genre = genre;

        this.averageRating = averageRating;

    }



    // Гетери

    public String getTitle() {

        return title;

    }



    public int getNumberOfSeasons() {

        return numberOfSeasons;

    }



    public int getStartYear() {

        return startYear;

    }



    public String getGenre() {

        return genre;

    }



    public double getAverageRating() {

        return averageRating;

    }



    // Сетери

    public void setTitle(String title) {

        this.title = title;

    }



    public void setNumberOfSeasons(int numberOfSeasons) {

        this.numberOfSeasons = numberOfSeasons;

    }



    public void setStartYear(int startYear) {

        this.startYear = startYear;

    }



    public void setGenre(String genre) {

        this.genre = genre;

    }



    public void setAverageRating(double averageRating) {

        this.averageRating = averageRating;

    }

}