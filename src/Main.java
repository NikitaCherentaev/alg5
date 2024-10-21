import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            try {
                ProcessBuilder procBuilder = new ProcessBuilder(); // Создаем объект ProcessBuilder
                procBuilder.command("notepad.exe"); // команда запуска блокнота

                Process process = procBuilder.start(); // запуск процесса
                try {
                    Thread.sleep(1000); // Усыпляем поток, на котором запущен наш процесс на 1 секунду
                } catch (InterruptedException e) {
                    e.printStackTrace();// Выводим стекрейс
                }

                process.destroy(); // убийство процесса
            }
            catch (IOException e) {
                e.printStackTrace();// Выводим стекрейс
            }
        }
    }
}