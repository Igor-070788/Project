package less4.perechisleniyz;

public enum dogs {
    pit ("питбуль"), dober("доберман"), corgi("корги");

    private String translation;

    dogs(String translation){
        this.translation = translation;

    }

    public String getTranslation(){
        return translation;

    }

}
