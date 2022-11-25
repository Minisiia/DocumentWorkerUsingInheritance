package document_worker;

public class ExpertDocumentWorker extends ProDocumentWorker{
    @Override
    public void saveDocument() {
        System.out.println("Документ збережено у новому форматі");
    }
}
