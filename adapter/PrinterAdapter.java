public interface ModernPrinter {
  void printDocument(String content);
}

// Clase incompatible
public class OldPrinter {
  public void print(String text) {
      System.out.println("Imprimiendo: " + text);
  }
}

// Adaptador
public class PrinterAdapter implements ModernPrinter {
  private OldPrinter oldPrinter;

  public PrinterAdapter(OldPrinter oldPrinter) {
    this.oldPrinter = oldPrinter;
  }

  @Override
  public void printDocument(String content) {
    oldPrinter.print(content); // Delegación
  }
}

public class Main {
  public static void main(String[] args) {
    ModernPrinter printer = new PrinterAdapter(new OldPrinter());
    printer.printDocument("Documento importante de Diseño de Software");
  }
}