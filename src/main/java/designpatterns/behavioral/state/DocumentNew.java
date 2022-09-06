package designpatterns.behavioral.state;

public class DocumentNew implements IDocumentState {

    @Override
    public void nextDocumStatus(DocumentContext documentContext) {
        documentContext.setiDocumentState(new DocumentSend());

    }

    @Override
    public void previousDocumStatuc(DocumentContext documentContext) {
        System.out.println("DocumentNew previous Document State NOTHING happens");
    }



    @Override
    public String getStatusName() {

        return StatusName.NEW.getStatusName();
    }

}
