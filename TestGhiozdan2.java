public class TestGhiozdan2 {
    public static void main(String[] args)
    {
        Ghiozdan2 obiect=new Ghiozdan2();
        Caiet2 caiet1=new Caiet2(null);
        Caiet2 caiet5=new Caiet2(null);
        Manual2 manual3=new Manual2(null);
        obiect.addCaiet("caietulMeu");
        obiect.addCaiet("caietMare");
        obiect.addManual("manualul pt java");

        int nrRechizite = obiect.getNrRechizite();
        System.out.println("Numar rechizite: "+ nrRechizite);
        int nrManuale=obiect.getNrManuale();
        System.out.println("Numar manuale: "+ nrManuale);
        int nrCaiete=obiect.getNrCaiete();
        System.out.println("Numar caiete: "+ nrCaiete);
        System.out.println("//////////");

        obiect.listItems();
        System.out.println("//////////");
        obiect.listCaiet();
        System.out.println("//////////");
        obiect.listManual();
    }


}
