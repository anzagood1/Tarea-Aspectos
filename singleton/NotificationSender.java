public class NotificationSender {
  //Crea la unica instancia de la clase NotificationSender
    private static NotificationSender instance = new NotificationSender();

  //El constructor de la clase es privado para que no se pueda usar fuera de la misma
    private NotificationSender(){

    }

  //Metodo que retorna la unica instancia de la clase
    public static NotificationSender getInstance(){
        return instance;
    }

  //Metodo que muestra la notificacion ingresada
    public void showNotification(String notificacion){
        System.out.println("Notificacion: " + notificacion);
    }
}
