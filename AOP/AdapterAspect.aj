public aspect AdapterAspect {
    private OldPrinter adaptee = new OldPrinter();

    // Intercepta llamadas al método ModernPrinter.print()
    pointcut adapterCall(ModernPrinter printer) :
        execution(void ModernPrinter+.print()) && this(printer);

    // Implementa la lógica del adapter: redirige a OldPrinter.printOld()
    void around(ModernPrinter printer) : adapterCall(printer) {
        adaptee.printOld();
    }
}
