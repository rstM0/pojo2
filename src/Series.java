class series {
    private String title; // Назва серіалу - private, оскільки назва є внутрішньою характеристикою серіалу і не повинна напряму змінюватися ззовні. Доступ до неї здійснюється через гетери та сетери.
    private int numberOfSeasons; // Кількість сезонів у серіалі - private, оскільки кількість сезонів є внутрішньою характеристикою і її зміна повинна контролюватися (якщо це необхідно) через сетери.
    private int startYear; // Рік початку виходу серіалу - private, оскільки рік початку є фундаментальною властивістю серіалу і зазвичай не змінюється після створення об'єкта.
    private String genre; // Жанр серіалу - private, оскільки жанр є описовою характеристикою і її пряма зміна ззовні не є типовим сценарієм.
    private double averageRating; // Середній рейтинг серіалу (наприклад, за IMDb) - private, оскільки рейтинг може оновлюватися на основі зовнішніх даних, і прямий доступ може призвести до некоректних значень.

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

    // Гетери оголошені як public для того, щоб надати зовнішнім класам можливість отримувати (читати) значення приватних (private) змінних класу Series.
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

    // Сетери також оголошені як public, щоб надати зовнішнім класам можливість змінювати значення відповідних приватних (private) змінних класу Series.
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