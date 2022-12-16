package hw20221212_classHuman;

public class Human {
    // Определяем свойства класса
    public String town;
    public String name;
    public int yearOfBirth;
    public String jobTitle;

        // Конструктор
    public Human(String town, String name, int yearOfBirth, String jobTitle) {
        if (town != null && !town.isEmpty() && !town.isBlank()) {
            this.town = town;
        } else {
            this.town = "'информация не указана'";
        }
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "'информация не указана'";
        }
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
            if (jobTitle != null && !jobTitle.isEmpty() && !jobTitle.isBlank()) {
            this.jobTitle = jobTitle;
        } else {
            this.jobTitle = "'информация не указана'";
        }
    }

    public String toString() {
        return "Привет! Меня зовут " + this.name + ". Я из города " + this.town + ". Я родился в " + this.yearOfBirth + " году. Работаю на должности " + this.jobTitle + ". Будем знакомы!";
    }

}
