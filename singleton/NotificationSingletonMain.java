public class NotificationSingletonMain {
    public static void main(String[] args) {
        NotificationSender notificacion = NotificationSender.getInstance();

        notificacion.showNotification("Ha recibido un mensaje de Angel del Campo");
    }
}
