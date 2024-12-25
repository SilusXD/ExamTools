//public class Student {
//    // Приватные поля
//    private String name;
//    private String surname;
//    private int[] grades = new int[10]; // Массив для хранения оценок
//    private int gradeCount = 0; // Счетчик для отслеживания количества оценок
//
//    // Getter и setter для name
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    // Getter и setter для surname
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    // Getter для grades
//    public int[] getGrades() {
//        return grades;
//    }
//
//    // Метод для добавления новой оценки
//    public void addGrade(int grade) {
//        if (gradeCount < 10) {
//            grades[gradeCount] = grade; // Добавляем оценку, если еще не достигли 10
//            gradeCount++;
//        } else {
//            // Сдвигаем оценки влево и добавляем новую оценку в конец
//            System.arraycopy(grades, 1, grades, 0, 9);
//            grades[9] = grade;
//        }
//    }
//
//    // Метод для расчета среднего балла
//    public double getAverageGrade() {
//        if (gradeCount == 0) return 0; // Если оценок нет, возвращаем 0
//        int sum = 0;
//        for (int i = 0; i < gradeCount; i++) {
//            sum += grades[i];
//        }
//        return (double) sum / gradeCount; // Возвращаем среднее арифметическое
//    }
//
//    // Пример использования класса
//    public static void main(String[] args) {
//        Student student = new Student();
//        student.setName("John");
//        student.setSurname("Doe");
//
//        // Добавляем оценки
//        student.addGrade(85);
//        student.addGrade(90);
//        student.addGrade(78);
//        student.addGrade(92);
//        student.addGrade(88);
//        student.addGrade(76);
//        student.addGrade(95);
//        student.addGrade(89);
//        student.addGrade(84);
//        student.addGrade(91);
//        student.addGrade(87); // Эта оценка заменит первую (85)
//
//        // Выводим информацию о студенте
//        System.out.println("Имя: " + student.getName());
//        System.out.println("Фамилия: " + student.getSurname());
//        System.out.println("Оценки: " + java.util.Arrays.toString(student.getGrades()));
//        System.out.println("Средний балл: " + student.getAverageGrade());
//    }
//}