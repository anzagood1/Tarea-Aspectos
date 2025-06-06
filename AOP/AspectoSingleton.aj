public aspect SingletonAspect {
    private static NotificationSender instance = null;

    // Punto de corte para la construcción de NotificationSender
    pointcut constructorCall() : call(NotificationSender.new(..));

    // Reemplaza la creación de instancias con una lógica Singleton
    NotificationSender around() : constructorCall() {
        if (instance == null) {
            instance = new NotificationSender();
        }
        return instance;
    }
}
