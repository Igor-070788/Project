package less4.perechisleniyz;

public enum dogs {
    pit (45), dober(40), corgi(20);

    //private String translation;
    private int weight;

    dogs (int weight) {
        this.weight = weight;
    }

    public int getWeight(){
        return weight;
    }

 /*   dogs(String translation){
        this.translation = translation;
    }

    public String getTranslation(){
        return translation;
    }

    public String toString(){
        return "Расшифровка " + translation;
    }
*/
}
