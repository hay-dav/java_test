public class TaskManager {

    @Run(description = "Отправка Email сообщения")
    public void sendEmail() {
        System.out.println("sendEmail");
    }

    public void backup() {
        System.out.println("backup");
    }

    public void statistics() {
        System.out.println("statistics");
    }

    @Run(description = "Удаление временных файлов")
    public void deleteTempFiles() {
        System.out.println("deleteTempFiles");
    }
}
